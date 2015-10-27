package com.example.hack1;

import com.example.hack1.R;
import com.example.hack1.R.id;

import android.support.v7.app.ActionBarActivity;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Camera;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;


public class MainActivity extends Activity implements OnClickListener {

	Button b1,b2,b4,b3,b5;
	
	View v1,v2;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initialize();
    }


	private void initialize() {
		// TODO Auto-generated method stub
		b1=(Button)findViewById(R.id.btn2);
		b2=(Button)findViewById(R.id.btn1);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
		b3=(Button)findViewById(R.id.bMyExp);
		b3.setOnClickListener(this);
		v1=(View)findViewById(R.id.view1);
		v2=(View)findViewById(R.id.view2);
		b4=(Button) findViewById(R.id.bTrip);
		b4.setOnClickListener(this);
		b5=(Button) findViewById(R.id.bSuit);
		b5.setOnClickListener(this);
		
	}


	@Override
	public boolean onCreateOptionsMenu(android.view.Menu menu) {
		// TODO Auto-generated method stub
		super.onCreateOptionsMenu(menu);
		MenuInflater blow=getMenuInflater();
		blow.inflate(R.menu.about, menu);
		return true;
	}
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		switch(item.getItemId()){
		case R.id.aboutUs:
			Intent i=new Intent("com.example.hack1.AboutUs");
			startActivity(i);
			break;
		
		case R.id.prefer:
			Intent i1=new Intent("com.example.hack1.Prefs");
			startActivity(i1);
			break;
		case R.id.exit:
			finish();
		}
		return true;
	}


	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.btn2:
			Intent i4=new Intent("com.example.hack1.Locate");
			startActivity(i4);
			break;
			
		case R.id.btn1:
			Intent i=new Intent("com.example.hack1.India");
			startActivity(i);
			break;
			
		case R.id.bMyExp:
			Intent i1=new Intent(MainActivity.this,Camera1.class);
			startActivity(i1);
			break;
			
		case R.id.bTrip:
			Intent i3=new Intent(MainActivity.this,OnTrip.class);
			startActivity(i3);
			break;
			
		case R.id.bSuit:
			Intent i5=new Intent(MainActivity.this,Suit.class);
			startActivity(i5);
			break;
		}
	}
}
