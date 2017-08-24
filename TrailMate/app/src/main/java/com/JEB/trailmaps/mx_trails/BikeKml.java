package com.JEB.trailmaps.mx_trails;
import org.osmdroid.bonuspack.kml.*;
//import com.JEB.trailmaps.kmlStyler.*;
import com.JEB.trailmaps.*;
import android.content.res.*;
import java.io.*;
import org.osmdroid.views.overlay.*;

public class BikeKml
{
	MainActivity main;

	private String kmlFile;

	private KmlDocument kmlDocument;

	private InputStream streamDeKml;

	public FolderOverlay bikeOverlay,bikeOverlay2,bikeOverlay3,bikeOverlay4,bikeOverlay5,
	bikeOverlay6,bikeOverlay7,bikeOverlay8,bikeOverlay9,bikeOverlay10,
	bikeOverlay11,bikeOverlay12,bikeOverlay13,bikeOverlay14,bikeOverlay15,
	bikeOverlay16,bikeOverlay17,bikeOverlay18,bikeOverlay19,bikeOverlay20,
	bikeOverlay21,bikeOverlay22,bikeOverlay23,bikeOverlay24,bikeOverlay25,
	bikeOverlay26,bikeOverlay27,bikeOverlay28,bikeOverlay29,bikeOverlay30,
	bikeOverlay31,bikeOverlay32,bikeOverlay33,bikeOverlay34,bikeOverlay35,
	bikeOverlay36,bikeOverlay37,bikeOverlay38,bikeOverlay39,bikeOverlay40,
	bikeOverlay41,bikeOverlay42;
	KmlFeature.Styler styler;
	
	public void bike_kml(MainActivity main){
	this.main = main;
	
	styler = new MyKmlStyler();
	kmlDocument = new KmlDocument();
		kmlFile = "20_rd_to_grand_traverse_county_mccct.kml";kml();
	kmlDocument.parseKMLStream(streamDeKml,null);
	bikeOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
		
		kmlFile = "atlanta_to_hunt_creek_mccct.kml";kml();
	kmlDocument.parseKMLStream(streamDeKml,null);
	bikeOverlay2 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
	
		kmlFile = "bass_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay3 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "beaver_creek_trail_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay4 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "big_o_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay5 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "birch_hill_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay6 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "brevort_trout_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay7 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "evart_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay8 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "foreman_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay9 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "grand_traverse_county_to_supply_rd_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay10 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "grand_traverse_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay11= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "grand_traverse_to_leetsville_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay12 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "holton_loop_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay13 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "horseshoe_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay14 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "hunt_creek_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay15 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "kinross_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay16 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "leetsville_to_kalkaska_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay17 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "lincoln_hills_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay18 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "little_manistee_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay19 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "long_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay20 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_20_to_big_o__mccct_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay21 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_20_to_big_o_motorcycle__mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay22 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_30_north_gladwin_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay23 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_30_to_st_helen_3_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay24 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_55_to_20_rd_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay25 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "m_55_to_state_rd_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay26 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "mccct_cross_state_connector.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay27 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "mio_to_meadows_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay28 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "moss_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay29 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "newberry_rexton_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay30 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "north_missaukee_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay31 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "north_missaukee_motorcycle_trail__mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay32= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "porterfield_lake_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay33 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "red_bridge_to_atlanta_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay34 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "sandtown_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay35 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "st_helen_to_geels_trail__mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay36 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "the_meadows_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay37 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tin_cup_spring_motorcycle_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay38 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tomahawk_motorcycle_trail_b_loop.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay39 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tomahawk_motorcycle_trail_c_loop.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay40 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tomahawk_to_kalkaska_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay41= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tomahawk_to_red_bridge_mccct.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		bikeOverlay42 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
		
	
	addOverlays();
	main.map.invalidate();
	}
	
