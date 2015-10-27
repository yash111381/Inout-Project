package com.example.hack1;


import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.preference.PreferenceManager;

public class OpenImg extends Activity{
	MediaPlayer mp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.img);
		mp=MediaPlayer.create(OpenImg.this, R.raw.kickoff);
		SharedPreferences sp=PreferenceManager.getDefaultSharedPreferences(getBaseContext());
		boolean bbb=sp.getBoolean("check", true);
		if(bbb==true)
		mp.start();
		Thread th=new Thread(){
		public void run(){
			try{
				sleep(3000);
			}catch(Exception e){
			e.printStackTrace();
			}finally{
				Intent i=new Intent(OpenImg.this,MainActivity.class);
				startActivity(i);
			}
		}
		};
		th.start();
		
	}
	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		mp.release();
		finish();
	}
	
	
}