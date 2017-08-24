package com.JEB.trailmaps;

import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import android.view.View.*;
import android.widget.*;
import android.content.*;

public class OrvListAdapter extends RecyclerView.ViewHolder {


    protected TextView trailName;

	protected ImageView picBike, picAtv, picUtv, picSnow;

	protected ImageButton Gpx;

    public OrvListAdapter(View view) {
        super(view);
        trailName = (TextView) view.findViewById(R.id.trail_name);
        picBike = (ImageView) view.findViewById(R.id.pic_bike);
		picBike.setImageResource(R.drawable.bike);
		picAtv = (ImageView) view.findViewById(R.id.pic_atv);
		picAtv.setImageResource(R.drawable.atv);
		picUtv = (ImageView) view.findViewById(R.id.pic_utv);
		picUtv.setImageResource(R.drawable.utv);
		picSnow = (ImageView) view.findViewById(R.id.pic_snow);
		picSnow.setImageResource(R.drawable.snow);
		picSnow.setVisibility(View.GONE);
		Gpx = (ImageButton) view.findViewById(R.id.gpx);
		Gpx.setImageResource(R.drawable.map1);
		//this.description = (TextView) view.findViewById(R.id.description);

		//view.setOnClickListener(this);
	}
	/**
	 public void onClick(View v) {
	 // do whatever you want with list posisiton and result...
	 String trail = trailName.getText().toString();
	 Toast.makeText(v.getContext(), "position = " + trail, Toast.LENGTH_SHORT).show();
	 // Intent myIntent = new Intent(v.getContext(), BarnActivity.class);
	 //myIntent.putExtra("barn_name",barn);
	 //myIntent.putExtra("block_name",block);
	 //v.getContext().startActivity(myIntent);
	 }**/

}


