package com.example.hack1;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Toast;

public class NewReview extends Activity implements OnClickListener{

	EditText name,reviewTitle,review;
    Spinner sp;
    RatingBar r;
    Button b1;
    private ArrayAdapter <String> madd;
    private String ExpenseList[] = {"--BUDGET--","Very High- above 500000","Medium-between 100000 to 500000",
    		"Low- less than 100000"
    		};
    String ct;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		Intent j = getIntent();
		Bundle b = j.getExtras();
		ct=b.getString("city");
		super.onCreate(savedInstanceState);
		setContentView(R.layout.review);
		name=(EditText)findViewById(R.id.etName);
		b1=(Button)findViewById(R.id.button1);
		b1.setOnClickListener(this);
		review=(EditText)findViewById(R.id.etReview);
		
		sp=(Spinner)findViewById(R.id.spinner1);
		r=(RatingBar)findViewById(R.id.ratingBar1);
		madd = new ArrayAdapter<String>(this,R.layout.support_simple_spinner_dropdown_item,ExpenseList);
		madd.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item);
		sp.setAdapter(madd);
		
		sp.setSelection(0);
	}

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch(v.getId()){
	case R.id.button1:
		if(name.getText().toString().equalsIgnoreCase("")||review.getText().toString().equalsIgnoreCase("")||sp.getSelectedItem().toString().equalsIgnoreCase("--BUDGET--"))
		{
			Toast.makeText(getApplicationContext(),"No Empty Fields",Toast.LENGTH_SHORT).show();
		}
	     else if(r.getRating()<1)
	 	{
	 		Toast.makeText(getApplicationContext(),"Minimun Rating 1 is expected",Toast.LENGTH_SHORT).show();
	 	}
	     else
	     {
	    	 String nm=name.getText().toString();
	    	 String rev=review.getText().toString();
	    	 String gen=sp.getSelectedItem().toString();
	    	 float rat = r.getRating();
	    	 Intent i = new Intent(NewReview.this,reviewlist.class);
	    	 Bundle b1 = new Bundle();
	    	 b1.putString("city",ct);
	    	 b1.putString("name",nm);
	    	 b1.putString("review",rev);
	    	 b1.putString("gen",gen);
	    	 b1.putFloat("rat",rat);
	    	 i.putExtras(b1);
	    	 startActivity(i);
	    	 System.exit(1);
	     }
		break;
	}
}
	
}
