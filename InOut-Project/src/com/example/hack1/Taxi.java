package com.example.hack1;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class Taxi extends Activity implements OnClickListener{

	Button b1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.taxi);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			Intent intent = new Intent(Intent.ACTION_DIAL);
		    intent.setData(Uri.parse("tel:(+49)12345789"));
		    if (intent.resolveActivity(getPackageManager()) != null) {
		        startActivity(intent);
			break;
		}
	}
	
}
}
