package com.JEB.trailmaps.markers;
import com.JEB.trailmaps.*;
import java.util.*;
import org.osmdroid.views.overlay.*;
import android.graphics.drawable.*;
import android.content.*;
import android.app.*;
import org.osmdroid.util.*;

public class ActionVids extends Activity
{
	

	public ItemizedIconOverlay<OverlayItem> actionVid;
	MainActivity main;
	public void action_vid_locations(final MainActivity main)
	{
		this.main = main;

		/* Create a static ItemizedOverlay showing some Markers on various cities. */
		final ArrayList<OverlayItem> items = new ArrayList<>();
		items.add(new OverlayItem("St Helen Mudd", "44.34004099534302,-84.35890674591064,0.0", new GeoPoint(44.34004099534302,-84.35890674591064,0.0)));
		items.add(new OverlayItem("St Helen sand pit", "44.33283275498936,-84.40276622772217,0.0", new GeoPoint(44.33283275498936,-84.40276622772217,0.0)));

		/* OnTapListener for the Markers, shows a simple Toast. */

		Drawable newMarker = main.getResources().getDrawable(R.drawable.action_vid);

		this.actionVid = new ItemizedIconOverlay<OverlayItem>(items,newMarker,
			new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {



				@Override
				public boolean onItemSingleTapUp(final int index,
												 final OverlayItem item) {
					Intent myIntent = new Intent(main,VideoService.class);
					myIntent.putExtra("vid", item.getTitle());
					main.startActivity(myIntent);


					return false;
				}
				@Override
				public boolean onItemLongPress(final int index,
											   final OverlayItem item) {



					return true;
				}
			},this );



	}
}
