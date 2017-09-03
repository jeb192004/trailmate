package com.JEB.trailmaps;

import android.app.*;
import android.os.*;
import android.content.*;
import org.osmdroid.config.*;
import android.preference.*;
import org.osmdroid.views.*;
import org.osmdroid.tileprovider.tilesource.*;
import org.osmdroid.api.*;
import org.osmdroid.util.*;
import com.JEB.trailmaps.MainActivity.*;
import android.widget.*;
import android.graphics.*;
import android.graphics.drawable.*;
import org.osmdroid.views.overlay.mylocation.*;
import org.osmdroid.views.overlay.compass.*;
import org.osmdroid.views.overlay.gestures.*;
import org.osmdroid.views.overlay.*;
import android.support.design.widget.*;
import android.view.*;
import android.net.*;
import com.facebook.FacebookSdk;
import android.support.v4.widget.*;
import android.support.v7.app.*;
import android.support.v7.widget.*;
import android.support.v7.widget.Toolbar;
import android.support.v7.app.ActionBarActivity;
import android.util.*;
import java.util.*;
import com.JEB.trailmaps.markers.*;
import com.JEB.trailmaps.kmlStyler.*;
import org.osmdroid.bonuspack.kml.*;
import java.io.*;
import android.content.res.*;
import com.JEB.trailmaps.mx_trails.*;
import org.osmdroid.tileprovider.*;
import android.app.AlertDialog;
import android.content.DialogInterface;
import android.widget.SeekBar;
import android.widget.SeekBar.OnSeekBarChangeListener;
import org.osmdroid.tileprovider.cachemanager.CacheManager;
import com.facebook.login.widget.*;
import org.osmdroid.views.overlay.infowindow.*;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener,OnSeekBarChangeListener,
View.OnClickListener
{

//map stuff
	private MyLocationNewOverlay mLocationOverlay;
	private CompassOverlay mCompassOverlay;
	private RotationGestureOverlay mRotationGestureOverlay;
	//private ScaleBarOverlay mScaleBarOverlay;
	
	public DrawerLayout drawerLayout;

	//private MapView map;

	private ActionVids action_vids;
	private Image360 image_360;

	private TrailLocations trailLocations;
	private OrvTrailHeads orvTrailheads;
	private SnowTrailHeads snowTrailheads;

	private Vids vid;
	public MapView map;

	private BikeKml bike_kml;

	private RecyclerView mRecyclerView;

	private OrvList orv_list;

	private OrvListRecyclerAdapter adapter;

	private SwitchCompat mapnik_switch, sat_switch, topo_switch, map_data_switch,
	mapbox_switch;
	private AtvKml atv_kml;

	private AlertDialog alertDialog;

	private SeekBar zoom_max, zoom_min;
	private TextView cache_estimate;
	private Button executeJob,cancel;
	private AlertDialog downloadPrompt;
	CacheManager mgr;
	private String cache_east, cache_north, cache_south, cache_west,
	mapStyle;

	private SharedPreferences prefs;
	SharedPreferences.Editor editor;

	private UtvKml utv_kml;

	private ImageButton followMe;

	private PowerManager pm;
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
		
		final Context ctx = getApplicationContext();
        //important! set your user agent to prevent getting banned from the osm servers  
        //Configuration.getInstance().load(ctx, PreferenceManager.getDefaultSharedPreferences(ctx));
        setContentView(R.layout.main);
		
//load map
        map = (MapView) findViewById(R.id.map);
		mgr = new CacheManager(map);
       
//zoom controls	
		//map.setBuiltInZoomControls(true);
        map.setMultiTouchControls(true);
//set default start location and zoom level
		IMapController mapController = map.getController();
        mapController.setZoom(9);
        GeoPoint startPoint = new GeoPoint(43.628709,-84.785487);
        mapController.setCenter(startPoint);
//my location
		this.mLocationOverlay = new MyLocationNewOverlay(new GpsMyLocationProvider(ctx),map);
		this.mLocationOverlay.enableMyLocation();
		map.getOverlays().add(mLocationOverlay);
//compass overlay	
		this.mCompassOverlay = new CompassOverlay(ctx, new InternalCompassOrientationProvider(ctx), map);
		this.mCompassOverlay.enableCompass();
		map.getOverlays().add(this.mCompassOverlay);
//rotation gesture overlay		
		mRotationGestureOverlay = new RotationGestureOverlay(ctx, map);
		mRotationGestureOverlay.setEnabled(true);
		map.getOverlays().add(this.mRotationGestureOverlay);
//load list
		mRecyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
		orv_list = new OrvList();
		orv_list.setList(this);
		mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new OrvListRecyclerAdapter(this, orv_list.allorvList);
        mRecyclerView.setAdapter(adapter);
		Button fb = (Button)findViewById(R.id.fb); 
		fb.setOnClickListener(new View.OnClickListener() {

				private Intent fIntent;
				public void onClick(View v) {
					try {
						MainActivity.this.getPackageManager().getPackageInfo("com.facebook.katana", 0);
						fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1731877297109570"));
					} catch (Exception e) {
						fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/ORV-TrailMate-1731877297109570/?slog=61&seq=1766569984&rk=0&fbtype=274&refid=46"));
					}
					startActivity(fIntent);
				}
			});
		switches();
		overlays();
		navDrawerOne();
		prefs = getSharedPreferences("com.JEB.trailmaps", MODE_PRIVATE);
		editor = prefs.edit();
		preferences();
		followMe = (ImageButton)findViewById(R.id.follow_me);
		followMe.setImageResource(R.drawable.follow);
		pm = (PowerManager) getSystemService(Context.POWER_SERVICE);
		final PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.SCREEN_BRIGHT_WAKE_LOCK, "My Tag");
        followMe.setOnClickListener(new View.OnClickListener()
			{

				private boolean follow;


				@Override
				public void onClick(View v)
				{

					try{
						if (follow)
						{
							mLocationOverlay.disableFollowLocation();
							wl.release();
							followMe.setImageResource(R.drawable.follow);
						}
						else{


							map.getController().animateTo(mLocationOverlay.getMyLocation());

							mLocationOverlay.enableFollowLocation();
							wl.acquire();
							followMe.setImageResource(R.drawable.follow1);

						}
						follow = !follow;
					}catch(Exception ex){
						Toast.makeText(getApplicationContext(),"Searching for location...\nOr your GPS is not turned on",Toast.LENGTH_SHORT).show();
					}
				}
			});
    }

	private void switches()
	{
		SwitchCompat mx_switch = (SwitchCompat) findViewById(R.id.mx_switch);
        mx_switch.setSwitchPadding(40);
        mx_switch.setOnCheckedChangeListener(this);
		
        SwitchCompat atv_switch = (SwitchCompat) findViewById(R.id.atvswitch);
        atv_switch.setSwitchPadding(40);
        atv_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat utv_switch = (SwitchCompat) findViewById(R.id.utvswitch);
        utv_switch.setSwitchPadding(40);
        utv_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat action_video_switch = (SwitchCompat) findViewById(R.id.action_video_switch);
        action_video_switch.setSwitchPadding(40);
        action_video_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat trailLocation_switch = (SwitchCompat) findViewById(R.id.trail_locations_switch);
        trailLocation_switch.setSwitchPadding(40);
        trailLocation_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat ORVtrailHead_switch = (SwitchCompat) findViewById(R.id.orvth_switch);
        ORVtrailHead_switch.setSwitchPadding(40);
        ORVtrailHead_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat snowTrailHead_switch = (SwitchCompat) findViewById(R.id.snowth_switch);
        snowTrailHead_switch.setSwitchPadding(40);
        snowTrailHead_switch.setOnCheckedChangeListener(this);
		
		SwitchCompat vid_switch = (SwitchCompat) findViewById(R.id.video_switch);
        vid_switch.setSwitchPadding(40);
        vid_switch.setOnCheckedChangeListener(this);
		
		mapnik_switch = (SwitchCompat) findViewById(R.id.mapnik_switch);
        mapnik_switch.setSwitchPadding(40);
        mapnik_switch.setOnCheckedChangeListener(this);
		
		sat_switch = (SwitchCompat) findViewById(R.id.sat_switch);
        sat_switch.setSwitchPadding(40);
        sat_switch.setOnCheckedChangeListener(this);
		
		topo_switch = (SwitchCompat) findViewById(R.id.topo_switch);
        topo_switch.setSwitchPadding(40);
        topo_switch.setOnCheckedChangeListener(this);
		
		mapbox_switch = (SwitchCompat) findViewById(R.id.mapbox_switch);
        mapbox_switch.setSwitchPadding(40);
        mapbox_switch.setOnCheckedChangeListener(this);
		
		map_data_switch = (SwitchCompat) findViewById(R.id.map_data_switch);
        map_data_switch.setSwitchPadding(40);
		map_data_switch.setChecked(true);
        map_data_switch.setOnCheckedChangeListener(this);
	}

	


	private void navDrawerOne()
	{
		//Initializing NavigationView
		Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
		setSupportActionBar(toolbar);
        

							//Replacing the main content with ContentFragment Which is our Inbox View;
						
						/**
							try {
								MainActivity.this.getPackageManager().getPackageInfo("com.facebook.katana", 0);
								fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("fb://page/1731877297109570"));
							} catch (Exception e) {
								fIntent = new Intent(Intent.ACTION_VIEW, Uri.parse("https://m.facebook.com/ORV-TrailMate-1731877297109570/?slog=61&seq=1766569984&rk=0&fbtype=274&refid=46"));
							}
							startActivity(fIntent);
							return true;
						**/
			
		// Initializing Drawer Layout and ActionBarToggle
        drawerLayout = (DrawerLayout) findViewById(R.id.drawer);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this,drawerLayout,toolbar,R.string.openDrawer, R.string.closeDrawer){

            @Override
            public void onDrawerClosed(View drawerView) {
                // Code here will be triggered once the drawer closes as we dont want anything to happen so we leave this blank
                super.onDrawerClosed(drawerView);
            }

            @Override
            public void onDrawerOpened(View drawerView) {
                // Code here will be triggered once the drawer open as we dont want anything to happen so we leave this blank

                super.onDrawerOpened(drawerView);
            }
        };

        //Setting the actionbarToggle to drawer layout
        drawerLayout.setDrawerListener(actionBarDrawerToggle);

        //calling sync state is necessay or else your hamburger icon wont show up
        actionBarDrawerToggle.syncState();
		
	}
	
	
	
	@Override
    public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
        switch (buttonView.getId()) {
            case R.id.mx_switch:
				if(isChecked){
					bike_kml = new BikeKml();
					bike_kml.bike_kml(this);
				}
				else{
					bike_kml.bike_kml_clear(this);
				}
                Log.i("bike overlay switch", isChecked + "");
                break;
            case R.id.atvswitch:
				if(isChecked){
					atv_kml = new AtvKml();
					atv_kml.atv_kml(this);
				}
				else{
					atv_kml.atv_kml_clear(this);
				}
                Log.i("atv overlay switch", isChecked + "");
                break;
			case R.id.utvswitch:
				if(isChecked){
					utv_kml = new UtvKml();
					utv_kml.utv_kml(this);
				}
				else{
					utv_kml.utv_kml_clear(this);
				}
                Log.i("utv overlay switch", isChecked + "");
                break;
			case R.id.action_video_switch:
				if(isChecked){
				map.getOverlays().add(action_vids.actionVid);
                Log.i("random video" + "switch", isChecked + "");
				}else{
					map.getOverlays().remove(action_vids.actionVid);
				}
                break;
			case R.id.trail_locations_switch:
				if(isChecked){
					map.getOverlays().add(trailLocations.mMyLocationOverlay);
					Log.i("orv trail" + "switch", isChecked + "");
				}else{
					map.getOverlays().remove(trailLocations.mMyLocationOverlay);
				}
                break;
			case R.id.orvth_switch:
				if(isChecked){
					map.getOverlays().add(orvTrailheads.mMyTrailHeads);
					Log.i("orv trailhead"+"switch", isChecked + "");
				}else{
					map.getOverlays().remove(orvTrailheads.mMyTrailHeads);
				}
                break;
			case R.id.snowth_switch:
				if(isChecked){
					map.getOverlays().add(snowTrailheads.SnowTrailHeads);
					Log.i("snowmobile trailhead switch", isChecked + "");
				}else{
					map.getOverlays().remove(snowTrailheads.SnowTrailHeads);
				}
                break;
			case R.id.video_switch:
				if(isChecked){
					map.getOverlays().add(vid.vid_location);
					Log.i("video_switch", isChecked + "");
				}else{
					map.getOverlays().remove(vid.vid_location);
				}
                break;
			case R.id.mapnik_switch:
				if(isChecked){
					sat_switch.setChecked(false);
					topo_switch.setChecked(false);
					mapbox_switch.setChecked(false);
					map.setTileSource(TileSourceFactory.MAPNIK);
					map_data_switch.setChecked(true);
					map.invalidate();
					editor.putString("map_style", "mapnik");editor.commit();
				}
				else{
					map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
					map.setUseDataConnection(true);
					map.invalidate();
				}
                Log.i("mapnik switch", isChecked + "");
                break;
			case R.id.sat_switch:
				if(isChecked){
					mapnik_switch.setChecked(false);
					topo_switch.setChecked(false);
					mapbox_switch.setChecked(false);
					map.setTileSource(TileSourceFactory.USGS_SAT);
					map_data_switch.setChecked(true);
					map.invalidate();
					editor.putString("map_style", "sat");editor.commit();
				}
				else{
					map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
					map.setUseDataConnection(true);
					map.invalidate();
				}
                Log.i("satellite switch", isChecked + "");
                break;
			case R.id.topo_switch:
				if(isChecked){
					mapnik_switch.setChecked(false);
					sat_switch.setChecked(false);
					mapbox_switch.setChecked(false);
					map.setTileSource(TileSourceFactory.USGS_TOPO);
					map_data_switch.setChecked(true);
					map.invalidate();
					editor.putString("map_style", "topo");editor.commit();
				}
				else{
					map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
					map.setUseDataConnection(true);
					map.invalidate();
				}
                Log.i("topo switch", isChecked + "");
                break;
			case R.id.map_data_switch:
				if(isChecked){
					editor.putBoolean("map_data", true);editor.commit();
					map.setUseDataConnection(true);
					map.invalidate();
				}
				else{
					editor.putBoolean("map_data", false);editor.commit();
					map.setUseDataConnection(false);
					map.invalidate();
				}
                Log.i("topo switch", isChecked + "");
                break;
			case R.id.mapbox_switch:
				if(isChecked){
					mapnik_switch.setChecked(false);
					sat_switch.setChecked(false);
					topo_switch.setChecked(false);
					final MapBoxTileSource tileSource = new MapBoxTileSource();
//option 1, load your settings from the manifest
					//tileSource.retrieveAccessToken(this);
					//tileSource.retrieveMapBoxMapId(this);
//option 2, provide them programmatically
					tileSource.setAccessToken("pk.eyJ1IjoiamViMTkyMDA0IiwiYSI6ImNpbWNyODZyaDAwMmZ1MWx2dHdzcHQ5M2EifQ.IZsMnB3wOYFIaX1A5sy7Mw");
					tileSource.setMapboxMapid("mapbox.mapbox-terrain-v2");
					map.setTileSource(tileSource);
					map_data_switch.setChecked(true);
					map.invalidate();
					editor.putString("map_style", "mapbox_terrain");editor.commit();
				}
				else{
					map.setTileSource(TileSourceFactory.DEFAULT_TILE_SOURCE);
					map.setUseDataConnection(true);
					map.invalidate();
				}
                Log.i("mapbox terrain switch", isChecked + "");
                break;
        }}

	
	private void overlays()
	{
		action_vids = new ActionVids();
		action_vids.action_vid_locations(this);
		
		image_360 = new Image360();
		image_360.image_360_locations(this);
		
		trailLocations = new TrailLocations();
		trailLocations.all_orv_trails(this);
		
		orvTrailheads = new OrvTrailHeads();
		orvTrailheads.trail_heads(this);
		
		snowTrailheads = new SnowTrailHeads();
		snowTrailheads.snow_trail_heads(this);
		
		vid = new Vids();
		vid.vid_locations(this);
		
		
		
	}
    public void onResume(){
        super.onResume();
        //this will refresh the osmdroid configuration on resuming.
        //if you make changes to the configuration, use 
        //SharedPreferences prefs = PreferenceManager.getDefaultSharedPreferences(this);
        //Configuration.getInstance().save(this, prefs);
        //Configuration.getInstance().load(this, PreferenceManager.getDefaultSharedPreferences(this));
    }
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		int menuToUse = R.menu.main;

		MenuInflater inflater = getMenuInflater();
		inflater.inflate(menuToUse, menu);
		
		return super.onCreateOptionsMenu(menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(android.view.MenuItem item) {
		if (item != null && item.getItemId() == R.id.btnMyMenu) {
			if (drawerLayout.isDrawerOpen(Gravity.RIGHT)) {
				drawerLayout.closeDrawer(Gravity.RIGHT);
			} else {
				drawerLayout.openDrawer(Gravity.RIGHT);
			}
			return true;
		}
		if (item != null && item.getItemId() == R.id.cache) {
			showCacheManagerDialog();
			return true;
		}
		return false;
	}

	
	@Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.executeJob:
                updateEstimate(true);
                break;
			
        }
    }
	private void showCacheManagerDialog(){

        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
			MainActivity.this);


        // set title
        alertDialogBuilder.setTitle("Map Download");
		alertDialogBuilder.setMessage(R.string.cache);
		alertDialogBuilder.setCancelable(false);
        alertDialogBuilder.setPositiveButton("Ok", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
					downloadJobAlert();
				}
			}
        );
		alertDialogBuilder.setNegativeButton("Cancel", new DialogInterface.OnClickListener() {
				public void onClick(DialogInterface dialog, int id) {
				alertDialog.dismiss();
				}
			}
        );

        // create alert dialog
        alertDialog = alertDialogBuilder.create();

        // show it
        alertDialog.show();


        //mgr.possibleTilesInArea(mMapView.getBoundingBox(), 0, 18);
		// mgr.
    }

    private void downloadJobAlert() {
        //prompt for input params
        AlertDialog.Builder builder = new AlertDialog.Builder(MainActivity.this);

        View view = View.inflate(getApplicationContext(), R.layout.sample_cache_input, null);

        BoundingBox boundingBox = map.getBoundingBox();
        zoom_max=(SeekBar) view.findViewById(R.id.slider_zoom_max);
        zoom_max.setMax(map.getMaxZoomLevel());
        zoom_max.setOnSeekBarChangeListener(MainActivity.this);


        zoom_min=(SeekBar) view.findViewById(R.id.slider_zoom_min);
        zoom_min.setMax(map.getMaxZoomLevel());
        zoom_min.setProgress(map.getMinZoomLevel());
        zoom_min.setOnSeekBarChangeListener(MainActivity.this);
        
        cache_east = boundingBox.getLonEast() +"";
        
        cache_north =boundingBox.getLatNorth() +"";
        
        cache_south = boundingBox.getLatSouth()  +"";
        
        cache_west = boundingBox.getLonWest()  +"";
        cache_estimate = (TextView) view.findViewById(R.id.cache_estimate);
		
        
        cache_estimate = (TextView) view.findViewById(R.id.cache_estimate);

        //change listeners for both validation and to trigger the download estimation
        
        executeJob= (Button) view.findViewById(R.id.executeJob);
        executeJob.setOnClickListener(MainActivity.this);
		
        builder.setView(view);
        builder.setCancelable(true);
		
        builder.setOnCancelListener(new DialogInterface.OnCancelListener() {
				@Override
				public void onCancel(DialogInterface dialog) {
					cache_east=null;
					cache_south=null;
					cache_estimate=null;
					cache_north=null;
					cache_west=null;
					executeJob=null;
					zoom_min=null;
					zoom_max=null;
				}
			});
        downloadPrompt=builder.create();
        downloadPrompt.show();


    }

    /**
     * if true, start the job
     * if false, just update the dialog box
     */
    private void updateEstimate(boolean startJob) {
        try {
            if (cache_east != null &&
				cache_west != null &&
				cache_north != null &&
				cache_south != null &&
				zoom_max != null &&
				zoom_min != null) {
                double n = Double.parseDouble(cache_north);
                double s = Double.parseDouble(cache_south);
                double e = Double.parseDouble(cache_east);
                double w = Double.parseDouble(cache_west);

                int zoommin = zoom_min.getProgress();
                int zoommax = zoom_max.getProgress();
                //nesw
                BoundingBox bb= new BoundingBox(n, e, s, w);
                int tilecount = mgr.possibleTilesInArea(bb, zoommin, zoommax);
                cache_estimate.setText(tilecount + " tiles");
                if (startJob)
                {
                    if ( downloadPrompt!=null) {
                        downloadPrompt.dismiss();
                        downloadPrompt=null;
                    }

                    //this triggers the download
                    mgr.downloadAreaAsync(MainActivity.this, bb, zoommin, zoommax, new CacheManager.CacheManagerCallback() {
							@Override
							public void onTaskComplete() {
								map_data_switch.setChecked(false);
								Toast.makeText(MainActivity.this, "Download complete!", Toast.LENGTH_LONG).show();
							}

							@Override
							public void onTaskFailed(int errors) {
								Toast.makeText(MainActivity.this, "Download complete with " + errors + " errors", Toast.LENGTH_LONG).show();
							}

							@Override
							public void updateProgress(int progress, int currentZoomLevel, int zoomMin, int zoomMax) {
								//NOOP since we are using the build in UI
							}

							@Override
							public void downloadStarted() {
								//NOOP since we are using the build in UI
							}

							@Override
							public void setPossibleTilesInArea(int total) {
								//NOOP since we are using the build in UI
							}
						});
                }

            }
        }catch (Exception ex){
            ex.printStackTrace();
        }
    }

    private void showCurrentCacheInfo() {
        Toast.makeText(MainActivity.this, "Calculating..." ,Toast.LENGTH_SHORT).show();
        new Thread(new Runnable() {
				@Override
				public void run() {
					final AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(
                        MainActivity.this);


					// set title
					alertDialogBuilder.setTitle("Cache Manager")
                        .setMessage("Cache Capacity (bytes): " + mgr.cacheCapacity() + "\n"+
									"Cache Usage (bytes): " + mgr.currentCacheUsage());

					// set dialog message
					alertDialogBuilder.setItems(new CharSequence[]{

							"Cancel"
                        }, new DialogInterface.OnClickListener() {
                            public void onClick(DialogInterface dialog, int which) {
                                dialog.dismiss();
                            }
                        }
					);




					runOnUiThread(new Runnable() {
							@Override
							public void run() {
								// show it
								// create alert dialog
								final AlertDialog alertDialog = alertDialogBuilder.create();
								alertDialog.show();
							}
						});

				}
			}).start();



    }

    @Override
    public void onProgressChanged(SeekBar seekBar, int progress, boolean fromUser) {
        updateEstimate(false);
    }

    @Override
    public void onStartTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onStopTrackingTouch(SeekBar seekBar) {

    }

    @Override
    public void onPause(){
        super.onPause();
        if (alertDialog!=null && alertDialog.isShowing()){
            alertDialog.dismiss();
        }
        if (downloadPrompt!=null && downloadPrompt.isShowing()){
            downloadPrompt.dismiss();
        }
    }
	
	
	private void preferences()
	{
//map stile
		mapStyle = prefs.getString("map_style", null);
		if (mapStyle != null && mapStyle != null ){
		if(mapStyle.equals("mapnik")){
				mapnik_switch.setChecked(true);
			}if(mapStyle.equals("sat")){
				sat_switch.setChecked(true);
			}if(mapStyle.equals("topo")){
				topo_switch.setChecked(true);
			}if(mapStyle.equals("mapbox_terrain")){
				mapbox_switch.setChecked(true);
			}
			else if(mapStyle.equals(null) ){
				mapnik_switch.setChecked(true);
			}}
//data connection
		if(prefs.getBoolean("map_data",true)){
			map_data_switch.setChecked(true);
			map.setUseDataConnection(true);
			map.invalidate();
		}else{
			map_data_switch.setChecked(false);
			map.setUseDataConnection(false);
			map.invalidate();
		}

		
	}
	
	
}
