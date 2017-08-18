package com.JEB.trailmaps;
import java.util.*;
import android.support.v7.widget.*;
import com.JEB.trailmaps.*;

public class OrvList
{

	

	public RecyclerView mRecyclerView;

	public ArrayList<OrvListItems> allorvList;

	public OrvListRecyclerAdapter adapter;
	MainActivity main;
	public void setList(MainActivity main) {

		this.main = main;
        allorvList = new ArrayList<OrvListItems>();

        OrvListItems items = new OrvListItems();

		items = new OrvListItems();items.setData("20 Rd. to Grand Traverse County MCCCT", "20.gpx", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Alcona ORV Trail", "Alcona.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake to Ogemaw Hills Trail", "Ambrose_Lake_to_Ogemaw_Hills_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake to Rose City Trail", "Ambrose_Lake_to_Rose_City_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake Trail", "Ambrose_Lake_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Atlanta to Hunt Creek MCCCT", "Atlanta_to_Hunt_Creek_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Atlanta Trail & Route", "Atlanta_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Baraga Plains Trail", "Baraga_Plains_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bass Lake Motorcycle Trail", "Bass_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bay City Lake Trail", "Bay_City_Lake_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Beaver Creek Trail MCCCT", "Beaver_Creek_Trail_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Bergland to Sidnaw Route", "Bergland_to_Sidnaw_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Big Bear Trail", "Big_Bear_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Big O Motorcycle Trail", "Big_O_Motorcycle_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bill Nicholls Route", "Bill_Nicholls_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Birch Hill Motorcycle Trail", "Birch_Hill_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Black Lake Trail & Route", "Black_Lake_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Brevort-Trout Lake Motorcycle Trail", "Brevort_Trout_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bull Gap Trail", "Bull_Gap_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bummer's Roost Trail", "Bummers_Roost_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Cedar Creek Trail", "Cedar_Creek_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Cranberry Lake Trail", "Cranberry_Lake_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Crapo Creek Trail", "Crapo_Creek_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Danaher Plains Trail", "Danaher_Plains_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Days River Route", "days_river.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Denton Creek Trail & Route", "denton_creek_trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Devils Lake Route", "Devils_Lake_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Drummond Island Trail & Route", "Drummond_Island_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Evart Motorcycle Trail", "Evart_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Felch Grade Route", "Felch_Grade_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Foreman Lake Motorcycle Trail", "Foreman_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Forest Islands Trail & Route", "Forest_Islands_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Freda Grade Route", "Freda_Grade_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Frederic Trail & Route", "Frederic_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Geels to Roscommon Route", "Geels_to_Roscommon_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Geels Trail", "Geels_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Gladwin Trail & Route", "Gladwin_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse County to Supply Rd. MCCCT", "Grand_Traverse_County_to_Supply_Rd_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse Motorcycle Trail & Route", "Grand_Traverse_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse to Leetsville MCCCT", "Grand_Traverse_to_Leetsville_MCCCT.gpx", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("Hancock-Calumet Route", "Hancock_to_Calumet_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Holton Loop Motorcycle Trail", "Holton_Loop_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Horseshoe Lake Motorcycle Trail", "Horseshoe_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Hunt Creek Motorcycle Trail", "Hunt_Creek_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Huron Trail & Huron-Sand Lake Spur", "huron_trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Indian Gardens ORV Route", "Indian_Gardens_ORV_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Iron River-Marenisco Route", "Iron_River_Marenisco_Route.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Kalkaska Trail & Route", "Kalkaska_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Keweenaw Trail", "Keweenaw_Trail.gpx", "","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Kinross Motorcycle Trail", "Kinross_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);

		//items = new OrvListItems();items.setData("Lake Linden Route", "lake_linden.gpx", "bike");allorvList.add(items);
		items = new OrvListItems();items.setData("Leetsville to Kalkaska MCCCT", "Leetsville_to_Kalkaska_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Leetsville Trail", "Leetsville_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Leota Trail", "Leota_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Lincoln Hills Motorcycle Trail & Route", "Lincoln_Hills_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Little Manistee Motorcycle Trail & Route", "Little_Manistee_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Little O Trail", "Little_O_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Long Lake Motorcycle Trail", "Long_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("M-20 to Big O MCCCT and White Cloud Loop", "m_20_to_big_o_white_cloud.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-30 North Gladwin MCCCT", "M_30_North_Gladwin_MCCCT.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-30 to St. Helen #3 MCCCT", "M_30_to_St_Helen_3_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("M-55 to 20 Rd. MCCCT", "M_55_to_20_Rd_MCCCT.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-55 to State Rd. MCCCT", "M_55_to_State_Rd_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Marquette-Manistique Trail & Route", "Marquette_Manistique_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("MCCCT Trail to US-131", "MCCCT_Trail_to_US_131.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("The Meadows Trail", "Meadows_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Meadows Trail-Rose City Trail Connector", "Meadows_Trail_Rose_City_Trail_Connector.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Mio to Meadows MCCCT", "Mio_to_Meadows_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Mio Trail & Route", "Mio_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Missaukee Junction Trail", "Missaukee_Junction_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Moss Lake Motorcycle Trail", "Moss_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Newberry-Rexton Motorcycle Trail", "Newberry_Rexton_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("North Branch Route", "North_Branch_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("North Missaukee & MCCCT", "North_Missaukee__MCCCT_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("North Missaukee Motorcycle, Trail & Route", "North_Missaukee_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Norway Trail", "Norway_Trail.gpx", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("Ogemaw Hills to St. Helen Trail", "Ogemaw_Hills_to_St_Helen_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Ogemaw Hills Trail & Route", "Ogemaw_Hills_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Old State House Trail and Route", "Old_State_House_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Ottawa East Connector", "Ottawa_East_Connector.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Pine Ridge Trail", "Pine_Ridge_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Pioneer Trail", "Pioneer_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Porterfield Lake Motorcycle Trail", "Porterfield_Lake_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Powers Arnold Route", "powers_arnold.gpx", "bike");allorvList.add(items);

		items = new OrvListItems();items.setData("Red Bridge to Atlanta MCCCT", "Red_Bridge_to_Atlanta_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Red Bridge Trail & Route", "Red_Bridge_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Republic-Champion Route", "Republic_Champion_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Rose City Trail", "Rose_City_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Sandtown Motorcycle Trail", "Sandtown_Motorcycle_Trail.gpx", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Silver Creek Trail", "Silver_Creek_Trail.gpx", "bike","atv","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Silver Lake ORV Area", "null", "bike","atv");allorvList.add(items);
		//items = new OrvListItems();items.setData("Soo-Raco Route", "soo_raco.gpx", "bike");allorvList.add(items);
		items = new OrvListItems();items.setData("Stateline Route", "Stateline_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Helen to Geels Trail & MCCCT", "St_Helen_to_Geels_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Helen Trail & Route", "St_Helen_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Ignace-Trout Lake Route", "st_ignace_to_trout_lake_route.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Tin Cup Spring Motorcycle Trail & Route", "Tin_Cup_Spring_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Trail A Loop and Indian River Route", "Tomahawk_Trail_A_Loop.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Motorcycle Trail B Loop", "Tomahawk_Motorcycle_Trail_B_Loop.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Motorcycle Trail C Loop", "Tomahawk_Motorcycle_Trail_C_Loop.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk to Kalkaska MCCCT", "Tomahawk_to_Kalkaska_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk to Red Bridge MCCCT", "Tomahawk_to_Red_Bridge_MCCCT.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Two-Heart Trail", "Two_Heart_Trail.gpx", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("US-131 to North Missaukee Trail", "US_131_to_North_Missaukee_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("West Higgins Trail and Route", "West_Higgins_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("White Cloud Loop", "white_cloud_loop.gpx", "bike","atv","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Wisconsin-Bond Falls Route", "wisconsin_bond_falls_route.gpx", "bike","atv");allorvList.add(items);

	}
}
