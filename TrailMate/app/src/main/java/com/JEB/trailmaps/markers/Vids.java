package com.JEB.trailmaps.markers;
import java.util.*;
import org.osmdroid.views.overlay.*;
import org.osmdroid.util.*;
import android.graphics.drawable.*;
import com.JEB.trailmaps.*;
import android.content.*;

public class Vids
{
	MainActivity main;

	public ItemizedIconOverlay<OverlayItem> vid_location;
	public void vid_locations(final MainActivity main)
	{
		this.main = main;
		/* Create a static ItemizedOverlay showing some Markers on various cities. */
		final ArrayList<OverlayItem> items = new ArrayList<>();
		items.add(new OverlayItem("St Helen 1", "44.31413657001284,-84.39040303230286,0.0", new GeoPoint(44.31413657001284,-84.39040303230286,0.0)));
		items.add(new OverlayItem("St Helen 2", "44.32054754456162,-84.38843250274658,0.0", new GeoPoint(44.32054754456162,-84.38843250274658,0.0)));
		items.add(new OverlayItem("St Helen 3", "44.328332910937156,-84.38065946102142,0.0", new GeoPoint(44.328332910937156,-84.38065946102142,0.0)));
		items.add(new OverlayItem("St Helen 4", "44.334111783517876,-84.3713915348053,0.0", new GeoPoint(44.334111783517876,-84.3713915348053,0.0)));
		items.add(new OverlayItem("St Helen 5", "44.3052577937589,-84.37878012657166,0.0", new GeoPoint(44.3052577937589,-84.37878012657166,0.0)));
		items.add(new OverlayItem("St Helen 6", "44.30149296119629,-84.40732955932617,0.0", new GeoPoint(44.30149296119629,-84.40732955932617,0.0)));
		items.add(new OverlayItem("St Helen 7", "44.30871528928057,-84.40945386886597,0.0", new GeoPoint(44.30871528928057,-84.40945386886597,0.0)));
		items.add(new OverlayItem("St Helen 8", "44.31140743935623,-84.40938234329224,0.0", new GeoPoint(44.31140743935623,-84.40938234329224,0.0)));
		items.add(new OverlayItem("St Helen 9", "44.31610049315129,-84.40958976745605,0.0", new GeoPoint(44.31610049315129,-84.40958976745605,0.0)));
		//items.add(new OverlayItem("St Helen 10", "44.31566933129192,-84.40324366092682,0.0", new GeoPoint(44.31566933129192,-84.40324366092682,0.0)));
		//items.add(new OverlayItem("St Helen 11", "44.32340481472232,-84.40385699272156,0.0", new GeoPoint(44.32340481472232,-84.40385699272156,0.0)));
		items.add(new OverlayItem("St Helen 12", "44.331453930991636,-84.3991219997406,0.0", new GeoPoint(44.331453930991636,-84.3991219997406,0.0)));
		items.add(new OverlayItem("St Helen 13", "44.3377658143277,-84.39594089984894,0.0", new GeoPoint(44.3377658143277,-84.39594089984894,0.0)));
		//items.add(new OverlayItem("St Helen 14", "44.34659363719717,-84.39468383789062,0.0", new GeoPoint(44.34659363719717,-84.39468383789062,0.0)));
		items.add(new OverlayItem("St Helen 14", "44.31408539198396,-84.39061403274536,0.0", new GeoPoint(44.31408539198396,-84.39061403274536,0.0)));
		items.add(new OverlayItem("St Helen 15", "44.32825872073474,-84.36941027641296,0.0", new GeoPoint(44.32825872073474,-84.36941027641296,0.0)));
		items.add(new OverlayItem("St Helen 16", "44.34230969389487,-84.36954617500305,0.0", new GeoPoint(44.34230969389487,-84.36954617500305,0.0)));

		items.add(new OverlayItem("Denton Creek", "44.223142007926974,-84.66991424560547,0.0", new GeoPoint(44.223142007926974,-84.66991424560547,0.0)));

		/* OnTapListener for the Markers, shows a simple Toast. */

		Drawable newMarker = main.getResources().getDrawable(R.drawable.vid);

		this.vid_location = new ItemizedIconOverlay<OverlayItem>(items,newMarker,
			new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {

				private String gpx;



				private int[] mypoint;



				@Override
				public boolean onItemSingleTapUp(final int index,
												 final OverlayItem item) {
					Intent myIntent = new Intent(main, VideoService.class);
					myIntent.putExtra("vid", item.getTitle());
					main.startActivity(myIntent);


					return false;
				}
				@Override
				public boolean onItemLongPress(final int index,
											   final OverlayItem item) {



					return true;
				}
			},main );



	}
}
