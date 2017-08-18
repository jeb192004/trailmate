package com.JEB.trailmaps.markers;
import java.util.*;
import org.osmdroid.views.overlay.*;
import org.osmdroid.util.*;
import com.JEB.trailmaps.*;
import android.os.*;
import android.graphics.drawable.*;
import android.app.*;
import android.content.*;
import android.net.*;

public class OrvTrailHeads extends Activity
{

	public ItemizedIconOverlay<OverlayItem> mMyTrailHeads;
	MainActivity main;
	public void trail_heads(final MainActivity main)
	{
		this.main = main;
		final ArrayList<OverlayItem> trailHead = new ArrayList<>();
		trailHead.add(new OverlayItem("Alcona ORV Trailhead 1", "44.60539, -83.74414", new GeoPoint(44.60539, -83.74414)));
		trailHead.add(new OverlayItem("Alcona ORV Trailhead 2", "44.66508, -83.62332", new GeoPoint(44.66508, -83.62332)));
		trailHead.add(new OverlayItem("Alcona ORV Trailhead 3", "44.60281, -83.86313", new GeoPoint(44.60281, -83.86313)));
		//trailHead.add(new OverlayItem("Ambrose Lake to Rose City Trailhead", "44.40757, -84.25241", new GeoPoint(44.40757, -84.25241)));
		trailHead.add(new OverlayItem("Ambrose Lake Trailhead", "44.40715, -84.25210", new GeoPoint(44.40715, -84.25210)));
		//	trailHead.add(new OverlayItem("Atlanta to Hunt Creek MCCCT Trailhead", "45.03305, -84.16251", new GeoPoint(45.03305, -84.16251)));
		trailHead.add(new OverlayItem("Atlanta Trail & Route Trailhead 1", "45.23127, -84.15920", new GeoPoint(45.23127, -84.15920)));
		trailHead.add(new OverlayItem("Atlanta Trail & Route Trailhead 2", "45.03306, -84.16237", new GeoPoint(45.03306, -84.16237)));
		trailHead.add(new OverlayItem("Atlanta Trail & Route Trailhead 3", "45.06989, -83.96234", new GeoPoint(45.06989, -83.96234)));

		trailHead.add(new OverlayItem("Baraga Plains Trailhead", "46.61989, -88.60922", new GeoPoint(46.61989, -88.60922)));
		trailHead.add(new OverlayItem("Bass Lake Motorcycle Trailhead", "46.27251, -87.56468", new GeoPoint(46.27251, -87.56468)));
		trailHead.add(new OverlayItem("Bay City Lake Trailhead", "46.04013, -84.43913", new GeoPoint(46.04013, -84.43913)));
		//	trailHead.add(new OverlayItem("Beaver Creek Trail MCCCT", "44.54303, -84.62101", new GeoPoint(44.54303, -84.62101)));
		trailHead.add(new OverlayItem("Bergland to Sidnaw Route Trailhead", "46.59472, -89.53621", new GeoPoint(46.59472, -89.53621)));
		trailHead.add(new OverlayItem("Big O Motorcycle Trailhead 1", "43.81376, -86.00395", new GeoPoint(43.81376, -86.00395)));
		trailHead.add(new OverlayItem("Big O Motorcycle Trailhead 2", "43.93021, -85.89078", new GeoPoint(43.93021, -85.89078)));
		//	trailHead.add(new OverlayItem("Bill Nicholls Route", "47.02089, -88.70601", new GeoPoint(47.02089, -88.70601)));
		trailHead.add(new OverlayItem("Birch Hill Motorcycle Trailhead", "46.03593, -84.21958", new GeoPoint(46.03593, -84.21958)));
		trailHead.add(new OverlayItem("Black Lake Trail & Route Trailhead", "45.51947, -84.25606", new GeoPoint(45.51947, -84.25606)));
		trailHead.add(new OverlayItem("Black Lake Trail & Route Parking Lot", "45.47985, -84.19773", new GeoPoint(45.47985, -84.19773)));
		trailHead.add(new OverlayItem("Brevort-Trout Lake Motorcycle Trailhead", "46.05516, -84.99154", new GeoPoint(46.05516, -84.99154)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 1", "44.65167, -84.10820", new GeoPoint(44.65167, -84.10820)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 2", "44.64704, -84.03058", new GeoPoint(44.64704, -84.03058)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 3", "44.61702, -84.02616", new GeoPoint(44.61702, -84.02616)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 4", "44.49388, -83.95307", new GeoPoint(44.49388, -83.95307)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 5", "44.46527, -83.90283", new GeoPoint(44.46527, -83.90283)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 6", "44.46048, -84.01811", new GeoPoint(44.46048, -84.01811)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 7", "44.52271, -84.11145", new GeoPoint(44.52271, -84.11145)));
		trailHead.add(new OverlayItem("Bull Gap Trailhead 8", "44.52613, -84.12748", new GeoPoint(44.52613, -84.12748)));
		trailHead.add(new OverlayItem("Bummer's Roost Trailhead", "45.47958, -84.19772", new GeoPoint(45.47958, -84.19772)));

		trailHead.add(new OverlayItem("Cedar Creek Trailhead", "43.36545, -86.11778", new GeoPoint(43.36545, -86.11778)));
		trailHead.add(new OverlayItem("Cranberry Lake Trailhead", "45.96167, -84.00965", new GeoPoint(45.96167, -84.00965)));
		//	trailHead.add(new OverlayItem("Crapo Creek Trail", "44.92624, -84.45835", new GeoPoint(44.92624, -84.45835)));

		trailHead.add(new OverlayItem("Danaher Plains Trailhead", "46.40740, -85.94467", new GeoPoint(46.40740, -85.94467)));
		trailHead.add(new OverlayItem("Days River Route Parking Lot", "45.88903, -87.04606", new GeoPoint(45.88903, -87.04606)));
		trailHead.add(new OverlayItem("Denton Creek Trail & Route Trailhead", "44.24755, -84.64386", new GeoPoint(44.24755, -84.64386)));
		//	trailHead.add(new OverlayItem("Devils Lake Route", "44.98558, -83.48428", new GeoPoint(44.98558, -83.48428)));
		trailHead.add(new OverlayItem("Drummond Island Trail & Route Trailhead 1", "45.96844, -83.61507", new GeoPoint(45.96844, -83.61507)));
		trailHead.add(new OverlayItem("Drummond Island Trail & Route Trailhead 2", "45.94203, -83.54519", new GeoPoint(45.94203, -83.54519)));

		trailHead.add(new OverlayItem("Evart Motorcycle Trailhead", "43.91602, -85.32452", new GeoPoint(43.91602, -85.32452)));

		//	trailHead.add(new OverlayItem("Felch Grade Route", "45.87568, -87.47645", new GeoPoint(45.87568, -87.47645)));
		trailHead.add(new OverlayItem("Foreman Lake Motorcycle Trailhead", "46.04327, -84.17483", new GeoPoint(46.04327, -84.17483)));
		trailHead.add(new OverlayItem("Forest Islands Trail & Route Trailhead 1", "45.43249, -87.36952", new GeoPoint(45.43249, -87.36952)));
		trailHead.add(new OverlayItem("Forest Islands Trail & Route Trailhead 2", "45.62021, -87.25974", new GeoPoint(45.62021, -87.25974)));
		//	trailHead.add(new OverlayItem("Freda Grade Route", "47.09818, -88.65783", new GeoPoint(47.09818, -88.65783)));
		trailHead.add(new OverlayItem("Frederic Trail & Route Trailhead", "44.76904, -84.82176", new GeoPoint(44.76904, -84.82176)));

		//	trailHead.add(new OverlayItem("Geels to Roscommon Route", "44.45770, -84.54733", new GeoPoint(44.45770, -84.54733)));
		trailHead.add(new OverlayItem("Geels Trailhead", "44.42295, -84.48063", new GeoPoint(44.42295, -84.48063)));
		trailHead.add(new OverlayItem("Gladwin Trail & Route Trailhead", "43.97783, -84.20804", new GeoPoint(43.97783, -84.20804)));
		//	trailHead.add(new OverlayItem("Grand Traverse County to Supply Rd. MCCCT", "44.55936, -85.39567", new GeoPoint(44.55936, -85.39567)));
		trailHead.add(new OverlayItem("Grand Traverse Motorcycle Trail & Route Trailhead 1", "44.63988, -85.45639", new GeoPoint(44.63988, -85.45639)));
		trailHead.add(new OverlayItem("Grand Traverse Motorcycle Trail & Route Trailhead 2", "44.67176, -85.37631", new GeoPoint(44.67176, -85.37631)));
		//	trailHead.add(new OverlayItem("Grand Traverse to Leetsville MCCCT", "44.71318, -85.24216", new GeoPoint(44.71318, -85.24216)));

		//	trailHead.add(new OverlayItem("Hancock-Calumet Route", "47.18319, -88.51030", new GeoPoint(47.18319, -88.51030)));
		trailHead.add(new OverlayItem("Holton Loop Motorcycle Trailhead", "43.44047, -86.15555", new GeoPoint(43.44047, -86.15555)));
		trailHead.add(new OverlayItem("Horseshoe Lake Motorcycle Trailhead", "43.50107, -86.10147", new GeoPoint(43.50107, -86.10147)));
		//	trailHead.add(new OverlayItem("Hunt Creek Motorcycle Trail", "44.84834, -84.17023", new GeoPoint(44.84834, -84.17023)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur: River Rd Trailhead", "44.43704, -83.58819", new GeoPoint(44.43704, -83.58819)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur Trailhead 2", "44.41699, -83.35985", new GeoPoint(44.41699, -83.35985)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur Trailhead 3", "44.46510, -83.90283", new GeoPoint(44.46510, -83.90283)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur Trailhead 4", "44.45315, -83.86115", new GeoPoint(44.45315, -83.86115)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur Trailhead 5", "44.45783, -83.77280", new GeoPoint(44.45783, -83.77280)));
		trailHead.add(new OverlayItem("Huron Trail & Huron-Sand Lake Spur Trailhead 6", "44.34115, -83.68362", new GeoPoint(44.34115, -83.68362)));

		trailHead.add(new OverlayItem("Indian Gardens ORV Route Trailhead", "45.53677, -85.00448", new GeoPoint(45.53677, -85.00448)));
		//	trailHead.add(new OverlayItem("Iron River-Marenisco Route", "46.22480, -88.86827", new GeoPoint(46.22480, -88.86827)));

		trailHead.add(new OverlayItem("Kalkaska Trail & Route Trailhead", "44.71332, -84.97034", new GeoPoint(44.71332, -84.97034)));
		trailHead.add(new OverlayItem("Kalkaska Trail & Route Trailhead", "44.85211, -84.94295", new GeoPoint(44.85211, -84.94295)));
		trailHead.add(new OverlayItem("Kalkaska Trail & Route Trailhead", "44.90108, -84.94241", new GeoPoint(44.90108, -84.94241)));
		//	trailHead.add(new OverlayItem("Keweenaw Trail", "47.40662, -88.14624", new GeoPoint(47.40662, -88.14624)));
		trailHead.add(new OverlayItem("Kinross Motorcycle Trailhead", "46.24936, -84.42544", new GeoPoint(46.24936, -84.42544)));

		//	trailHead.add(new OverlayItem("Lake Linden Route", "47.16739, -88.44331", new GeoPoint(47.16739, -88.44331)));
		//	trailHead.add(new OverlayItem("Leetsville to Kalkaska MCCCT", "44.79810, -85.03098", new GeoPoint(44.79810, -85.03098)));
		trailHead.add(new OverlayItem("Leetsville Trailhead", "44.74345, -85.12993", new GeoPoint(44.74345, -85.12993)));
		trailHead.add(new OverlayItem("Leota Trailhead", "44.15270, -84.85838", new GeoPoint(44.15270, -84.85838)));
		trailHead.add(new OverlayItem("Lincoln Hills Motorcycle Trail & Route Trailhead", "44.08827, -85.82551", new GeoPoint(44.08827, -85.82551)));
		trailHead.add(new OverlayItem("Little Manistee Motorcycle Trail & Route Trailhead 1", "44.03839, -85.72306", new GeoPoint(44.03839, -85.72306)));
		trailHead.add(new OverlayItem("Little Manistee Motorcycle Trail & Route Trailhead 2", "43.95807, -85.82748", new GeoPoint(43.95807, -85.82748)));
		trailHead.add(new OverlayItem("Little Manistee Motorcycle Trail & Route Trailhead 3", "44.08801, -85.82537", new GeoPoint(44.08801, -85.82537)));
		trailHead.add(new OverlayItem("Little Manistee Motorcycle Trail & Route Trailhead 4", "44.03285, -85.84264", new GeoPoint(44.03285, -85.84264)));
		trailHead.add(new OverlayItem("Little O Trailhead", "43.93067, -85.89099", new GeoPoint(43.93067, -85.89099)));
		trailHead.add(new OverlayItem("Long Lake Motorcycle Trailhead", "44.34397, -85.38412", new GeoPoint(44.34397, -85.38412)));

		trailHead.add(new OverlayItem("M-20 to Big O MCCCT and White Cloud Loop Trailhead", "43.56898, -85.84766", new GeoPoint(43.56898, -85.84766)));
		//	trailHead.add(new OverlayItem("M-30 North Gladwin MCCCT", "44.07602, -84.28505", new GeoPoint(44.07602, -84.28505)));
		//	trailHead.add(new OverlayItem("M-30 to St. Helen #3 MCCCT", "44.17730, -84.38461", new GeoPoint(44.17730, -84.38461)));
		//	trailHead.add(new OverlayItem("M-55 to 20 Rd. MCCCT", "44.29195, -85.60416", new GeoPoint(44.29195, -85.60416)));
		trailHead.add(new OverlayItem("M-55 to State Rd. MCCCT Trailhead", "44.22474, -85.69857", new GeoPoint(44.22474, -85.69857)));
		//	trailHead.add(new OverlayItem("Marquette-Manistique Trail & Route", "46.28144, -86.58147", new GeoPoint(46.28144, -86.58147)));
		trailHead.add(new OverlayItem("MCCCT Trail to US-131 Trailhead 1", "44.48594, -85.41695", new GeoPoint(44.48594, -85.41695)));
		trailHead.add(new OverlayItem("MCCCT Trail to US-131 Trailhead 2", "44.46611, -85.40680", new GeoPoint(44.46611, -85.40680)));
		trailHead.add(new OverlayItem("The Meadows Trailhead 1", "44.52628, -84.12763", new GeoPoint(44.52628, -84.12763)));
		trailHead.add(new OverlayItem("The Meadows Trailhead 2", "44.61133, -84.27143", new GeoPoint(44.61133, -84.27143)));
		trailHead.add(new OverlayItem("The Meadows Trailhead 3", "44.61130, -84.39079", new GeoPoint(44.61130, -84.39079)));
		//	trailHead.add(new OverlayItem("Meadows Trail-Rose City Trail Connector", "44.50466, -84.20737", new GeoPoint(44.50466, -84.20737)));
		//	trailHead.add(new OverlayItem("Mio to Meadows MCCCT", "44.70348, -84.24871", new GeoPoint(44.70348, -84.24871)));
		trailHead.add(new OverlayItem("Mio Trail & Route Trailhead", "44.74048, -84.22255", new GeoPoint(44.74048, -84.22255)));
		trailHead.add(new OverlayItem("Missaukee Junction Trailhead", "44.31038, -85.41448", new GeoPoint(44.31038, -85.41448)));
		trailHead.add(new OverlayItem("Moss Lake Motorcycle Trailhead", "45.94448, -86.68899", new GeoPoint(45.94448, -86.68899)));

		trailHead.add(new OverlayItem("Newberry-Rexton Motorcycle Trailhead", "46.27712, -85.48796", new GeoPoint(46.27712, -85.48796)));
		trailHead.add(new OverlayItem("North Branch Route Trailhead 1", "44.96889, -84.62397", new GeoPoint(44.96889, -84.62397)));
		trailHead.add(new OverlayItem("North Branch Route Trailhead 2", "44.91404, -84.54585", new GeoPoint(44.91404, -84.54585)));
		trailHead.add(new OverlayItem("North Missaukee & MCCCT Trailhead", "44.49106, -84.95311", new GeoPoint(44.49106, -84.95311)));
		//	trailHead.add(new OverlayItem("North Missaukee Motorcycle, Trail & Route", "44.51036, -85.08656", new GeoPoint(44.51036, -85.08656)));
		trailHead.add(new OverlayItem("Norway Trailhead", "45.82569, -87.73247", new GeoPoint(45.82569, -87.73247)));

		//	trailHead.add(new OverlayItem("Ogemaw Hills to St. Helen Trail", "44.34372, -84.35178", new GeoPoint(44.34372, -84.35178)));
		//	trailHead.add(new OverlayItem("Ogemaw Hills Trail & Route", "44.32825, -84.28773", new GeoPoint(44.32825, -84.28773)));
		trailHead.add(new OverlayItem("Old State House Trail and Route Trailhead", "44.45190, -83.44793", new GeoPoint(44.45190, -83.44793)));
		//	trailHead.add(new OverlayItem("Ottawa East Connector", "46.50279, -88.78030", new GeoPoint(46.50279, -88.78030)));

		trailHead.add(new OverlayItem("Pine Ridge Trailhead", "46.61144, -85.60355", new GeoPoint(46.61144, -85.60355)));
		trailHead.add(new OverlayItem("Pioneer Trailhead 1", "46.59483, -89.53557", new GeoPoint(46.59483, -89.53557)));
		trailHead.add(new OverlayItem("Pioneer Trailhead 2", "46.69705, -89.38939", new GeoPoint(46.69705, -89.38939)));
		trailHead.add(new OverlayItem("Porterfield Lake Motorcycle Trailhead", "46.25715, -87.95246", new GeoPoint(46.25715, -87.95246)));
		//	trailHead.add(new OverlayItem("Powers Arnold Route", "45.87839, -87.47049", new GeoPoint(45.87839, -87.47049)));

		//	trailHead.add(new OverlayItem("Red Bridge to Atlanta MCCCT", "45.29814, -84.30961", new GeoPoint(45.29814, -84.30961)));
		trailHead.add(new OverlayItem("Red Bridge Trail & Route Trailhead", "45.41833, -84.29063", new GeoPoint(45.41833, -84.29063)));
		//	trailHead.add(new OverlayItem("Republic-Champion Route", "46.45861, -87.95393", new GeoPoint(46.45861, -87.95393)));
		//	trailHead.add(new OverlayItem("Rose City Trail", "44.47131, -84.18642", new GeoPoint(44.47131, -84.18642)));

		trailHead.add(new OverlayItem("Sandtown Motorcycle Trailhead", "46.22486, -85.61221", new GeoPoint(46.22486, -85.61221)));
		trailHead.add(new OverlayItem("Silver Creek Trailhead", "46.39567, -85.55200", new GeoPoint(46.39567, -85.55200)));
		trailHead.add(new OverlayItem("Silver Lake ORV Area Parking Lot", "43.68252, -86.50001", new GeoPoint(43.68252, -86.50001)));
		trailHead.add(new OverlayItem("Soo-Raco Route Parking Lot", "46.47640, -84.42313", new GeoPoint(46.47640, -84.42313)));
		//	trailHead.add(new OverlayItem("Stateline Route", "46.06257, -88.47013", new GeoPoint(46.06257, -88.47013)));
		//	trailHead.add(new OverlayItem("St. Helen to Geels Trail & MCCCT", "44.40333, -84.42246", new GeoPoint(44.40333, -84.42246)));
		trailHead.add(new OverlayItem("St. Helen Trail & Route Parking Lot 1", "44.35912, -84.37015", new GeoPoint(44.35912, -84.37015)));
		trailHead.add(new OverlayItem("St. Helen Trail & Route Parking Lot 2", "44.30643, -84.40953", new GeoPoint(44.30643, -84.40953)));
		trailHead.add(new OverlayItem("St. Ignace-Trout Lake Route Trailhead 1", "46.05488, -84.99195", new GeoPoint(46.05488, -84.99195)));
		trailHead.add(new OverlayItem("St. Ignace-Trout Lake Route Parking Lot", "45.87319, -84.73428", new GeoPoint(45.87319, -84.73428)));

		trailHead.add(new OverlayItem("Tin Cup Spring Motorcycle Trail & Route Trailhead", "43.96177, -85.72115", new GeoPoint(43.96177, -85.72115)));
		trailHead.add(new OverlayItem("Tomahawk Trail A Loop and Indian River Route Trailhead", "45.37399, -84.62955", new GeoPoint(45.37399, -84.62955)));
		trailHead.add(new OverlayItem("Tomahawk Motorcycle Trail B Loop Trailhead", "45.28257, -84.73582", new GeoPoint(45.28257, -84.73582)));
		//	trailHead.add(new OverlayItem("Tomahawk Motorcycle Trail C Loop", "45.24399, -84.69094", new GeoPoint(45.24399, -84.69094)));
		//	trailHead.add(new OverlayItem("Tomahawk to Kalkaska MCCCT", "45.18445, -84.81729", new GeoPoint(45.18445, -84.81729)));
		//	trailHead.add(new OverlayItem("Tomahawk to Red Bridge MCCCT", "45.38371, -84.50024", new GeoPoint(45.38371, -84.50024)));
		trailHead.add(new OverlayItem("Two-Heart Trailhead", "46.61160, -85.60401", new GeoPoint(46.61160, -85.60401)));

		//	trailHead.add(new OverlayItem("US-131 to North Missaukee Trail", "44.45893, -85.31908", new GeoPoint(44.45893, -85.31908)));

		trailHead.add(new OverlayItem("West Higgins Trail and Route Trailhead", "44.43610, -84.79602", new GeoPoint(44.43610, -84.79602)));
		//	trailHead.add(new OverlayItem("Wisconsin-Bond Falls Route", "46.27088, -89.17963", new GeoPoint(46.27088, -89.17963)));


		Drawable newMarker = main.getResources().getDrawable(R.drawable.parking);



		/* OnTapListener for the Markers, shows a simple Toast. */
		this.mMyTrailHeads = new ItemizedIconOverlay<OverlayItem>(trailHead,newMarker,
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

	}

}