	public void bike_kml_clear(MainActivity main){
		this.main = main;
		main.map.getOverlays().remove(bikeOverlay);
		main.map.getOverlays().remove(bikeOverlay2);
		main.map.getOverlays().remove(bikeOverlay3);
		main.map.getOverlays().remove(bikeOverlay4);
		main.map.getOverlays().remove(bikeOverlay5);
		main.map.getOverlays().remove(bikeOverlay6);
		main.map.getOverlays().remove(bikeOverlay7);
		main.map.getOverlays().remove(bikeOverlay8);
		main.map.getOverlays().remove(bikeOverlay9);
		main.map.getOverlays().remove(bikeOverlay10);
		main.map.getOverlays().remove(bikeOverlay11);
		main.map.getOverlays().remove(bikeOverlay12);
		main.map.getOverlays().remove(bikeOverlay13);
		main.map.getOverlays().remove(bikeOverlay14);
		main.map.getOverlays().remove(bikeOverlay15);
		main.map.getOverlays().remove(bikeOverlay16);
		main.map.getOverlays().remove(bikeOverlay17);
		main.map.getOverlays().remove(bikeOverlay18);
		main.map.getOverlays().remove(bikeOverlay19);
		main.map.getOverlays().remove(bikeOverlay20);
		main.map.getOverlays().remove(bikeOverlay21);
		main.map.getOverlays().remove(bikeOverlay22);
		main.map.getOverlays().remove(bikeOverlay23);
		main.map.getOverlays().remove(bikeOverlay24);
		main.map.getOverlays().remove(bikeOverlay25);
		main.map.getOverlays().remove(bikeOverlay26);
		main.map.getOverlays().remove(bikeOverlay27);
		main.map.getOverlays().remove(bikeOverlay28);
		main.map.getOverlays().remove(bikeOverlay29);
		main.map.getOverlays().remove(bikeOverlay30);
		main.map.getOverlays().remove(bikeOverlay31);
		main.map.getOverlays().remove(bikeOverlay32);
		main.map.getOverlays().remove(bikeOverlay33);
		main.map.getOverlays().remove(bikeOverlay34);
		main.map.getOverlays().remove(bikeOverlay35);
		main.map.getOverlays().remove(bikeOverlay36);
		main.map.getOverlays().remove(bikeOverlay37);
		main.map.getOverlays().remove(bikeOverlay38);
		main.map.getOverlays().remove(bikeOverlay39);
		main.map.getOverlays().remove(bikeOverlay40);
		main.map.getOverlays().remove(bikeOverlay41);
		main.map.getOverlays().remove(bikeOverlay42);
		
		main.map.invalidate();
	}
	
	private void kml()
	{
		AssetManager assetManager=main.getAssets();
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
	
	private void addOverlays()
	{
		main.map.getOverlays().add(bikeOverlay);
		main.map.getOverlays().add(bikeOverlay2);
		main.map.getOverlays().add(bikeOverlay3);
		main.map.getOverlays().add(bikeOverlay4);
		main.map.getOverlays().add(bikeOverlay5);
		main.map.getOverlays().add(bikeOverlay6);
		main.map.getOverlays().add(bikeOverlay7);
		main.map.getOverlays().add(bikeOverlay8);
		main.map.getOverlays().add(bikeOverlay9);
		main.map.getOverlays().add(bikeOverlay10);
		main.map.getOverlays().add(bikeOverlay11);
		main.map.getOverlays().add(bikeOverlay12);
		main.map.getOverlays().add(bikeOverlay13);
		main.map.getOverlays().add(bikeOverlay14);
		main.map.getOverlays().add(bikeOverlay15);
		main.map.getOverlays().add(bikeOverlay16);
		main.map.getOverlays().add(bikeOverlay17);
		main.map.getOverlays().add(bikeOverlay18);
		main.map.getOverlays().add(bikeOverlay19);
		main.map.getOverlays().add(bikeOverlay20);
		main.map.getOverlays().add(bikeOverlay21);
		main.map.getOverlays().add(bikeOverlay22);
		main.map.getOverlays().add(bikeOverlay23);
		main.map.getOverlays().add(bikeOverlay24);
		main.map.getOverlays().add(bikeOverlay25);
		main.map.getOverlays().add(bikeOverlay26);
		main.map.getOverlays().add(bikeOverlay27);
		main.map.getOverlays().add(bikeOverlay28);
		main.map.getOverlays().add(bikeOverlay29);
		main.map.getOverlays().add(bikeOverlay30);
		main.map.getOverlays().add(bikeOverlay31);
		main.map.getOverlays().add(bikeOverlay32);
		main.map.getOverlays().add(bikeOverlay33);
		main.map.getOverlays().add(bikeOverlay34);
		main.map.getOverlays().add(bikeOverlay35);
		main.map.getOverlays().add(bikeOverlay36);
		main.map.getOverlays().add(bikeOverlay37);
		main.map.getOverlays().add(bikeOverlay38);
		main.map.getOverlays().add(bikeOverlay39);
		main.map.getOverlays().add(bikeOverlay40);
		main.map.getOverlays().add(bikeOverlay41);
		main.map.getOverlays().add(bikeOverlay42);
		
	}
}
