package com.JEB.trailmaps.kmlStyler;
import org.osmdroid.bonuspack.kml.*;
import org.osmdroid.views.overlay.*;
import android.graphics.*;

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
		p1.setWidth(Math.max(p3.mCoordinates.size()/200.0f, 3.0f));
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
