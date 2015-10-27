package com.example.hack1;

import java.io.InputStream;

import com.google.android.gms.maps.CameraUpdate;
import com.google.android.gms.maps.CameraUpdateFactory;
import com.google.android.gms.maps.GoogleMap;
import com.google.android.gms.maps.MapFragment;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.MarkerOptions;

import android.annotation.SuppressLint;
import android.app.ActionBar.Tab;
import android.app.Activity;
import android.app.Fragment;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RadioGroup.OnCheckedChangeListener;
import android.widget.TabHost;
import android.widget.TabHost.TabSpec;
import android.widget.TextView;

@SuppressLint("NewApi")
public class City extends Activity implements OnCheckedChangeListener, OnClickListener{
	ImageView img1;
	TextView tv1;
	RadioGroup rg1;
	Bitmap bmp;
	RadioButton rb1,rb2,rb3,rb4;
	Button b1,b2;
	int i1,help1;
	String cityName;
	TabHost th;
	GoogleMap map1;

@SuppressLint("NewApi")
@Override
protected void onCreate(Bundle savedInstanceState) {
	// TODO Auto-generated method stub
	super.onCreate(savedInstanceState);
	setContentView(R.layout.city);
	
	th = (TabHost) findViewById(R.id.tabhost);
	th.setup();
	initialize();
	Bundle b1=getIntent().getExtras();
	i1=b1.getInt("key");
	cityName=b1.getString("name");
	help1=b1.getInt("help");
	tv1.setText(cityName);
	TabSpec specs = th.newTabSpec("tag1");
	specs.setContent(R.id.tab1);
	specs.setIndicator("Places To Visit");
	th.addTab(specs);
	
    
	specs = th.newTabSpec("tag2");
	specs.setContent(R.id.tab2);
	map1 = ((MapFragment) getFragmentManager().findFragmentById(R.id.fragment1)).getMap();
	specs.setIndicator("Map viewing Place");
	th.addTab(specs);
	InputStream is;
	switch(help1){
	case 1:
		
		switch(i1){
		case 0:
			is=getResources().openRawResource(R.drawable.n1);
			bmp=BitmapFactory.decodeStream(is);
			img1.setImageBitmap(bmp);
			rb1.setText("Dal Lake");
			rb2.setText("Ladakh");
			rb3.setText("Gulmarg");
			rb4.setText("Sonmarg");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(34.09,74.79))
		    .title("Srinagar"));
			LatLng latLng = new LatLng(34.09,74.79);
		    CameraUpdate cameraUpdate = CameraUpdateFactory.newLatLngZoom(latLng, 10);
		    map1.animateCamera(cameraUpdate);
			break;
			
		case 1:is=getResources().openRawResource(R.drawable.n2);
		bmp=BitmapFactory.decodeStream(is);
		img1.setImageBitmap(bmp);
			rb1.setText("India Gate");
			rb2.setText("Lotus Temple");
			rb3.setText("Rashtrapati Bhavan");
			rb4.setText("Qutub Minar");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(28.6139,77.2090))
		    .title("New Delhi"));
			LatLng latLng1 = new LatLng(28.6139,77.2090);
		    CameraUpdate cameraUpdate1 = CameraUpdateFactory.newLatLngZoom(latLng1, 10);
		    map1.animateCamera(cameraUpdate1);
			break;
			
		case 2:is=getResources().openRawResource(R.drawable.n3);
		bmp=BitmapFactory.decodeStream(is);
		img1.setImageBitmap(bmp);
			rb1.setText("Rohtang");
			rb2.setText("Kufri");
			rb3.setText("Dalhousie");
			rb4.setText("Kasauli");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(31.1033,77.1722))
		    .title("Shimla"));
			LatLng latLng2 = new LatLng(31.1033,77.1722);
		    CameraUpdate cameraUpdate2 = CameraUpdateFactory.newLatLngZoom(latLng2, 10);
		    map1.animateCamera(cameraUpdate2);
			break;
			
		case 3:is=getResources().openRawResource(R.drawable.n4);
		bmp=BitmapFactory.decodeStream(is);
		img1.setImageBitmap(bmp);
			rb1.setText("Taj Mahal");
			rb2.setText("Red Fort");
			rb3.setText("Mathura");
			rb4.setText("Fatehpur Sikri");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(27.18,78.02))
		    .title("Agra"));
			LatLng latLng3 = new LatLng(27.18,78.02);
		    CameraUpdate cameraUpdate3 = CameraUpdateFactory.newLatLngZoom(latLng3, 10);
		    map1.animateCamera(cameraUpdate3);
			break;
		}
		
		break;
		
	case 2:
		is=getResources().openRawResource(R.drawable.abc);
		bmp=BitmapFactory.decodeStream(is);
		switch(i1){
		case 1:
			rb1.setText("Kaziranga");
			rb2.setText("Kamakhya Temple");
			rb3.setText("Umananda Temple");
			rb4.setText("Majuri");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(26.1833,91.7333))
		    .title("Guwahati"));
			LatLng latLng4 = new LatLng(26.1833,91.7333);
		    CameraUpdate cameraUpdate4 = CameraUpdateFactory.newLatLngZoom(latLng4, 10);
		    map1.animateCamera(cameraUpdate4);
			break;
			
		case 2:
			rb1.setText("Tiger Hill");
			rb2.setText("Batasia Loop");
			rb3.setText("Toy Train");
			rb4.setText("Bhutia");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(27.05,88.2667))
		    .title("Darjeeling"));
			LatLng latLng5 = new LatLng(27.05,88.2667);
		    CameraUpdate cameraUpdate5 = CameraUpdateFactory.newLatLngZoom(latLng5, 10);
		    map1.animateCamera(cameraUpdate5);
			break;
			
		case 3:
			rb1.setText("Nathula");
			rb2.setText("Hanuman Tok");
			rb3.setText("Rumtek");
			rb4.setText("Phodong");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(27.33,88.62))
		    .title("Gangtok"));
			LatLng latLng6 = new LatLng(27.33,88.62);
		    CameraUpdate cameraUpdate6 = CameraUpdateFactory.newLatLngZoom(latLng6, 10);
		    map1.animateCamera(cameraUpdate6);
			break;
			
		case 0:
			rb1.setText("Sunderban");
			rb2.setText("Howrah Bridge");
			rb3.setText("Hidden Gardens");
			rb4.setText("Victoria Memorial");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(22.5667,88.3667))
		    .title("Kolkata"));
			LatLng latLng7 = new LatLng(22.5667,88.3667);
		    CameraUpdate cameraUpdate7 = CameraUpdateFactory.newLatLngZoom(latLng7, 10);
		    map1.animateCamera(cameraUpdate7);
			break;
		}
		break;
		
	case 3:
		is=getResources().openRawResource(R.drawable.abc);
		bmp=BitmapFactory.decodeStream(is);
		switch(i1){
		
		case 0:

			rb1.setText("Kachchh");
			rb2.setText("Gir");
			rb3.setText("Kakariya");
			rb4.setText("Adalaj");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(23.03,72.58))
		    .title("Ahmedabad"));
			break;
		
		case 1:
			rb1.setText("Dumas");
			rb2.setText("Dandi");
			rb3.setText("Saputara");
			rb4.setText("Dutch Cemetry");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(21.17,72.83))
		    .title("Surat"));
			break;
			
		case 2:
			rb1.setText("Marine Drive");
			rb2.setText("Gateway Of India");
			rb3.setText("Haji Ali");
			rb4.setText("Elephanta Caves");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(18.975,72.8258))
		    .title("Mumbai"));
			break;
			
		case 3:
			rb1.setText("Kalingut");
			rb2.setText("Varcal");
			rb3.setText("Fort Aguda");
			rb4.setText("Panaji");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(15.4989,73.8278))
		    .title("Goa"));
			break;
			
		
		}
		break;
		
	case 4:
		is=getResources().openRawResource(R.drawable.abc);
		bmp=BitmapFactory.decodeStream(is);
		switch(i1){
		case 1:
			rb1.setText("Coorg");
			rb2.setText("Mangalore Beach");
			rb3.setText("Mysore palace");
			rb4.setText("Bahubali");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(34.09,74.79))
		    .title("Srinagar"));
			break;
			
		case 2:
			rb1.setText("Munnar");
			rb2.setText("Kodai Canal");
			rb3.setText("Thekkedy");
			rb4.setText("Padamamabhaswamy Temple");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(34.09,74.79))
		    .title("Srinagar"));
			break;
			
		case 3:
			rb1.setText("Chaar Minar");
			rb2.setText("Vishakhapatnam");
			rb3.setText("Golkonda");
			rb4.setText("Tirumala Temple");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(34.09,74.79))
		    .title("Hyderabad"));
			break;
			
		case 0:
			rb1.setText("Marina Beach");
			rb2.setText("Pondicherry");
			rb3.setText("Rameshwaram");
			rb4.setText("Kanyakumari");
			map1.addMarker(new MarkerOptions()
		    .position(new LatLng(34.09,74.79))
		    .title("Srinagar"));
			break;
		}
		break;
	}
	
}

