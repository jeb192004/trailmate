package com.JEB.trailmaps;

import android.net.Uri;
import android.widget.MediaController;
import android.widget.VideoView;
import android.os.*;
import android.app.*;
import android.media.MediaPlayer.OnPreparedListener;
import android.media.*;
import android.view.*;
import android.util.*;
import android.content.pm.*;
import android.content.*;




public class VideoService extends Activity
{

	private VideoView vidView;

	private String vidAddress;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.video_service);
		
		getWindow().getDecorView().setSystemUiVisibility(
			View.SYSTEM_UI_FLAG_LAYOUT_STABLE
			| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
			| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
			| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
			| View.SYSTEM_UI_FLAG_FULLSCREEN
			| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
			
		Bundle bundle = getIntent().getExtras();
		String vidLocation = bundle.getString("vid");
		
		this.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
		final ProgressDialog bufferingDialog;
		bufferingDialog = ProgressDialog.show(this,
											  "Buffering", "Please wait", true, true);
		
		vidView = (VideoView)findViewById(R.id.myVideo);
		
		if(vidLocation.equals("St Helen Mudd")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FSt%20Helen2.mp4?alt=media&token=f6a76f88-8945-4a9c-9a78-2c5b2164cdfd";
		}if(vidLocation.equals("St Helen 1")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%20trail%201.mp4?alt=media&token=5e521366-68c9-446a-888b-e2679f08e211";
		}if(vidLocation.equals("St Helen 2")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%20trail%202.mp4?alt=media&token=19f2503e-b6ab-4cff-b453-fb6ab38b3c06";
		}if(vidLocation.equals("St Helen 3")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%20trail%203.mp4?alt=media&token=257dd2f1-e5af-4f20-b232-ac5d44c913a3";
		}if(vidLocation.equals("St Helen 4")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%20trail%204.mp4?alt=media&token=c2bec86d-d0cf-4ceb-985b-10f2b00ff890";
		}if(vidLocation.equals("St Helen 5")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%205.mp4?alt=media&token=5c9b8c57-c6f0-4c66-bf3f-01c75a837ed7";
		}if(vidLocation.equals("St Helen sand pit")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FSt%20Helen%20Sand%20Pit.mp4?alt=media&token=d79227b4-7e85-4af7-a3ad-78115e1ff6c8";
		}if(vidLocation.equals("St Helen 6")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%206.mp4?alt=media&token=452e4234-c60a-499a-b2b8-0f451b0f793e";
		}if(vidLocation.equals("St Helen 7")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%207.mp4?alt=media&token=aa156448-0a81-4664-abdf-cf695aa6901f";
		}if(vidLocation.equals("St Helen 8")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%208.mp4?alt=media&token=52c2a1f0-2549-4327-993e-e3b2a2e60482";
		}if(vidLocation.equals("St Helen 9")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%209.mp4?alt=media&token=1dbcd11a-c77b-421c-a244-6be04b7dc413";
		}if(vidLocation.equals("St Helen 12")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%2012.mp4?alt=media&token=99d4871e-93df-4b1a-a54e-263d9a6bebb0";
		}if(vidLocation.equals("St Helen 13")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%2013.mp4?alt=media&token=342b8496-2f8a-4ca4-a2d7-dfb29c2709b1";
		}if(vidLocation.equals("St Helen 14")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%2014.mp4?alt=media&token=452f571e-6a43-4808-a5d7-a27d1820ea40";
		}if(vidLocation.equals("St Helen 15")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%2015.mp4?alt=media&token=9d29bfee-fe68-485f-a498-28b9e532d9ac";
		}if(vidLocation.equals("St Helen 16")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/St%20Helen%2FTrails%2FSt%20Helen%2016.mp4?alt=media&token=9681d54f-db42-46a2-8c8a-ffd90543bb0e";
		}if(vidLocation.equals("Denton Creek")){
			vidAddress = "https://firebasestorage.googleapis.com/v0/b/project-4793771504851102550.appspot.com/o/Denton%20Creek%2FDenton%20Creek.mp4?alt=media&token=68c118c2-9210-4685-8d0c-4ed6d4e93043";
		}
		
		
		Uri vidUri = Uri.parse(vidAddress);
		MediaController vidControl = new MediaController(this);
		vidControl.setAnchorView(vidView);
		vidView.setMediaController(vidControl);
		
		vidView.setVideoURI(vidUri);
		
		vidView.start();
		
		vidView.setOnPreparedListener(new MediaPlayer.OnPreparedListener() {
				@Override
				public void onPrepared(MediaPlayer mp) {
					mp.setOnInfoListener(new MediaPlayer.OnInfoListener() {
							@Override
							public boolean onInfo(MediaPlayer mp, int what, int extra) {
								if (what == MediaPlayer.MEDIA_INFO_BUFFERING_START)
									bufferingDialog.show();
								if (what == MediaPlayer.MEDIA_INFO_BUFFERING_END)
									bufferingDialog.dismiss();
									vidView.start();
								getWindow().getDecorView().setSystemUiVisibility(
									View.SYSTEM_UI_FLAG_LAYOUT_STABLE
									| View.SYSTEM_UI_FLAG_LAYOUT_HIDE_NAVIGATION
									| View.SYSTEM_UI_FLAG_LAYOUT_FULLSCREEN
									| View.SYSTEM_UI_FLAG_HIDE_NAVIGATION
									| View.SYSTEM_UI_FLAG_FULLSCREEN
									| View.SYSTEM_UI_FLAG_IMMERSIVE_STICKY);
								return false;
							}
						});
				}
			});
		vidView.setOnErrorListener(new MediaPlayer.OnErrorListener() {
				@Override
				public boolean onError(MediaPlayer mp, int what, int extra) {
					bufferingDialog.dismiss();
					return false;
				}
			});
		vidView.setOnCompletionListener(new MediaPlayer.OnCompletionListener() {
				public void onCompletion(MediaPlayer mp) {
					Intent myIntent2 = new Intent(VideoService.this, MainActivity.class);
					VideoService.this.startActivity(myIntent2);
					finish();
				}
			});
	}
	
	
	
}
