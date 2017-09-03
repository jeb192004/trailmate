package com.JEB.trailmaps.mx_trails;
import org.osmdroid.bonuspack.kml.*;
//import com.JEB.trailmaps.kmlStyler.*;
import com.JEB.trailmaps.*;
import android.content.res.*;
import java.io.*;
import org.osmdroid.views.overlay.*;

public class UtvKml
{
	MainActivity main;

	private String kmlFile;

	private KmlDocument kmlDocument;

	private InputStream streamDeKml;

	public FolderOverlay utvOverlay,utvOverlay2,utvOverlay3,utvOverlay4,utvOverlay5,
	utvOverlay6,utvOverlay7,utvOverlay8,utvOverlay9,utvOverlay10,
	utvOverlay11,utvOverlay12,utvOverlay13,utvOverlay14,utvOverlay15,
	utvOverlay16,utvOverlay17,utvOverlay18,utvOverlay19,utvOverlay20,
	utvOverlay21,utvOverlay22,utvOverlay23,utvOverlay24,utvOverlay25,
	utvOverlay26,utvOverlay27,utvOverlay28,utvOverlay29,utvOverlay30,
	utvOverlay31,utvOverlay32,utvOverlay33,utvOverlay34,utvOverlay35,
	utvOverlay36,utvOverlay37,utvOverlay38,utvOverlay39,utvOverlay40,
	utvOverlay41,utvOverlay42,utvOverlay43;
	KmlFeature.Styler styler;