private void initialize() {
	// TODO Auto-generated method stub
	img1=(ImageView)findViewById(R.id.imgCity);
	rg1=(RadioGroup)findViewById(R.id.radioGroup1);
	rg1.setOnCheckedChangeListener(this);
	b1=(Button)findViewById(R.id.bView);
	b2=(Button)findViewById(R.id.bAdd);
	b1.setOnClickListener(this);
	b2.setOnClickListener(this);
	tv1=(TextView)findViewById(R.id.textView1);
	rb1=(RadioButton)findViewById(R.id.radio1);
	rb2=(RadioButton)findViewById(R.id.radio2);
	rb3=(RadioButton)findViewById(R.id.radio3);
	rb4=(RadioButton)findViewById(R.id.radio4);
}

@Override
public void onCheckedChanged(RadioGroup group, int checkedId) {
	// TODO Auto-generated method stub
	
	Bitmap bmp2;
	InputStream is1;
	switch(checkedId){
	case R.id.radio1:
		
		
		
		
		
		
		
		switch(help1){
		case 1:
			
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.n1p1);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.n2p1);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.n3p1);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.n4p1);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			
			break;
			
		case 2:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 3:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 4:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);;
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
		}
		break;
		
		
		
		
		
		
		
		
		
	/*	switch(help1){
		case 1:
		switch(i1){
		case 0:
			is1=getResources().openRawResource(R.drawable.n1p1);
			bmp1=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp1);
			break;
		case 1:
			is1=getResources().openRawResource(R.drawable.n1p2);
			bmp1=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp1);
			break;
		case 2:
			is1=getResources().openRawResource(R.drawable.n1p3);
			bmp1=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp1);
			break;
		case 3:
			is1=getResources().openRawResource(R.drawable.n1p4);
			bmp1=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp1);
			break;
			
		}
		break;
		
		case 2:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 2:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 3:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
				
			}
			break;
			
			
		case 3:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 2:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 3:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
				
			}
			
			break;
			
			
		case 4:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 2:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
			case 3:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp1=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp1);
				break;
				
			}
			
			break;
		
		}*/
		
		
	case R.id.radio2:
		switch(help1){
		case 1:
			
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.n1p2);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.n2p2);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.n3p2);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.n4p2);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			
			break;
			
		case 2:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 3:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 4:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);;
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
		}
		break;
		
		
		
	case R.id.radio3:switch(help1){
	case 1:
		
		switch(i1){
		case 0:
			is1=getResources().openRawResource(R.drawable.n1p3);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			
			break;
			
		case 1:
			is1=getResources().openRawResource(R.drawable.n2p3);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			break;
			
		case 2:is1=getResources().openRawResource(R.drawable.n3p3);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
			
		case 3:is1=getResources().openRawResource(R.drawable.n4p3);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
		}
		
		break;
		
	case 2:
		switch(i1){
		case 0:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			
			break;
			
		case 1:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			break;
			
		case 2:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
			
		case 3:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
		}
		break;
		
	case 3:
		switch(i1){
		case 0:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			
			break;
			
		case 1:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			break;
			
		case 2:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
			
		case 3:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
		}
		break;
		
	case 4:
		switch(i1){
		case 0:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
			
			break;
			
		case 1:
			is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);;
			break;
			
		case 2:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
			
		case 3:is1=getResources().openRawResource(R.drawable.abc);
		bmp2=BitmapFactory.decodeStream(is1);
		img1.setImageBitmap(bmp2);
			break;
		}
		break;
	}
	
	break;
		
	case R.id.radio4:
		switch(help1){
		case 1:
			
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.n1p4);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.n2p4);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.n3p4);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.n4p4);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			
			break;
			
		case 2:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 3:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
			
		case 4:
			switch(i1){
			case 0:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);
				
				break;
				
			case 1:
				is1=getResources().openRawResource(R.drawable.abc);
				bmp2=BitmapFactory.decodeStream(is1);
				img1.setImageBitmap(bmp2);;
				break;
				
			case 2:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
				
			case 3:is1=getResources().openRawResource(R.drawable.abc);
			bmp2=BitmapFactory.decodeStream(is1);
			img1.setImageBitmap(bmp2);
				break;
			}
			break;
		}
		
		break;
	}
}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch(v.getId()){
	case R.id.bView:
		Intent i=new Intent(City.this,reviewlist.class);
		Bundle b = new Bundle();
		b.putString("city",cityName);
		i.putExtras(b);
		startActivity(i);
		break;
		
	case R.id.bAdd:
Intent i1=new Intent(City.this,NewReview.class);
		Bundle b1 = new Bundle();
		b1.putString("city",cityName);
		i1.putExtras(b1);
		startActivity(i1);
		break;
	}
}
	
}
