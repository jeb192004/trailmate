package com.JEB.trailmaps.markers;
import java.util.*;
import org.osmdroid.views.overlay.*;
import org.osmdroid.util.*;
import com.JEB.trailmaps.*;
import android.os.*;
import android.graphics.drawable.*;
import android.app.*;

public class Image360 extends Activity
{

	public ItemizedIconOverlay<OverlayItem> image360;
	MainActivity main;
		
	public void image_360_locations(MainActivity main)
	{
		this.main = main;

		/* Create a static ItemizedOverlay showing some Markers on various cities. */
		final ArrayList<OverlayItem> items = new ArrayList<>();
		items.add(new OverlayItem("Denton Creek", "44.24730998662618,-84.64402914047241,0.0", new GeoPoint(44.24730998662618,-84.64402914047241,0.0)));
		items.add(new OverlayItem("St Helen 1", "44.315817743446786,-84.3963074684143,0.0", new GeoPoint(44.315817743446786,-84.3963074684143,0.0)));
		items.add(new OverlayItem("St Helen 2", "44.330864275583096,-84.40335631370544,0.0", new GeoPoint(44.330864275583096,-84.40335631370544,0.0)));
		items.add(new OverlayItem("St Helen sand pit", "44.33224950872,-84.40288066864014,0.0", new GeoPoint(44.33224950872,-84.40288066864014,0.0)));
		items.add(new OverlayItem("St Helen 3", "44.334325378563875,-84.39647197723389,0.0", new GeoPoint(44.334325378563875,-84.39647197723389,0.0)));
		items.add(new OverlayItem("St Helen 4", "44.34828411016807,-84.38741683959961,0.0", new GeoPoint(44.34828411016807,-84.38741683959961,0.0)));
		//items.add(new OverlayItem("St Helen 5", "44.34828411016807,-84.38741683959961,0.0", new GeoPoint(44.34828411016807,-84.38741683959961,0.0)));
		items.add(new OverlayItem("St Helen 6", "44.29785330823149,-84.40540909767151,0.0", new GeoPoint(44.29785330823149,-84.40540909767151,0.0)));
		items.add(new OverlayItem("St Helen Mud", "44.33945782076542,-84.36094522476196,0.0", new GeoPoint(44.33945782076542,-84.36094522476196,0.0)));
		items.add(new OverlayItem("St Helen Rocks", "44.34950653982325,-84.38090085983276,0.0", new GeoPoint(44.34950653982325,-84.38090085983276,0.0)));
		items.add(new OverlayItem("St Helen Trailhead 2", "44.358983340627624,-84.37068700790405,0.0", new GeoPoint(44.358983340627624,-84.37068700790405,0.0)));

		/* OnTapListener for the Markers, shows a simple Toast. */

		Drawable newMarker = main.getResources().getDrawable(R.drawable.ic_launcher);


		this.image360 = new ItemizedIconOverlay<OverlayItem>(items,newMarker,
			new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {



				@Override
				public boolean onItemSingleTapUp(final int index,
												 final OverlayItem item) {


					return false;
				}
				@Override
				public boolean onItemLongPress(final int index,
											   final OverlayItem item) {



					return true;
				}
			},this);



	}
	
}
