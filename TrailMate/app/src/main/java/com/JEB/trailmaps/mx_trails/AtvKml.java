package com.JEB.trailmaps.mx_trails;
import org.osmdroid.bonuspack.kml.*;
//import com.JEB.trailmaps.kmlStyler.*;
import com.JEB.trailmaps.*;
import android.content.res.*;
import java.io.*;
import org.osmdroid.views.overlay.*;

public class AtvKml
{
	MainActivity main;

	private String kmlFile;

	private KmlDocument kmlDocument;

	private InputStream streamDeKml;

	public FolderOverlay atvOverlay,atvOverlay2,atvOverlay3,atvOverlay4,atvOverlay5,
	atvOverlay6,atvOverlay7,atvOverlay8,atvOverlay9,atvOverlay10,
	atvOverlay11,atvOverlay12,atvOverlay13,atvOverlay14,atvOverlay15,
	atvOverlay16,atvOverlay17,atvOverlay18,atvOverlay19,atvOverlay20,
	atvOverlay21,atvOverlay22,atvOverlay23,atvOverlay24,atvOverlay25,
	atvOverlay26,atvOverlay27,atvOverlay28,atvOverlay29,atvOverlay30,
	atvOverlay31,atvOverlay32,atvOverlay33,atvOverlay34,atvOverlay35,
	atvOverlay36,atvOverlay37,atvOverlay38,atvOverlay39,atvOverlay40,
	atvOverlay41,atvOverlay42,atvOverlay43,atvOverlay44,atvOverlay45;
	KmlFeature.Styler styler;

	public void atv_kml(MainActivity main){
		this.main = main;

		styler = new KmlAtvStyler();
		kmlDocument = new KmlDocument();
		kmlFile = "alcona_orv_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ambrose_lake_to_ogemaw_hills_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay2 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ambrose_lake_to_rose_city_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay3 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ambrose_lake_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay4 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "baraga_plains_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay5 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "bay_city_lake_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay6 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "big_bear_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay7 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "black_lake_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay8 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "bull_gap_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay9 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "bummers_roost_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay10 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "cedar_creek_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay11= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "cranberry_lake_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay12 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "crapo_creek_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay13 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "danaher_plains_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay14 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "denton_creek_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay15 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "drummond_island_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay16 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "forest_islands_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay17 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "frederic_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay18 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "gladwin_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay19 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "huron_sand_lake_spur.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay20 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "huron_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay21 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "kalkaska_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay22 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "keweenaw_state_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay23 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "leetsville_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay24 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "leota_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay25 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "little_o_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay26 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "marquette_manistique_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay27 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "mio_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay28 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "north_missaukee_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay29 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "norway_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay30 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ogemaw_hills_to_st_helen_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay31 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ogemaw_hills_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay32= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "old_state_house_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay33 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "pine_ridge_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay34 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "pioneer_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay35 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "red_bridge_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay36 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "rose_city_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay37 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "silver_creek_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay38 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "st_helen_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay39 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "the_meadows_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay40 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "the_meadows_trail_rose_city_trail_connector.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay41= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tomahawk_trail_a_loop.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay42 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "two_heart_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay43 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "west_higgins_trail.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay44= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "white_cloud_loop.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		atvOverlay45 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
		
		addOverlays();
		main.map.invalidate();
	}

