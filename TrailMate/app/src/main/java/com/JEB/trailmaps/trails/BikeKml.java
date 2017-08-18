package com.JEB.trailmaps.trails;
import org.osmdroid.bonuspack.kml.*;
import com.JEB.trailmaps.kmlStyler.*;
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

	public FolderOverlay bikeOverlay;
	KmlFeature.Styler styler;
	public FolderOverlay bikeOverlay2;
	
	public void bike_kml(MainActivity main){
	this.main = main;
	
	styler = new MyKmlStyler();
	kmlDocument = new KmlDocument();
	kmlFile = "20rd.kml";kml();
	kmlDocument.parseKMLStream(streamDeKml,null);
	bikeOverlay = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
		
	kmlFile = "atl_to_hunt.kml";kml();
	kmlDocument.parseKMLStream(streamDeKml,null);
	bikeOverlay2 = (FolderOverlay)kmlDocument.mKmlRoot.buildOverlay(main.map, null, styler, kmlDocument);
	main.map.getOverlays().add(bikeOverlay);
	main.map.getOverlays().add(bikeOverlay2);
	main.map.invalidate();
	}
	
	public void bike_kml_clear(MainActivity main){
		this.main = main;
		main.map.getOverlays().remove(bikeOverlay);
		main.map.getOverlays().remove(bikeOverlay2);
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
}
