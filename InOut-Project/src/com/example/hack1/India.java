package com.example.hack1;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnFocusChangeListener;
import android.widget.Button;
import android.widget.TextView;

public class India extends Activity {
    private Button tvn,tve,tvw,tvs;
    private ColorStateList c;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.india);
		tvn = (Button) findViewById(R.id.textView1);
		tve = (Button) findViewById(R.id.textView2);
		tvw = (Button) findViewById(R.id.textView3);
		tvs = (Button) findViewById(R.id.textView4);
		
		
	}
	
	public void oncl1(View v){
		
			Intent i = new Intent(India.this,List.class);
			Bundle b = new Bundle();
			b.putString("place","North");
			i.putExtras(b);
			startActivity(i);
	}
	
	public void oncl2(View v){
		
		Intent i = new Intent(India.this,List.class);
		Bundle b = new Bundle();
		b.putString("place","East");
		i.putExtras(b);
		startActivity(i);
}
	
	public void oncl3(View v){
		
		Intent i = new Intent(India.this,List.class);
		Bundle b = new Bundle();
		b.putString("place","West");
		i.putExtras(b);
		startActivity(i);
}
	
	public void oncl4(View v){
		
		Intent i = new Intent(India.this,List.class);
		Bundle b = new Bundle();
		b.putString("place","South");
		i.putExtras(b);
		startActivity(i);
      }
		
		
		
	
	

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
