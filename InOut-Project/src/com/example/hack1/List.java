package com.example.hack1;

import java.util.ArrayList;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.TextView;
import android.widget.AdapterView.OnItemClickListener;

public class List extends Activity {

	int help;
	private TextView t;
	public ListView l;
	private ArrayList<String> list;
	private ArrayAdapter <String> abc;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.list);
		Intent i = getIntent();
		Bundle b = i.getExtras();
		String s = b.getString("place");
		t=(TextView) findViewById(R.id.textView2);
		l=(ListView) findViewById(R.id.listView1);
		list=new ArrayList<String>();
		if(s.equalsIgnoreCase("North")){
			help=1;
			list.add("Srinagar");
			list.add("New Delhi");
			list.add("Shimla");
			list.add("Agra");
		}
		else if(s.equalsIgnoreCase("East")){
			help=2;
			list.add("Kolkata");
			list.add("Guwahati");
			list.add("Darjeeling");
			list.add("Gangtok");
		}
		else if(s.equalsIgnoreCase("West")){
			help=3;
			list.add("Ahmedabad");
			list.add("Mumbai");
			list.add("Surat");
			list.add("Goa");
		}
		else{
			help=4;
			list.add("Chennai");
			list.add("Banglore");
			list.add("Kanyakumari");
			list.add("Hyderabad");
		}
		t.setText(s);
		abc = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list);
		l.setAdapter(abc);
		l.setOnItemClickListener(new click());
		
	}
	public class click implements OnItemClickListener{

		@Override
		public void onItemClick(AdapterView<?> arg0, View arg1, int arg2,
				long arg3) {
			Intent j = new Intent(List.this,City.class);
			String name=arg0.getItemAtPosition(arg2).toString();
			Bundle b2=new Bundle();
			b2.putInt("key",arg2);
			b2.putInt("help", help);
			b2.putString("name", name);
			j.putExtras(b2);
			startActivity(j);
		}
    	
    }

}
