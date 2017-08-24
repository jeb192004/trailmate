package com.JEB.trailmaps;

import android.app.Activity;
import android.content.Context;
import android.support.v7.widget.RecyclerView;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.List;
import com.squareup.picasso.*;
import java.io.*;
import android.view.View.*;
import android.widget.*;
import android.content.*;
import android.net.*;
import android.os.*;
import android.util.*;
import android.content.res.*;
import android.support.v7.app.*;
import com.JEB.trailmaps.*;
import org.osmdroid.bonuspack.kml.*;
import org.osmdroid.views.overlay.*;
import org.osmdroid.util.*;
import android.view.*;


public class OrvListRecyclerAdapter extends RecyclerView.Adapter<OrvListAdapter> {

    private List<OrvListItems> listItems, filterList;
    private MainActivity mContext;
	//MainActivity main;
	private String gpx;
	KmlFeature.Styler styler;
	
    public OrvListRecyclerAdapter(MainActivity context, List<OrvListItems> listItems) {
        this.listItems = listItems;
        this.mContext = context;
        this.filterList = new ArrayList<OrvListItems>();
        // we copy the original list to the filter list and use it for setting row values
        this.filterList.addAll(this.listItems);

    }

    @Override
    public OrvListAdapter onCreateViewHolder(ViewGroup viewGroup, int i) {

        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.orv_list_item_row, null);
        OrvListAdapter viewHolder = new OrvListAdapter(view);

