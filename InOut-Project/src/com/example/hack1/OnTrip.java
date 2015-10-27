package com.example.hack1;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class OnTrip extends Activity implements OnClickListener{
	
	Button b1,b2;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.ontrip);
		b1=(Button)findViewById(R.id.bTaxi);
		b2=(Button)findViewById(R.id.bHotel);
		b1.setOnClickListener(this);
		b2.setOnClickListener(this);
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bTaxi:
			Intent i=new Intent(OnTrip.this,Taxi.class);
			startActivity(i);
			break;
			
		case R.id.bHotel:
			Intent i1=new Intent(OnTrip.this,Hotel.class);
			startActivity(i1);
			
			break;
		}
	}

}
