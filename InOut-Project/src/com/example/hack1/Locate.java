package com.example.hack1;

import android.app.Activity;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Locate extends Activity implements OnClickListener{
	EditText et1;
	TextView tv1;
	Button b1;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.locate);
		et1=(EditText)findViewById(R.id.editText1);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		tv1=(TextView)findViewById(R.id.textView1);
		SharedPreferences sp = PreferenceManager
				.getDefaultSharedPreferences(getBaseContext());
		int expense = sp.getInt("exp", 250000);
		String userName=sp.getString("name", "User");
		tv1.setText("Hello "+userName);
		switch(expense){
		case 600000:
			Toast.makeText(getApplicationContext(), "You have selected high expenses", Toast.LENGTH_SHORT).show();
			break;
			
		case 250000:
			Toast.makeText(getApplicationContext(), "You have selected medium expenses", Toast.LENGTH_SHORT).show();
			
			break;
			
		case 50000:
			Toast.makeText(getApplicationContext(), "You have selected low expenses", Toast.LENGTH_SHORT).show();
			
			break;
		}
	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.button1:
			Intent i=new Intent(Locate.this,India1.class);
			Bundle b=new Bundle();
			b.putString("location", et1.getText().toString());
			i.putExtras(b);
			startActivity(i);
			break;
		}
	}
}
