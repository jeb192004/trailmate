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

		items = new OrvListItems();items.setData("20 Rd. to Grand Traverse County MCCCT", "20_rd_to_grand_traverse_county_mccct.kml","","", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Alcona ORV Trail","", "alcona_orv_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake to Ogemaw Hills Trail", "","ambrose_lake_to_ogemaw_hills_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake to Rose City Trail","", "ambrose_lake_to_rose_city_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Ambrose Lake Trail", "","ambrose_lake_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Atlanta to Hunt Creek MCCCT", "atlanta_to_hunt_creek_mccct.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Atlanta Trail & Route","", "atlanta_trail.kml","atlanta_route.kml", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Baraga Plains Trail","", "baraga_plains_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bass Lake Motorcycle Trail", "bass_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bay City Lake Trail", "","bay_city_lake_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Beaver Creek Trail MCCCT", "beaver_creek_trail_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Bergland to Sidnaw Route", "","","Bergland_to_Sidnaw_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Big Bear Trail", "","big_bear_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Big O Motorcycle Trail", "big_o_motorcycle_trail.kml","","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bill Nicholls Route","","", "Bill_Nicholls_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Birch Hill Motorcycle Trail", "birch_hill_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Black Lake Trail & Route", "","black_lake_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Brevort-Trout Lake Motorcycle Trail", "brevort_trout_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bull Gap Trail", "","bull_gap_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Bummer's Roost Trail", "","bummers_roost_trail.kml", "","bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Cedar Creek Trail", "","cedar_creek_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Cranberry Lake Trail","", "cranberry_lake_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Crapo Creek Trail","", "crapo_creek_trail.kml","", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Danaher Plains Trail", "","danaher_plains_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Days River Route", "","","days_river.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Denton Creek Trail & Route", "","denton_creek_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Devils Lake Route", "","","Devils_Lake_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Drummond Island Trail & Route", "","drummond_island_trail.kml","", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Evart Motorcycle Trail", "evart_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Felch Grade Route", "","","Felch_Grade_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Foreman Lake Motorcycle Trail", "foreman_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Forest Islands Trail & Route", "","forest_islands_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Freda Grade Route", "","","Freda_Grade_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Frederic Trail & Route", "","frederic_trail.kml","", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Geels to Roscommon Route","","", "Geels_to_Roscommon_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Geels Trail", "","","Geels_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Gladwin Trail & Route", "","gladwin_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse County to Supply Rd. MCCCT", "grand_traverse_county_to_supply_rd_mcct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse Motorcycle Trail & Route", "grand_traverse_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Grand Traverse to Leetsville MCCCT", "grand_traverse_to_leetsville_mccct.kml","","", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("Hancock-Calumet Route", "","","Hancock_to_Calumet_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Holton Loop Motorcycle Trail", "holton_loop_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Horseshoe Lake Motorcycle Trail", "horseshoe_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Hunt Creek Motorcycle Trail", "hunt_creek_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Huron Trail", "","huron_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Huron-Sand Lake Spur", "","huron_sand_lake_spur.kml","", "bike","atv","utv");allorvList.add(items);
		
		items = new OrvListItems();items.setData("Indian Gardens ORV Route", "","","Indian_Gardens_ORV_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Iron River-Marenisco Route","","", "Iron_River_Marenisco_Route.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Kalkaska Trail & Route","", "kalkaska_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Keweenaw Trail", "","keweenaw_state_trail.kml","", "","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Kinross Motorcycle Trail", "kinross_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);

		//items = new OrvListItems();items.setData("Lake Linden Route", "lake_linden.gpx", "bike");allorvList.add(items);
		items = new OrvListItems();items.setData("Leetsville to Kalkaska MCCCT", "leetsville_to_kalkaska_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Leetsville Trail", "","leetsville_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Leota Trail", "","leota_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Lincoln Hills Motorcycle Trail & Route", "lincoln_hills_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Little Manistee Motorcycle Trail & Route", "little_manistee_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Little O Trail","","little_o_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Long Lake Motorcycle Trail", "long_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("M-20 to Big O MCCCT", "m_20_to_big_o__mccct_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-20 to Big O Motorcycle and MCCCT", "m_20_to_big_o_motorcycle__mccct.kml","","", "bike","","");allorvList.add(items);
		
		items = new OrvListItems();items.setData("M-30 North Gladwin MCCCT", "m_30_north_gladwin_mccct.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-30 to St. Helen #3 MCCCT", "m_30_to_st_helen_3_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("M-55 to 20 Rd. MCCCT", "m_55_to_20_rd_mccct.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("M-55 to State Rd. MCCCT", "m_55_to_state_rd_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Marquette-Manistique Trail & Route", "","marquette_manistique_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("MCCCT Cross State Connector", "mccct_cross_state_connector.kml","","", "bike","","");allorvList.add(items);
		
		items = new OrvListItems();items.setData("MCCCT Trail to US-131", "","","MCCCT_Trail_to_US_131.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("The Meadows Trail mx", "the_meadows_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("The Meadows Trail atv", "","the_meadows_trail.kml","", "","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Meadows Trail-Rose City Trail Connector", "","the_meadows_trail_rose_city_trail_connector.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Mio to Meadows MCCCT", "mio_to_meadows_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Mio Trail & Route", "","mio_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Missaukee Junction Trail", "","","Missaukee_Junction_Trail.gpx", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Moss Lake Motorcycle Trail", "moss_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);

		items = new OrvListItems();items.setData("Newberry-Rexton Motorcycle Trail", "newberry_rexton_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("North Branch Route", "","","North_Branch_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("North Missaukee Motorcycle Trail", "north_missaukee_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("North Missaukee Motorcycle Trail 2", "","north_missaukee_trail.kml","", "bike","atv","utv");allorvList.add(items);
		
		items = new OrvListItems();items.setData("North Missaukee Motorcycle & MCCCT", "north_missaukee_motorcycle_trail__mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		
		items = new OrvListItems();items.setData("North Missaukee Motorcycle, Trail & Route","","", "North_Missaukee_Motorcycle_Trail.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Norway Trail", "","","norway_trail.kml", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("Ogemaw Hills to St. Helen Trail", "","ogemaw_hills_to_st_helen_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Ogemaw Hills Trail & Route", "","ogemaw_hills_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Old State House Trail and Route","", "old_state_house_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Ottawa East Connector", "","","Ottawa_East_Connector.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Pine Ridge Trail","", "pine_ridge_trail.kml","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Pioneer Trail", "","pioneer_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Porterfield Lake Motorcycle Trail", "porterfield_lake_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Powers Arnold Route", "powers_arnold.gpx", "bike");allorvList.add(items);

		items = new OrvListItems();items.setData("Red Bridge to Atlanta MCCCT", "red_bridge_to_atlanta_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Red Bridge Trail & Route","", "red_bridge_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Republic-Champion Route", "","","Republic_Champion_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Rose City Trail", "","rose_city_trail.kml","", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Sandtown Motorcycle Trail", "sandtown_motorcycle_trail.kml","","", "bike","","");allorvList.add(items);
		items = new OrvListItems();items.setData("Silver Creek Trail", "","silver_creek_trail.kml","", "bike","atv","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Silver Lake ORV Area", "null", "bike","atv");allorvList.add(items);
		//items = new OrvListItems();items.setData("Soo-Raco Route", "soo_raco.gpx", "bike");allorvList.add(items);
		items = new OrvListItems();items.setData("Stateline Route", "","","Stateline_Route.gpx", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Helen to Geels Trail & MCCCT", "st_helen_to_geels_trail__mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Helen Trail & Route", "","st_helen_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("St. Ignace-Trout Lake Route", "","","st_ignace_to_trout_lake_route.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("Tin Cup Spring Motorcycle Trail & Route", "tin_cup_spring_motorcycle_trail.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Trail A Loop and Indian River Route", "","tomahawk_trail_a_loop.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Motorcycle Trail B Loop", "tomahawk_motorcycle_trail_b_loop.kml","","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk Motorcycle Trail C Loop", "tomahawk_motorcycle_trail_c_loop.kml","","", "bike","atv","");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk to Kalkaska MCCCT", "tomahawk_to_kalkaska_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Tomahawk to Red Bridge MCCCT", "tomahawk_to_red_bridge_mccct.kml","","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("Two-Heart Trail", "","two_heart_trail.kml","", "bike","atv","");allorvList.add(items);

		items = new OrvListItems();items.setData("US-131 to North Missaukee Trail", "","","US_131_to_North_Missaukee_Trail.gpx", "bike","atv","utv");allorvList.add(items);

		items = new OrvListItems();items.setData("West Higgins Trail and Route", "","west_higgins_trail.kml","", "bike","atv","utv");allorvList.add(items);
		items = new OrvListItems();items.setData("White Cloud Loop", "","white_cloud_loop.kml","", "bike","atv","");allorvList.add(items);
		//items = new OrvListItems();items.setData("Wisconsin-Bond Falls Route", "wisconsin_bond_falls_route.gpx", "bike","atv");allorvList.add(items);

	}
}
