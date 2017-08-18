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
import com.JEB.trailmaps.cache.*;
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
import com.JEB.trailmaps.trails.*;

public class MainActivity extends AppCompatActivity implements CompoundButton.OnCheckedChangeListener
{
//map stuff
	private MyLocationNewOverlay mLocationOverlay;
	private CompassOverlay mCompassOverlay;
	private RotationGestureOverlay mRotationGestureOverlay;
	//private ScaleBarOverlay mScaleBarOverlay;

	private NavigationView navigationView;
	private DrawerLayout drawerLayout;

	//private MapView map;

	private ActionVids action_vids;

	private Image360 image_360;

	private TrailLocations trailLocations;

	private OrvTrailHeads orvTrailheads;

	private SnowTrailHeads snowTrailheads;

	private Vids vid;

	private FolderOverlay bikeOverlay;

	private KmlDocument kmlDocument;

	private InputStream streamDeKml;

	private String kmlFile;

	public MapView map;

	private BikeKml bike_kml;

	private RecyclerView mRecyclerView;

	private OrvList orv_list;

	private OrvListRecyclerAdapter adapter;

	

	

	
	
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
        map.setTileSource(TileSourceFactory.MAPNIK);
		//map.setTileSource(TileSourceFactory.USGS_SAT);
		//map.setTileSource(TileSourceFactory.USGS_TOPO);
		map.setUseDataConnection(true);
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
		
		mRecyclerView = (RecyclerView) findViewById(R.id.card_recycler_view);
		orv_list = new OrvList();
		orv_list.setList(this);
		mRecyclerView.setHasFixedSize(true);
        mRecyclerView.setLayoutManager(new LinearLayoutManager(this));

        adapter = new OrvListRecyclerAdapter(this, orv_list.allorvList);
        mRecyclerView.setAdapter(adapter);
		switches();
		overlays();
		
		
		/**  can't get to work
		mScaleBarOverlay = new ScaleBarOverlay();
		mScaleBarOverlay.setCentred(true);
//play around with these values to get the location on screen in the right place for your applicatio
		mScaleBarOverlay.setScaleBarOffset(24 / 2, 10);
		map.getOverlays().add(this.mScaleBarOverlay);
		**/
		
		navDrawerOne();
		
		
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
					bike_kml = new BikeKml();
					bike_kml.bike_kml_clear(this);
				}
                Log.i("switch_compat", isChecked + "");
                break;
            case R.id.atvswitch:
                Log.i("switch_compat2", isChecked + "");
                break;
			case R.id.utvswitch:
                Log.i("switch_compat2", isChecked + "");
                break;
			case R.id.action_video_switch:
				if(isChecked){
				map.getOverlays().add(action_vids.actionVid);
                Log.i("video_switch", isChecked + "");
				}else{
					map.getOverlays().remove(action_vids.actionVid);
				}
                break;
			case R.id.trail_locations_switch:
				if(isChecked){
					map.getOverlays().add(trailLocations.mMyLocationOverlay);
					Log.i("video_switch", isChecked + "");
				}else{
					map.getOverlays().remove(trailLocations.mMyLocationOverlay);
				}
                break;
			case R.id.orvth_switch:
				if(isChecked){
					map.getOverlays().add(orvTrailheads.mMyTrailHeads);
					Log.i("video_switch", isChecked + "");
				}else{
					map.getOverlays().remove(orvTrailheads.mMyTrailHeads);
				}
                break;
			case R.id.snowth_switch:
				if(isChecked){
					map.getOverlays().add(snowTrailheads.SnowTrailHeads);
					Log.i("video_switch", isChecked + "");
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
		return false;
	}

	
	
	
}
