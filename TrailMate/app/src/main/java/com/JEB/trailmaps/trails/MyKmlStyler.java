package com.JEB.trailmaps.trails;
import org.osmdroid.bonuspack.kml.*;
import org.osmdroid.views.overlay.*;
import android.graphics.*;
import com.JEB.trailmaps.trails.*;

class MyKmlStyler implements KmlFeature.Styler {

	
	@Override
	public void onFeature(Overlay p1, KmlFeature p2)
	{
		// TODO: Implement this method
	}

	@Override
	public void onPoint(Marker p1, KmlPlacemark p2, KmlPoint p3)
	{
		// TODO: Implement this method
	}

	@Override
	public void onLineString(Polyline p1, KmlPlacemark p2, KmlLineString p3)
	{
		//polyline.setWidth(Math.max(kmlLineString.mCoordinates.size()/200.0f, 3.0f));
		p1.setColor(Color.RED);
	}

	@Override
	public void onPolygon(Polygon p1, KmlPlacemark p2, KmlPolygon p3)
	{
		// TODO: Implement this method
	}

	@Override
	public void onTrack(Polyline p1, KmlPlacemark p2, KmlTrack p3)
	{
		// TODO: Implement this method
	}


}