	public void utv_kml(MainActivity main){
		this.main = main;

		styler = new KmlUtvStyler();
		kmlDocument = new KmlDocument();
		kmlFile = "atlanta_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "bergland_to_sidnaw_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay2 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "bill_nicholls_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay3 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "black_lake_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay4 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "days_river_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay5 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "denton_creek_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay6 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "denton_creek_to_st_helen_connector_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay7 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "devils_lake_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay8 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "drummond_island_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay9 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "felch_grade_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay10 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "forest_islands_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay11= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "freda_grade_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay12 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "frederic_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay13 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "geels_to_roscommon_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay14 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "gladwin_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay15 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "grand_traverse_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay16 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "hancock_to_calumet_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay17 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "indian_gardens_orv_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay18 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "indian_river_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay19 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "iron_river_to_marenisco_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay20 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ishpeming_to_republic_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay21 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "kalkaska_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay22 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "lake_linden_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay23 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "lincoln_hills_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay24 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "little_manistee_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay25 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "marenisco_korpela_road_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay26 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "marquette_manistique_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay27 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "mio_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay28 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "north_branch_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay29 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "north_missaukee_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay30 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ogemaw_hills_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay31 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "old_state_house_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay32= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "ottawa_east_connector.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay33 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "powers_arnold_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay34 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "red_bridge_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay35 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "republic_champion_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay36 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "soo_raco_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay37 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "st_helen_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay38 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "st_ignace_to_trout_lake_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay39 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "stateline_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay40 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "tin_cup_spring_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay41= (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "west_higgins_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay42 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		kmlFile = "wisconsin_bond_falls_route.kml";kml();
		kmlDocument.parseKMLStream(streamDeKml,null);
		utvOverlay43 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);

		
		addOverlays();
		main.map.invalidate();
	}

	public void utv_kml_clear(MainActivity main){
		this.main = main;
		main.map.getOverlays().remove(utvOverlay);
		main.map.getOverlays().remove(utvOverlay2);
		main.map.getOverlays().remove(utvOverlay3);
		main.map.getOverlays().remove(utvOverlay4);
		main.map.getOverlays().remove(utvOverlay5);
		main.map.getOverlays().remove(utvOverlay6);
		main.map.getOverlays().remove(utvOverlay7);
		main.map.getOverlays().remove(utvOverlay8);
		main.map.getOverlays().remove(utvOverlay9);
		main.map.getOverlays().remove(utvOverlay10);
		main.map.getOverlays().remove(utvOverlay11);
		main.map.getOverlays().remove(utvOverlay12);
		main.map.getOverlays().remove(utvOverlay13);
		main.map.getOverlays().remove(utvOverlay14);
		main.map.getOverlays().remove(utvOverlay15);
		main.map.getOverlays().remove(utvOverlay16);
		main.map.getOverlays().remove(utvOverlay17);
		main.map.getOverlays().remove(utvOverlay18);
		main.map.getOverlays().remove(utvOverlay19);
		main.map.getOverlays().remove(utvOverlay20);
		main.map.getOverlays().remove(utvOverlay21);
		main.map.getOverlays().remove(utvOverlay22);
		main.map.getOverlays().remove(utvOverlay23);
		main.map.getOverlays().remove(utvOverlay24);
		main.map.getOverlays().remove(utvOverlay25);
		main.map.getOverlays().remove(utvOverlay26);
		main.map.getOverlays().remove(utvOverlay27);
		main.map.getOverlays().remove(utvOverlay28);
		main.map.getOverlays().remove(utvOverlay29);
		main.map.getOverlays().remove(utvOverlay30);
		main.map.getOverlays().remove(utvOverlay31);
		main.map.getOverlays().remove(utvOverlay32);
		main.map.getOverlays().remove(utvOverlay33);
		main.map.getOverlays().remove(utvOverlay34);
		main.map.getOverlays().remove(utvOverlay35);
		main.map.getOverlays().remove(utvOverlay36);
		main.map.getOverlays().remove(utvOverlay37);
		main.map.getOverlays().remove(utvOverlay38);
		main.map.getOverlays().remove(utvOverlay39);
		main.map.getOverlays().remove(utvOverlay40);
		main.map.getOverlays().remove(utvOverlay41);
		main.map.getOverlays().remove(utvOverlay42);
		main.map.getOverlays().remove(utvOverlay43);
		

		main.map.invalidate();
	}

	private void kml()
	{
		AssetManager assetManager=main.getAssets();
		streamDeKml = null;
		try {
			streamDeKml=assetManager.open("utv/"+kmlFile);
			kmlDocument.parseKMLStream(streamDeKml, null); // lo mentemos en el mapa
			streamDeKml.close();   // como hemos terminado con el Stream ddel KML ya lo podemos borrar.


		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}

	}

	private void addOverlays()
	{
		main.map.getOverlays().add(utvOverlay);
		main.map.getOverlays().add(utvOverlay2);
		main.map.getOverlays().add(utvOverlay3);
		main.map.getOverlays().add(utvOverlay4);
		main.map.getOverlays().add(utvOverlay5);
		main.map.getOverlays().add(utvOverlay6);
		main.map.getOverlays().add(utvOverlay7);
		main.map.getOverlays().add(utvOverlay8);
		main.map.getOverlays().add(utvOverlay9);
		main.map.getOverlays().add(utvOverlay10);
		main.map.getOverlays().add(utvOverlay11);
		main.map.getOverlays().add(utvOverlay12);
		main.map.getOverlays().add(utvOverlay13);
		main.map.getOverlays().add(utvOverlay14);
		main.map.getOverlays().add(utvOverlay15);
		main.map.getOverlays().add(utvOverlay16);
		main.map.getOverlays().add(utvOverlay17);
		main.map.getOverlays().add(utvOverlay18);
		main.map.getOverlays().add(utvOverlay19);
		main.map.getOverlays().add(utvOverlay20);
		main.map.getOverlays().add(utvOverlay21);
		main.map.getOverlays().add(utvOverlay22);
		main.map.getOverlays().add(utvOverlay23);
		main.map.getOverlays().add(utvOverlay24);
		main.map.getOverlays().add(utvOverlay25);
		main.map.getOverlays().add(utvOverlay26);
		main.map.getOverlays().add(utvOverlay27);
		main.map.getOverlays().add(utvOverlay28);
		main.map.getOverlays().add(utvOverlay29);
		main.map.getOverlays().add(utvOverlay30);
		main.map.getOverlays().add(utvOverlay31);
		main.map.getOverlays().add(utvOverlay32);
		main.map.getOverlays().add(utvOverlay33);
		main.map.getOverlays().add(utvOverlay34);
		main.map.getOverlays().add(utvOverlay35);
		main.map.getOverlays().add(utvOverlay36);
		main.map.getOverlays().add(utvOverlay37);
		main.map.getOverlays().add(utvOverlay38);
		main.map.getOverlays().add(utvOverlay39);
		main.map.getOverlays().add(utvOverlay40);
		main.map.getOverlays().add(utvOverlay41);
		main.map.getOverlays().add(utvOverlay42);
		main.map.getOverlays().add(utvOverlay43);
		

	}
}
