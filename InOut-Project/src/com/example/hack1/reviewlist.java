package com.example.hack1;

import java.util.ArrayList;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Intent;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.RatingBar;
import android.widget.TextView;

public class reviewlist extends Activity{
	private TextView t;
	private RatingBar rr;
	String city;
	private ListView ls;
    private ArrayAdapter <String> abc;
    private ArrayList<String> list1;
    public SQLiteDatabase db;
    public static final String DATABASE_NM="abc.db";
    public static final String TABLE_NM="mop1";
	@SuppressLint("NewApi")
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.reviewlist);
		t=(TextView) findViewById(R.id.textView1);
		rr=(RatingBar) findViewById(R.id.ratingBar1);
		db=openOrCreateDatabase(DATABASE_NM,SQLiteDatabase.CREATE_IF_NECESSARY,null);
	    db.execSQL("CREATE TABLE IF NOT EXISTS " + TABLE_NM + " (Name VARCHAR(20),Review VARCHAR(20),Budget VARCHAR(20),Rating FLOAT,City VARCHAR(20));");
		Intent i1 = getIntent();
		Bundle b = i1.getExtras();
		if(b!=null)
		{city = b.getString("city");
		String nm=b.getString("name");
   	 String revw=b.getString("review");
   	 String gen=b.getString("gen");
   	 float rat = b.getFloat("rat");
	 t.setText(city);
	 if(nm!=null){
     db.execSQL("INSERT INTO " + TABLE_NM + " VALUES ('"+nm+"','"+revw+"','"+gen+"',"+rat+",'"+city+"');");
	 }
		}
		
		ls = (ListView) findViewById(R.id.listView2);
		list1 = new ArrayList<String>();
		Cursor c = db.rawQuery("SELECT * FROM " + TABLE_NM + " WHERE City = '" + city +"';",null);
		if(c.moveToFirst()){
			list1.add(c.getString(0)+" rated it " + c.getFloat(3) + "\n" + c.getString(1));
		while(c.moveToNext()){
			list1.add(c.getString(0)+" rated it " + c.getFloat(3) + "\n" + c.getString(1));
    	  }
        }
		abc = new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,list1);
		ls.setAdapter(abc);
		c.close();
		Cursor c1 = db.rawQuery("SELECT AVG(Rating) FROM " + TABLE_NM + " WHERE City = '" + city +"';",null);
		if(c1.moveToFirst()){
			rr.setRating(c1.getFloat(0));
		}
		c1.close();
		db.close();
		
	}

}
