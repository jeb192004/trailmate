package com.JEB.trailmaps.markers;
import java.util.*;
import org.osmdroid.views.overlay.*;
import org.osmdroid.util.*;
import com.JEB.trailmaps.*;
import android.os.*;
import android.graphics.drawable.*;
import android.app.*;

public class TrailLocations extends Activity
{

	public ItemizedIconOverlay<OverlayItem> mMyLocationOverlay;

	MainActivity main;
	public void all_orv_trails(MainActivity main)
	{
		this.main = main;
		/* Create a static ItemizedOverlay showing some Markers on various cities. */
		final ArrayList<OverlayItem> items = new ArrayList<>();
		items.add(new OverlayItem("20 Rd. to Grand Traverse County MCCCT", "44.42992, -85.55026", new GeoPoint(44.42992, -85.55026)));

		items.add(new OverlayItem("Alcona ORV Trail", "44.58328, -83.84701", new GeoPoint(44.58328, -83.84701)));
		items.add(new OverlayItem("Ambrose Lake to Ogemaw Hills Trail", "44.35986, -84.24487", new GeoPoint(44.35986, -84.24487)));
		items.add(new OverlayItem("Ambrose Lake to Rose City Trail", "44.42502, -84.22044", new GeoPoint(44.42502, -84.22044)));
		items.add(new OverlayItem("Ambrose Lake Trail", "44.39401, -84.22554", new GeoPoint(44.39401, -84.22554)));
		items.add(new OverlayItem("Atlanta to Hunt Creek MCCCT", "44.99242, -84.19940", new GeoPoint(44.99242, -84.19940)));
		items.add(new OverlayItem("Atlanta Trail & Route", "45.12484, -84.08847", new GeoPoint(45.12484, -84.08847)));

		items.add(new OverlayItem("Baraga Plains Trail", "46.64050, -88.59256", new GeoPoint(46.64050, -88.59256)));
		items.add(new OverlayItem("Bass Lake Motorcycle Trail", "46.27822, -87.58377", new GeoPoint(46.27822, -87.58377)));
		items.add(new OverlayItem("Bay City Lake Trail", "46.04301, -84.44753", new GeoPoint(46.04301, -84.44753)));
		items.add(new OverlayItem("Beaver Creek Trail MCCCT", "44.54303, -84.62101", new GeoPoint(44.54303, -84.62101)));
		items.add(new OverlayItem("Bergland to Sidnaw Route", "46.48228, -89.08634", new GeoPoint(46.48228, -89.08634)));
		items.add(new OverlayItem("Big Bear Trail", "44.93764, -84.35178", new GeoPoint(44.93764, -84.35178)));
		items.add(new OverlayItem("Big O Motorcycle Trail", "43.90609, -86.00188", new GeoPoint(43.90609, -86.00188)));
		items.add(new OverlayItem("Bill Nicholls Route", "47.02089, -88.70601", new GeoPoint(47.02089, -88.70601)));
		items.add(new OverlayItem("Birch Hill Motorcycle Trail", "46.03518, -84.21033", new GeoPoint(46.03518, -84.21033)));
		items.add(new OverlayItem("Black Lake Trail & Route", "45.55158, -84.27833", new GeoPoint(45.55158, -84.27833)));
		items.add(new OverlayItem("Brevort-Trout Lake Motorcycle Trail", "46.13009, -85.06410", new GeoPoint(46.13009, -85.06410)));
		items.add(new OverlayItem("Bull Gap Trail", "44.56584, -84.02241", new GeoPoint(44.56584, -84.02241)));
		items.add(new OverlayItem("Bummer's Roost Trail", "45.48470, -84.21223", new GeoPoint(45.48470, -84.21223)));

		items.add(new OverlayItem("Cedar Creek Trail", "43.36082, -86.12045", new GeoPoint(43.36082, -86.12045)));
		items.add(new OverlayItem("Cranberry Lake Trail", "45.97617, -84.02222", new GeoPoint(45.97617, -84.02222)));
		items.add(new OverlayItem("Crapo Creek Trail", "44.92624, -84.45835", new GeoPoint(44.92624, -84.45835)));

		items.add(new OverlayItem("Danaher Plains Trail", "46.45012, -85.89886", new GeoPoint(46.45012, -85.89886)));
		items.add(new OverlayItem("Days River Route", "45.92608, -87.04434", new GeoPoint(45.92608, -87.04434)));
		items.add(new OverlayItem("Denton Creek Trail & Route", "44.22752, -84.63495", new GeoPoint(44.22752, -84.63495)));
		items.add(new OverlayItem("Devils Lake Route", "44.98558, -83.48428", new GeoPoint(44.98558, -83.48428)));
		items.add(new OverlayItem("Drummond Island Trail & Route", "45.98727, -83.59216", new GeoPoint(45.98727, -83.59216)));

		items.add(new OverlayItem("Evart Motorcycle Trail", "43.96643, -85.32700", new GeoPoint(43.96643, -85.32700)));

		items.add(new OverlayItem("Felch Grade Route", "45.87568, -87.47645", new GeoPoint(45.87568, -87.47645)));
		items.add(new OverlayItem("Foreman Lake Motorcycle Trail", "46.02704, -84.14782", new GeoPoint(46.02704, -84.14782)));
		items.add(new OverlayItem("Forest Islands Trail & Route", "45.53345, -87.37821", new GeoPoint(45.53345, -87.37821)));
		items.add(new OverlayItem("Freda Grade Route", "47.09818, -88.65783", new GeoPoint(47.09818, -88.65783)));
		items.add(new OverlayItem("Frederic Trail & Route", "44.75331, -84.80444", new GeoPoint(44.75331, -84.80444)));

		items.add(new OverlayItem("Geels to Roscommon Route", "44.45770, -84.54733", new GeoPoint(44.45770, -84.54733)));
		items.add(new OverlayItem("Geels Trail", "44.42455, -84.50566", new GeoPoint(44.42455, -84.50566)));
		items.add(new OverlayItem("Gladwin Trail & Route", "43.98304, -84.20748", new GeoPoint(43.98304, -84.20748)));
		items.add(new OverlayItem("Grand Traverse County to Supply Rd. MCCCT", "44.55936, -85.39567", new GeoPoint(44.55936, -85.39567)));
		items.add(new OverlayItem("Grand Traverse Motorcycle Trail & Route", "44.59886, -85.40432", new GeoPoint(44.59886, -85.40432)));
		items.add(new OverlayItem("Grand Traverse to Leetsville MCCCT", "44.71318, -85.24216", new GeoPoint(44.71318, -85.24216)));

		items.add(new OverlayItem("Hancock-Calumet Route", "47.18319, -88.51030", new GeoPoint(47.18319, -88.51030)));
		items.add(new OverlayItem("Holton Loop Motorcycle Trail", "43.42737, -86.15794", new GeoPoint(43.42737, -86.15794)));
		items.add(new OverlayItem("Horseshoe Lake Motorcycle Trail", "43.50594, -86.09138", new GeoPoint(43.50594, -86.09138)));
		items.add(new OverlayItem("Hunt Creek Motorcycle Trail", "44.84834, -84.17023", new GeoPoint(44.84834, -84.17023)));
		items.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur", "44.41861, -83.62227", new GeoPoint(44.41861, -83.62227)));

		items.add(new OverlayItem("Indian Gardens ORV Route", "45.59190, -85.00318", new GeoPoint(45.59190, -85.00318)));
		items.add(new OverlayItem("Iron River-Marenisco Route", "46.22480, -88.86827", new GeoPoint(46.22480, -88.86827)));

		items.add(new OverlayItem("Kalkaska Trail & Route", "44.70659, -84.92917", new GeoPoint(44.70659, -84.92917)));
		items.add(new OverlayItem("Keweenaw Trail", "47.40662, -88.14624", new GeoPoint(47.40662, -88.14624)));
		items.add(new OverlayItem("Kinross Motorcycle Trail", "46.24936, -84.42544", new GeoPoint(46.24936, -84.42544)));

		items.add(new OverlayItem("Lake Linden Route", "47.16739, -88.44331", new GeoPoint(47.16739, -88.44331)));
		items.add(new OverlayItem("Leetsville to Kalkaska MCCCT", "44.79810, -85.03098", new GeoPoint(44.79810, -85.03098)));
		items.add(new OverlayItem("Leetsville Trail", "44.78466, -85.12517", new GeoPoint(44.78466, -85.12517)));
		items.add(new OverlayItem("Leota Trail", "44.17643, -84.85461", new GeoPoint(44.17643, -84.85461)));
		items.add(new OverlayItem("Lincoln Hills Motorcycle Trail & Route", "44.12587, -85.75451", new GeoPoint(44.12587, -85.75451)));
		items.add(new OverlayItem("Little Manistee Motorcycle Trail & Route", "44.03597, -85.78404", new GeoPoint(44.03597, -85.78404)));
		items.add(new OverlayItem("Little O Trail", "43.96916, -85.93959", new GeoPoint(43.96916, -85.93959)));
		items.add(new OverlayItem("Long Lake Motorcycle Trail", "44.34927, -85.36856", new GeoPoint(44.34927, -85.36856)));

		items.add(new OverlayItem("M-20 to Big O MCCCT and White Cloud Loop", "43.71407, -85.93908", new GeoPoint(43.71407, -85.93908)));
		items.add(new OverlayItem("M-30 North Gladwin MCCCT", "44.07602, -84.28505", new GeoPoint(44.07602, -84.28505)));
		items.add(new OverlayItem("M-30 to St. Helen #3 MCCCT", "44.17730, -84.38461", new GeoPoint(44.17730, -84.38461)));
		items.add(new OverlayItem("M-55 to 20 Rd. MCCCT", "44.29195, -85.60416", new GeoPoint(44.29195, -85.60416)));
		items.add(new OverlayItem("M-55 to State Rd. MCCCT", "44.16352, -85.65673", new GeoPoint(44.16352, -85.65673)));
		items.add(new OverlayItem("Marquette-Manistique Trail & Route", "46.28144, -86.58147", new GeoPoint(46.28144, -86.58147)));
		items.add(new OverlayItem("MCCCT Trail to US-131", "44.48762, -85.41338", new GeoPoint(44.48762, -85.41338)));
		items.add(new OverlayItem("The Meadows Trail", "44.61000, -84.24380", new GeoPoint(44.61000, -84.24380)));
		items.add(new OverlayItem("Meadows Trail-Rose City Trail Connector", "44.50466, -84.20737", new GeoPoint(44.50466, -84.20737)));
		items.add(new OverlayItem("Mio to Meadows MCCCT", "44.70348, -84.24871", new GeoPoint(44.70348, -84.24871)));
		items.add(new OverlayItem("Mio Trail & Route", "44.77268, -84.17106", new GeoPoint(44.77268, -84.17106)));
		items.add(new OverlayItem("Missaukee Junction Trail", "44.32070, -85.43066", new GeoPoint(44.32070, -85.43066)));
		items.add(new OverlayItem("Moss Lake Motorcycle Trail", "45.95057, -86.67179", new GeoPoint(45.95057, -86.67179)));

		items.add(new OverlayItem("Newberry-Rexton Motorcycle Trail", "46.24279, -85.38997", new GeoPoint(46.24279, -85.38997)));
		items.add(new OverlayItem("North Branch Route", "44.93932, -84.53446", new GeoPoint(44.93932, -84.53446)));
		items.add(new OverlayItem("North Missaukee & MCCCT", "44.49464, -84.93051", new GeoPoint(44.49464, -84.93051)));
		items.add(new OverlayItem("North Missaukee Motorcycle, Trail & Route", "44.51036, -85.08656", new GeoPoint(44.51036, -85.08656)));
		items.add(new OverlayItem("Norway Trail", "45.83725, -87.79426", new GeoPoint(45.83725, -87.79426)));

		items.add(new OverlayItem("Ogemaw Hills to St. Helen Trail", "44.34372, -84.35178", new GeoPoint(44.34372, -84.35178)));
		items.add(new OverlayItem("Ogemaw Hills Trail & Route", "44.32825, -84.28773", new GeoPoint(44.32825, -84.28773)));
		items.add(new OverlayItem("Old State House Trail and Route", "44.47622, -83.46639", new GeoPoint(44.47622, -83.46639)));
		items.add(new OverlayItem("Ottawa East Connector", "46.50279, -88.78030", new GeoPoint(46.50279, -88.78030)));

		items.add(new OverlayItem("Pine Ridge Trail", "46.64207, -85.66578", new GeoPoint(46.64207, -85.66578)));
		items.add(new OverlayItem("Pioneer Trail", "46.66645, -89.39207", new GeoPoint(46.66645, -89.39207)));
		items.add(new OverlayItem("Porterfield Lake Motorcycle Trail", "46.26218, -87.92948", new GeoPoint(46.26218, -87.92948)));
		items.add(new OverlayItem("Powers Arnold Route", "45.87839, -87.47049", new GeoPoint(45.87839, -87.47049)));

		items.add(new OverlayItem("Red Bridge to Atlanta MCCCT", "45.29814, -84.30961", new GeoPoint(45.29814, -84.30961)));
		items.add(new OverlayItem("Red Bridge Trail & Route", "45.42712, -84.31789", new GeoPoint(45.42712, -84.31789)));
		items.add(new OverlayItem("Republic-Champion Route", "46.45861, -87.95393", new GeoPoint(46.45861, -87.95393)));
		items.add(new OverlayItem("Rose City Trail", "44.47131, -84.18642", new GeoPoint(44.47131, -84.18642)));

		items.add(new OverlayItem("Sandtown Motorcycle Trail", "46.23869, -85.62505", new GeoPoint(46.23869, -85.62505)));
		items.add(new OverlayItem("Silver Creek Trail", "46.43366, -85.62923", new GeoPoint(46.43366, -85.62923)));
		items.add(new OverlayItem("Silver Lake ORV Area", "43.68830, -86.50879", new GeoPoint(43.68830, -86.50879)));
		items.add(new OverlayItem("Soo-Raco Route", "46.41889, -84.50993", new GeoPoint(46.41889, -84.50993)));
		items.add(new OverlayItem("Stateline Route", "46.06257, -88.47013", new GeoPoint(46.06257, -88.47013)));
		items.add(new OverlayItem("St. Helen to Geels Trail & MCCCT", "44.40333, -84.42246", new GeoPoint(44.40333, -84.42246)));
		items.add(new OverlayItem("St. Helen Trail & Route", "44.28895, -84.42407", new GeoPoint(44.28895, -84.42407)));
		items.add(new OverlayItem("St. Ignace-Trout Lake Route", "46.06313, -84.96012", new GeoPoint(46.06313, -84.96012)));

		items.add(new OverlayItem("Tin Cup Spring Motorcycle Trail & Route", "43.98517, -85.68473", new GeoPoint(43.98517, -85.68473)));
		items.add(new OverlayItem("Tomahawk Trail A Loop and Indian River Route", "45.34062, -84.66788", new GeoPoint(45.34062, -84.66788)));
		items.add(new OverlayItem("Tomahawk Motorcycle Trail B Loop", "45.30613, -84.82718", new GeoPoint(45.30613, -84.82718)));
		items.add(new OverlayItem("Tomahawk Motorcycle Trail C Loop", "45.24399, -84.69094", new GeoPoint(45.24399, -84.69094)));
		items.add(new OverlayItem("Tomahawk to Kalkaska MCCCT", "45.18445, -84.81729", new GeoPoint(45.18445, -84.81729)));
		items.add(new OverlayItem("Tomahawk to Red Bridge MCCCT", "45.38371, -84.50024", new GeoPoint(45.38371, -84.50024)));
		items.add(new OverlayItem("Two-Heart Trail", "46.65589, -85.52858", new GeoPoint(46.65589, -85.52858)));

		items.add(new OverlayItem("US-131 to North Missaukee Trail", "44.45893, -85.31908", new GeoPoint(44.45893, -85.31908)));

		items.add(new OverlayItem("West Higgins Trail and Route", "44.54018, -84.75082", new GeoPoint(44.54018, -84.75082)));
		items.add(new OverlayItem("White Cloud Loop", "43.65396, -85.85425", new GeoPoint(43.65396, -85.85425)));
		items.add(new OverlayItem("Wisconsin-Bond Falls Route", "46.27088, -89.17963", new GeoPoint(46.27088, -89.17963)));



		/* OnTapListener for the Markers, shows a simple Toast. */
		Drawable newMarker = main.getResources().getDrawable(R.drawable.info);


		this.mMyLocationOverlay = new ItemizedIconOverlay<OverlayItem>(items,newMarker,
			new ItemizedIconOverlay.OnItemGestureListener<OverlayItem>() {

				private String gpx;



				private int[] mypoint;



				@Override
				public boolean onItemSingleTapUp(final int index,
												 final OverlayItem item) {

					/**trailInfoLayout = (LinearLayout)findViewById(R.id.trail_info_layout);
					 trailNameInfo = (TextView)findViewById(R.id.trail_name);
					 trailInfoLayout.setVisibility(View.VISIBLE);
					 trailNameInfo.setText(item.getTitle());
					 mMapView.setBuiltInZoomControls(false);**/
					return false;
				}
				@Override
				public boolean onItemLongPress(final int index,
											   final OverlayItem item) {


					//trailInfoLayout.setVisibility(View.GONE);
					return true;
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