	public void atv_kml_clear(MainActivity main){
		this.main = main;
		main.map.getOverlays().remove(atvOverlay);
		main.map.getOverlays().remove(atvOverlay2);
		main.map.getOverlays().remove(atvOverlay3);
		main.map.getOverlays().remove(atvOverlay4);
		main.map.getOverlays().remove(atvOverlay5);
		main.map.getOverlays().remove(atvOverlay6);
		main.map.getOverlays().remove(atvOverlay7);
		main.map.getOverlays().remove(atvOverlay8);
		main.map.getOverlays().remove(atvOverlay9);
		main.map.getOverlays().remove(atvOverlay10);
		main.map.getOverlays().remove(atvOverlay11);
		main.map.getOverlays().remove(atvOverlay12);
		main.map.getOverlays().remove(atvOverlay13);
		main.map.getOverlays().remove(atvOverlay14);
		main.map.getOverlays().remove(atvOverlay15);
		main.map.getOverlays().remove(atvOverlay16);
		main.map.getOverlays().remove(atvOverlay17);
		main.map.getOverlays().remove(atvOverlay18);
		main.map.getOverlays().remove(atvOverlay19);
		main.map.getOverlays().remove(atvOverlay20);
		main.map.getOverlays().remove(atvOverlay21);
		main.map.getOverlays().remove(atvOverlay22);
		main.map.getOverlays().remove(atvOverlay23);
		main.map.getOverlays().remove(atvOverlay24);
		main.map.getOverlays().remove(atvOverlay25);
		main.map.getOverlays().remove(atvOverlay26);
		main.map.getOverlays().remove(atvOverlay27);
		main.map.getOverlays().remove(atvOverlay28);
		main.map.getOverlays().remove(atvOverlay29);
		main.map.getOverlays().remove(atvOverlay30);
		main.map.getOverlays().remove(atvOverlay31);
		main.map.getOverlays().remove(atvOverlay32);
		main.map.getOverlays().remove(atvOverlay33);
		main.map.getOverlays().remove(atvOverlay34);
		main.map.getOverlays().remove(atvOverlay35);
		main.map.getOverlays().remove(atvOverlay36);
		main.map.getOverlays().remove(atvOverlay37);
		main.map.getOverlays().remove(atvOverlay38);
		main.map.getOverlays().remove(atvOverlay39);
		main.map.getOverlays().remove(atvOverlay40);
		main.map.getOverlays().remove(atvOverlay41);
		main.map.getOverlays().remove(atvOverlay42);
		main.map.getOverlays().remove(atvOverlay43);
		main.map.getOverlays().remove(atvOverlay44);
		main.map.getOverlays().remove(atvOverlay45);
		
		main.map.invalidate();
	}

	private void kml()
	{
		AssetManager assetManager=main.getAssets();
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

	private void addOverlays()
	{
		main.map.getOverlays().add(atvOverlay);
		main.map.getOverlays().add(atvOverlay2);
		main.map.getOverlays().add(atvOverlay3);
		main.map.getOverlays().add(atvOverlay4);
		main.map.getOverlays().add(atvOverlay5);
		main.map.getOverlays().add(atvOverlay6);
		main.map.getOverlays().add(atvOverlay7);
		main.map.getOverlays().add(atvOverlay8);
		main.map.getOverlays().add(atvOverlay9);
		main.map.getOverlays().add(atvOverlay10);
		main.map.getOverlays().add(atvOverlay11);
		main.map.getOverlays().add(atvOverlay12);
		main.map.getOverlays().add(atvOverlay13);
		main.map.getOverlays().add(atvOverlay14);
		main.map.getOverlays().add(atvOverlay15);
		main.map.getOverlays().add(atvOverlay16);
		main.map.getOverlays().add(atvOverlay17);
		main.map.getOverlays().add(atvOverlay18);
		main.map.getOverlays().add(atvOverlay19);
		main.map.getOverlays().add(atvOverlay20);
		main.map.getOverlays().add(atvOverlay21);
		main.map.getOverlays().add(atvOverlay22);
		main.map.getOverlays().add(atvOverlay23);
		main.map.getOverlays().add(atvOverlay24);
		main.map.getOverlays().add(atvOverlay25);
		main.map.getOverlays().add(atvOverlay26);
		main.map.getOverlays().add(atvOverlay27);
		main.map.getOverlays().add(atvOverlay28);
		main.map.getOverlays().add(atvOverlay29);
		main.map.getOverlays().add(atvOverlay30);
		main.map.getOverlays().add(atvOverlay31);
		main.map.getOverlays().add(atvOverlay32);
		main.map.getOverlays().add(atvOverlay33);
		main.map.getOverlays().add(atvOverlay34);
		main.map.getOverlays().add(atvOverlay35);
		main.map.getOverlays().add(atvOverlay36);
		main.map.getOverlays().add(atvOverlay37);
		main.map.getOverlays().add(atvOverlay38);
		main.map.getOverlays().add(atvOverlay39);
		main.map.getOverlays().add(atvOverlay40);
		main.map.getOverlays().add(atvOverlay41);
		main.map.getOverlays().add(atvOverlay42);
		main.map.getOverlays().add(atvOverlay43);
		main.map.getOverlays().add(atvOverlay44);
		main.map.getOverlays().add(atvOverlay45);
		
	}
}
