package com.JEB.trailmaps.markers;
import java.util.*;
import org.osmdroid.views.overlay.*;
import android.graphics.drawable.*;
import com.JEB.trailmaps.*;
import android.content.*;
import android.net.*;
import org.osmdroid.util.*;

public class SnowTrailHeads
{

	public ItemizedIconOverlay<OverlayItem> SnowTrailHeads;
	
	MainActivity main;
	public void snow_trail_heads(final MainActivity main)
	{
		this.main = main;
		/* Create a static ItemizedOverlay showing some Markers on various cities. */
		final ArrayList<OverlayItem> snowtrailHead = new ArrayList<>();
		snowtrailHead.add(new OverlayItem("Alcona Trailhead 1", "44.67990, -83.59822", new GeoPoint(44.67990, -83.59822)));
		snowtrailHead.add(new OverlayItem("Alcona Trailhead 2", "44.66546, -83.62361", new GeoPoint(44.66546, -83.62361)));
		snowtrailHead.add(new OverlayItem("Alcona Trailhead 3", "44.60552, -83.74423", new GeoPoint(44.60552, -83.74423)));
		snowtrailHead.add(new OverlayItem("Alcona Trailhead 4", "44.55087, -83.51654", new GeoPoint(44.55087, -83.51654)));

		snowtrailHead.add(new OverlayItem("Alpena Trailhead 1", "45.08733, -83.45089", new GeoPoint(45.08733, -83.45089)));
		snowtrailHead.add(new OverlayItem("Alpena Trailhead 2", "45.06118, -83.47684", new GeoPoint(45.06118, -83.47684)));
		snowtrailHead.add(new OverlayItem("Alpena Trailhead 3", "45.02085, -83.55650", new GeoPoint(45.02085, -83.55650)));

		snowtrailHead.add(new OverlayItem("Antrim Trailhead 1", "44.96761, -84.97836", new GeoPoint(44.96761, -84.97836)));
		snowtrailHead.add(new OverlayItem("Antrim Trailhead 2", "44.90092, -84.94074", new GeoPoint(44.90092, -84.94074)));

		snowtrailHead.add(new OverlayItem("Charlevoix Trailhead", "45.12455, -85.11469", new GeoPoint(45.12455, -85.11469)));

		snowtrailHead.add(new OverlayItem("Barry Trailhead", "42.66071, -85.53340", new GeoPoint(42.66071, -85.53340)));

		snowtrailHead.add(new OverlayItem("Cass Trailhead", "42.05746, -86.17314", new GeoPoint(42.05746, -86.17314)));

		snowtrailHead.add(new OverlayItem("Cheboygan Trailhead", "45.37397, -84.63030", new GeoPoint(45.37397, -84.63030)));

		snowtrailHead.add(new OverlayItem("Clare Trailhead", "44.07863, -84.82839", new GeoPoint(44.07863, -84.82839)));

		snowtrailHead.add(new OverlayItem("Crawford Trailhead 1", "44.76928, -84.82223", new GeoPoint(44.76928, -84.82223)));
		snowtrailHead.add(new OverlayItem("Crawford Trailhead 2", "44.66329, -84.76644", new GeoPoint(44.66329, -84.76644)));
		snowtrailHead.add(new OverlayItem("Crawford Trailhead 3", "44.78259, -84.74395", new GeoPoint(44.78259, -84.74395)));
		snowtrailHead.add(new OverlayItem("Crawford Trailhead 4", "44.70986, -84.68765", new GeoPoint(44.70986, -84.68765)));

		snowtrailHead.add(new OverlayItem("Emmet Trailhead", "45.78007, -84.73005", new GeoPoint(45.78007, -84.73005)));

		snowtrailHead.add(new OverlayItem("Gladwin Trailhead", "44.13062, -84.59753", new GeoPoint(44.13062, -84.59753)));

		snowtrailHead.add(new OverlayItem("Grand Traverse Trailhead 1", "44.69199, -85.41227", new GeoPoint(44.69199, -85.41227)));
		snowtrailHead.add(new OverlayItem("Grand Traverse Trailhead 2", "44.69812, -85.51610", new GeoPoint(44.69812, -85.51610)));
		snowtrailHead.add(new OverlayItem("Grand Traverse Trailhead 3", "44.64061, -85.45684", new GeoPoint(44.64061, -85.45684)));
		snowtrailHead.add(new OverlayItem("Grand Traverse Trailhead 4", "44.64381, -85.65199", new GeoPoint(44.64381, -85.65199)));

		snowtrailHead.add(new OverlayItem("Iosco Trailhead 1", "44.45249, -83.44749", new GeoPoint(44.45249, -83.44749)));
		snowtrailHead.add(new OverlayItem("Iosco Trailhead 2", "44.34051, -83.68365", new GeoPoint(44.34051, -83.68365)));
		snowtrailHead.add(new OverlayItem("Iosco Trailhead 3", "44.46174, -83.35613", new GeoPoint(44.46174, -83.35613)));
		snowtrailHead.add(new OverlayItem("Iosco Trailhead 4", "44.45354, -83.86018", new GeoPoint(44.45354, -83.86018)));
		snowtrailHead.add(new OverlayItem("Iosco Trailhead 5", "44.32701, -83.56273", new GeoPoint(44.32701, -83.56273)));
		snowtrailHead.add(new OverlayItem("Iosco Trailhead 6", "44.41766, -83.35988", new GeoPoint(44.41766, -83.35988)));

		snowtrailHead.add(new OverlayItem("Kalkaska Trailhead 1", "44.71320, -84.96985", new GeoPoint(44.71320, -84.96985)));
		snowtrailHead.add(new OverlayItem("Kalkaska Trailhead 2", "44.85147, -84.92852", new GeoPoint(44.85147, -84.92852)));
		snowtrailHead.add(new OverlayItem("Kalkaska Trailhead 3", "44.72801, -85.20388", new GeoPoint(44.42295, -84.48063)));

		snowtrailHead.add(new OverlayItem("Kent Trailhead", "43.18309, -85.56637", new GeoPoint(43.18309, -85.56637)));

		snowtrailHead.add(new OverlayItem("Lake Trailhead 1", "44.04480, -85.84337", new GeoPoint(44.04480, -85.84337)));
		snowtrailHead.add(new OverlayItem("Lake Trailhead 2", "43.95982, -85.82938", new GeoPoint(43.95982, -85.82938)));
		snowtrailHead.add(new OverlayItem("Lake Trailhead 3", "44.08891, -85.82659", new GeoPoint(44.08891, -85.82659)));
		snowtrailHead.add(new OverlayItem("Lake Trailhead 4", "44.03081, -85.84317", new GeoPoint(44.03081, -85.84317)));
		snowtrailHead.add(new OverlayItem("Lake Trailhead 5", "44.03816, -85.72262", new GeoPoint(44.03816, -85.72262)));
		snowtrailHead.add(new OverlayItem("Lake Trailhead 6", "43.92956, -85.89468", new GeoPoint(43.92956, -85.89468)));

		snowtrailHead.add(new OverlayItem("Manistee Trailhead 1", "44.37356, -86.01746", new GeoPoint(44.37356, -86.01746)));
		snowtrailHead.add(new OverlayItem("Manistee Trailhead 2", "44.22221, -85.90082", new GeoPoint(44.22221, -85.90082)));

		snowtrailHead.add(new OverlayItem("Mecosta Trailhead", "43.69710, -85.46400", new GeoPoint(43.69710, -85.46400)));

		snowtrailHead.add(new OverlayItem("Missaukee Trailhead", "44.49105, -84.95248", new GeoPoint(44.49105, -84.95248)));

		snowtrailHead.add(new OverlayItem("Montcalm Trailhead", "43.39694, -85.47033", new GeoPoint(43.39694, -85.47033)));

		snowtrailHead.add(new OverlayItem("Montmorency Trailhead 1", "45.03291, -84.16267", new GeoPoint(45.03291, -84.16267)));
		snowtrailHead.add(new OverlayItem("Montmorency Trailhead 2", "45.07341, -83.96175", new GeoPoint(45.07341, -83.96175)));

		snowtrailHead.add(new OverlayItem("Muskegon Trailhead 1", "43.18383, -85.94686", new GeoPoint(43.18383, -85.94686)));
		snowtrailHead.add(new OverlayItem("Muskegon Trailhead 2", "43.36424, -86.11820", new GeoPoint(43.36424, -86.11820)));
		snowtrailHead.add(new OverlayItem("Muskegon Trailhead 3", "43.23831, -86.04746", new GeoPoint(43.23831, -86.04746)));
		snowtrailHead.add(new OverlayItem("Muskegon Trailhead 4", "43.20208, -86.17120", new GeoPoint(43.20208, -86.17120)));
		snowtrailHead.add(new OverlayItem("Muskegon Trailhead 5", "43.33499, -86.09607", new GeoPoint(43.33499, -86.09607)));

		snowtrailHead.add(new OverlayItem("Newaygo Trailhead 1", "43.58329, -85.84272", new GeoPoint(43.58329, -85.84272)));
		snowtrailHead.add(new OverlayItem("Newaygo Trailhead 2", "43.46940, -85.77586", new GeoPoint(43.46940, -85.77586)));

		snowtrailHead.add(new OverlayItem("Oceana Trailhead 1", "43.66483, -86.29827", new GeoPoint(43.66483, -86.29827)));
		snowtrailHead.add(new OverlayItem("Oceana Trailhead 2", "43.54470, -86.10050", new GeoPoint(43.54470, -86.10050)));
		snowtrailHead.add(new OverlayItem("Oceana Trailhead 3", "43.68850, -86.37249", new GeoPoint(43.68850, -86.37249)));
		snowtrailHead.add(new OverlayItem("Oceana Trailhead 4", "43.61146, -86.36473", new GeoPoint(43.61146, -86.36473)));
		snowtrailHead.add(new OverlayItem("Oceana Trailhead 5", "43.50630, -86.34478", new GeoPoint(43.50630, -86.34478)));

		snowtrailHead.add(new OverlayItem("Ogemaw Trailhead 1", "44.46519, -83.90302", new GeoPoint(44.46519, -83.90302)));
		snowtrailHead.add(new OverlayItem("Ogemaw Trailhead 2", "44.41845, -84.22714", new GeoPoint(44.41845, -84.22714)));

		snowtrailHead.add(new OverlayItem("Oscoda Trailhead 1", "44.52230, -84.11139", new GeoPoint(44.52230, -84.11139)));
		snowtrailHead.add(new OverlayItem("Oscoda Trailhead 2", "44.72485, -84.29288", new GeoPoint(44.72485, -84.29288)));
		snowtrailHead.add(new OverlayItem("Oscoda Trailhead 3", "44.61095, -84.27170", new GeoPoint(44.61095, -84.27170)));
		snowtrailHead.add(new OverlayItem("Oscoda Trailhead 4", "44.64483, -84.15813", new GeoPoint(44.64483, -84.15813)));
		snowtrailHead.add(new OverlayItem("Oscoda Trailhead 5", "44.74034, -84.22341", new GeoPoint(44.74034, -84.22341)));

		snowtrailHead.add(new OverlayItem("Otsego Trailhead 1", "45.02651, -84.69555", new GeoPoint(45.02651, -84.69555)));
		snowtrailHead.add(new OverlayItem("Otsego Trailhead 2", "44.99364, -84.67619", new GeoPoint(44.99364, -84.67619)));
		snowtrailHead.add(new OverlayItem("Otsego Trailhead 3", "44.91389, -84.54620", new GeoPoint(44.91389, -84.54620)));

		snowtrailHead.add(new OverlayItem("Ottawa Trailhead", "43.04785, -85.80788", new GeoPoint(43.04785, -85.80788)));

		snowtrailHead.add(new OverlayItem("Presque Isle Trailhead 1", "45.39805, -84.03481", new GeoPoint(45.39805, -84.03481)));
		snowtrailHead.add(new OverlayItem("Presque Isle Trailhead 2", "45.47924, -84.19871", new GeoPoint(45.47924, -84.19871)));
		snowtrailHead.add(new OverlayItem("Presque Isle Trailhead 3", "45.48778, -84.04197", new GeoPoint(45.48778, -84.04197)));

		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 1", "44.35909, -84.36978", new GeoPoint(44.35909, -84.36978)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 2", "44.49027, -84.58154", new GeoPoint(44.49027, -84.58154)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 3", "44.24737, -84.64394", new GeoPoint(44.24737, -84.64394)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 4", "44.30611, -84.40990", new GeoPoint(44.30611, -84.40990)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 5", "44.36281, -84.40246", new GeoPoint(44.36281, -84.40246)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 6", "44.43604, -84.79625", new GeoPoint(44.43604, -84.79625)));
		snowtrailHead.add(new OverlayItem("Roscommon Trailhead 7", "44.28933, -84.69279", new GeoPoint(44.28933, -84.69279)));

		snowtrailHead.add(new OverlayItem("Van Buren Trailhead 1", "42.21068, -86.15658", new GeoPoint(42.21068, -86.15658)));
		snowtrailHead.add(new OverlayItem("Van Buren Trailhead 2", "42.41136, -86.26287", new GeoPoint(42.41136, -86.26287)));

		snowtrailHead.add(new OverlayItem("Wexford Trailhead 1", "44.46423, -85.40677", new GeoPoint(44.46423, -85.40677)));
		snowtrailHead.add(new OverlayItem("Wexford Trailhead 2", "44.22449, -85.70018", new GeoPoint(44.22449, -85.70018)));
		snowtrailHead.add(new OverlayItem("Wexford Trailhead 3", "44.18767, -85.49782", new GeoPoint(44.18767, -85.49782)));
		snowtrailHead.add(new OverlayItem("Wexford Trailhead 4", "44.28648, -85.60026", new GeoPoint(44.28648, -85.60026)));
		snowtrailHead.add(new OverlayItem("Wexford Trailhead 5", "44.48584, -85.41686", new GeoPoint(44.48584, -85.41686)));



		Drawable newMarker = main.getResources().getDrawable(R.drawable.parking);



		/* OnTapListener for the Markers, shows a simple Toast. */
		this.SnowTrailHeads = new ItemizedIconOverlay<OverlayItem>(snowtrailHead,newMarker,
			new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {

				private String gpx;



				private int[] mypoint;

				@Override
				public boolean onItemSingleTapUp(final int index,
												 final OverlayItem item) {

					Intent intent = new Intent(android.content.Intent.ACTION_VIEW, 
											   Uri.parse("http://maps.google.com/maps?daddr="+item.getSnippet()));
					main.startActivity(intent);
					return false;
				}
				@Override
				public boolean onItemLongPress(final int index,
											   final OverlayItem item) {

					return false;
				}
				
			},main );

		/**mMyLocationOverlay.setFocusItemsOnTap(false);
		 //mMyLocationOverlay.setFocusedItem(0);
		 //https://github.com/osmdroid/osmdroid/issues/317
		 //you can override the drawing characteristics with this
		 mMyLocationOverlay.setMarkerBackgroundColor(Color.BLUE);
		 mMyLocationOverlay.setMarkerTitleForegroundColor(Color.WHITE);
		 mMyLocationOverlay.setMarkerDescriptionForegroundColor(Color.WHITE);
		 mMyLocationOverlay.setDescriptionBoxPadding(15);
		 **/

	}
}
