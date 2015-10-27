package com.example.hack1;

import java.io.InputStream;

import android.app.Activity;
import android.content.Intent;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.TextView;

public class City1 extends Activity implements OnClickListener{
	Button b1;
	CheckBox rb1,rb2,rb3,rb4;
	int i1,help1;
	String cityName;
	TextView tv1;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.city1);
		b1=(Button)findViewById(R.id.bDone);
		b1.setOnClickListener(this);
		rb1=(CheckBox)findViewById(R.id.rd1);
		rb2=(CheckBox)findViewById(R.id.rd2);
		rb3=(CheckBox)findViewById(R.id.rd3);
		rb4=(CheckBox)findViewById(R.id.rd4);
		tv1=(TextView)findViewById(R.id.textView1);
		Bundle b1=getIntent().getExtras();
		i1=b1.getInt("key");
		cityName=b1.getString("name");
		help1=b1.getInt("help");
		tv1.setText(cityName);
		
		
		
		
		switch(help1){
		case 1:
			
			switch(i1){
			case 0:
				
				rb1.setText("Dal Lake");
				rb2.setText("Ladakh");
				rb3.setText("Gulmarg");
				rb4.setText("Sonmarg");
				break;
				
			case 1:
				rb1.setText("India Gate");
				rb2.setText("Lotus Temple");
				rb3.setText("Rashtrapati Bhavan");
				rb4.setText("Qutub Minar");
				break;
				
			case 2:
				rb1.setText("Rohtang");
				rb2.setText("Kufri");
				rb3.setText("Dalhousie");
				rb4.setText("Kasauli");
				break;
				
			case 3:
				rb1.setText("Taj Mahal");
				rb2.setText("Red Fort");
				rb3.setText("Mathura");
				rb4.setText("Fatehpur Sikri");
				break;
			}
			
			break;
			
		case 2:
			
			switch(i1){
			case 1:
				rb1.setText("Kaziranga");
				rb2.setText("Kamakhya Temple");
				rb3.setText("Umananda Temple");
				rb4.setText("Majuri");
				break;
				
			case 2:
				rb1.setText("Tiger Hill");
				rb2.setText("Batasia Loop");
				rb3.setText("Toy Train");
				rb4.setText("Bhutia");
				break;
				
			case 3:
				rb1.setText("Nathula");
				rb2.setText("Hanuman Tok");
				rb3.setText("Rumtek");
				rb4.setText("Phodong");
				break;
				
			case 0:
				rb1.setText("Sunderban");
				rb2.setText("Howrah Bridge");
				rb3.setText("Hidden Gardens");
				rb4.setText("Victoria Memorial");
				break;
			}
			break;
			
		case 3:
			
			switch(i1){
			
			case 0:

				rb1.setText("Kachchh");
				rb2.setText("Gir");
				rb3.setText("Kakariya");
				rb4.setText("Adalaj");
				break;
			
			case 1:
				rb1.setText("Dumas");
				rb2.setText("Dandi");
				rb3.setText("Saputara");
				rb4.setText("Dutch Cemetry");
				break;
				
			case 2:
				rb1.setText("Marine Drive");
				rb2.setText("Gateway Of India");
				rb3.setText("Haji Ali");
				rb4.setText("Elephanta Caves");
				break;
				
			case 3:
				rb1.setText("Kalingut");
				rb2.setText("Varcal");
				rb3.setText("Fort Aguda");
				rb4.setText("Panaji");
				break;
				
			
			}
			break;
			
		case 4:
			
			switch(i1){
			case 1:
				rb1.setText("Coorg");
				rb2.setText("Mangalore Beach");
				rb3.setText("Mysore palace");
				rb4.setText("Bahubali");
				break;
				
			case 2:
				rb1.setText("Munnar");
				rb2.setText("Kodai Canal");
				rb3.setText("Thekkedy");
				rb4.setText("Padamamabhaswamy Temple");
				break;
				
			case 3:
				rb1.setText("Chaar Minar");
				rb2.setText("Vishakhapatnam");
				rb3.setText("Golkonda");
				rb4.setText("Tirumala Temple");
				break;
				
			case 0:
				rb1.setText("Marina Beach");
				rb2.setText("Pondicherry");
				rb3.setText("Rameshwaram");
				rb4.setText("Kanyakumari");
				break;
			}
			break;
		}
		
		
		
		
		
		
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bDone:
			Intent i=new Intent(City1.this,Date1.class);
			startActivity(i);
			break;
		}
	}
}