        return viewHolder;

    }

    @Override
    public void onBindViewHolder(OrvListAdapter customViewHolder, int position) {

        final OrvListItems listItem = filterList.get(position);
        customViewHolder.trailName.setText(listItem.name);
		
		if(listItem.bike.equals("")){
		customViewHolder.picBike.setVisibility(View.GONE);
		}else{
			customViewHolder.picBike.setVisibility(View.VISIBLE);
		}if(listItem.atv.equals("")){
			customViewHolder.picAtv.setVisibility(View.GONE);
		}else{
			customViewHolder.picAtv.setVisibility(View.VISIBLE);
		}if(listItem.utv.equals("")){
			customViewHolder.picUtv.setVisibility(View.GONE);
		}else{
			customViewHolder.picUtv.setVisibility(View.VISIBLE);
		}
		customViewHolder.Gpx.setOnClickListener(new OnClickListener() {

				private KmlDocument kmlDocument;

				private String kmlFile;

				public FolderOverlay listOverlay, atvlistOverlay;

				private InputStream streamDeKml;

				private KmlFeature.Styler styler;

				public BoundingBox bb;

				private String bike_kml, atv_kml, utv_kml;

				private FolderOverlay utvlistOverlay;

				
				@Override
				public void onClick(final View v) {
					/**try{
						gpx = listItem.gpx.toString();
					AssetManager assetManager =v.getContext(). getAssets();

					InputStream in = null;
					OutputStream out = null;
					File file = new File(v.getContext().getFilesDir(), gpx);
					try
					{
						in = assetManager.open(gpx);
						out = v.getContext().openFileOutput(file.getName(), Context.MODE_WORLD_READABLE);

						copyFile(in, out);
						in.close();
						in = null;
						out.flush();
						out.close();
						out = null;
					} catch (Exception e)
					{
						Log.e("tag", e.getMessage());
					}

					Intent intent = new Intent(Intent.ACTION_VIEW);
					intent.setDataAndType(
						Uri.parse("file://" + v.getContext().getFilesDir() + "/" + gpx),
						"application/gpx");

					v.getContext().startActivity(intent);
				
				 } catch (ActivityNotFoundException e) {
			// No application to view, ask to download one
			AlertDialog.Builder builder = new AlertDialog.Builder(v.getContext());
			builder.setTitle("No app to read GPX files found");
			builder.setMessage("Download GPX Viewer?");
			builder.setPositiveButton(("Okay"),
				new DialogInterface.OnClickListener() {
					@Override
					public void onClick(DialogInterface dialog,
										int which) {
						Intent innerIntent = new Intent(
							Intent.ACTION_VIEW);
						innerIntent.setData(Uri.parse("market://search?q=gpx map&c=apps"));
						v.getContext().startActivity(innerIntent);
					}
				});
			builder.setNegativeButton(("Cancel"), null);
			builder.create().show();
		}**/
					bike_kml = listItem.bikeKml.toString();
					atv_kml = listItem.atvKml.toString();
					utv_kml = listItem.utvKml.toString();
					mContext.map.getOverlays().clear();
		if(bike_kml!= null && !bike_kml.isEmpty()){//&&listItem.atv.equals("")&&listItem.utv.equals("")){
					//mContext.map.getOverlays().clear();
					mContext.map.invalidate();
					
					
					styler = new ListKmlStyler();
					kmlDocument = new KmlDocument();
					kmlFile = bike_kml;bike_kml();
					kmlDocument.parseKMLStream(streamDeKml,null);
					listOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(mContext.map, null, styler, kmlDocument);

						kmlDocument.parseKMLStream(streamDeKml,null);
					
					mContext.map.getOverlays().add(listOverlay);
					bb = kmlDocument.mKmlRoot.getBoundingBox();
					mContext.map.zoomToBoundingBox(bb, true);
					mContext.map.getController().setCenter(bb.getCenter());
					mContext.map.invalidate();
					mContext.drawerLayout.closeDrawer(Gravity.RIGHT);
				}
					if(atv_kml != null && !atv_kml.isEmpty()){
						//mContext.map.getOverlays().clear();
						mContext.map.invalidate();
						gpx = listItem.atvKml.toString();

						styler = new KmlAtvStyler();
						kmlDocument = new KmlDocument();
						kmlFile = gpx;atv_kml();
						kmlDocument.parseKMLStream(streamDeKml,null);
						atvlistOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(mContext.map, null, styler, kmlDocument);

						kmlDocument.parseKMLStream(streamDeKml,null);

						mContext.map.getOverlays().add(atvlistOverlay);
						bb = kmlDocument.mKmlRoot.getBoundingBox();
						mContext.map.zoomToBoundingBox(bb, true);
						mContext.map.getController().setCenter(bb.getCenter());
						mContext.map.invalidate();
						mContext.drawerLayout.closeDrawer(Gravity.RIGHT);
					}if(utv_kml != null && !utv_kml.isEmpty()){
						//mContext.map.getOverlays().clear();
						mContext.map.invalidate();
						gpx = listItem.utvKml.toString();

						styler = new KmlUtvStyler();
						kmlDocument = new KmlDocument();
						kmlFile = gpx;utv_kml();
						kmlDocument.parseKMLStream(streamDeKml,null);
						utvlistOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(mContext.map, null, styler, kmlDocument);

						kmlDocument.parseKMLStream(streamDeKml,null);

						mContext.map.getOverlays().add(utvlistOverlay);
						bb = kmlDocument.mKmlRoot.getBoundingBox();
						mContext.map.zoomToBoundingBox(bb, true);
						mContext.map.getController().setCenter(bb.getCenter());
						mContext.map.invalidate();
						mContext.drawerLayout.closeDrawer(Gravity.RIGHT);
					}
					else{}
				
				}

				private void bike_kml()
				{
					AssetManager assetManager=mContext.getAssets();
					streamDeKml = null;
					try {
						streamDeKml=assetManager.open("bike/"+kmlFile);
						kmlDocument.parseKMLStream(streamDeKml, null); // lo mentemos en el mapa
						streamDeKml.close();   // como hemos terminado con el Stream ddel KML ya lo podemos borrar.


					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
}
				private void atv_kml()
				{
					AssetManager assetManager=mContext.getAssets();
					streamDeKml = null;
					try {
						streamDeKml=assetManager.open("atv/"+kmlFile);
						kmlDocument.parseKMLStream(streamDeKml, null); // lo mentemos en el mapa
						streamDeKml.close();   // como hemos terminado con el Stream ddel KML ya lo podemos borrar.


					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
					}
				private void utv_kml()
				{
					AssetManager assetManager=mContext.getAssets();
					streamDeKml = null;
					try {
						streamDeKml=assetManager.open("utv/"+kmlFile);
						kmlDocument.parseKMLStream(streamDeKml, null); // lo mentemos en el mapa
						streamDeKml.close();   // como hemos terminado con el Stream ddel KML ya lo podemos borrar.


					} catch (Exception e) {
						// TODO: handle exception
						e.printStackTrace();
					}
				}
				private void copyFile(InputStream in, OutputStream out) throws IOException
				{
					byte[] buffer = new byte[1024];
					int read;
					while ((read = in.read(buffer)) != -1)
					{
						out.write(buffer, 0, read);
					}
				}
			});
	
	}

    @Override
    public int getItemCount() {
        return (null != filterList ? filterList.size() : 0);
    }



}
