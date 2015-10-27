package com.example.hack1;

import java.util.Calendar;
import android.app.Activity;
import android.app.DatePickerDialog;
import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.DatePicker;
import android.widget.TextView;
import android.widget.Toast;

public class Date1 extends Activity implements OnClickListener {

   private DatePicker datePicker;
   private Calendar calendar;
   private TextView dateView,dateView2;
   private int year, month, day;
   Button b1;

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.way);
      dateView = (TextView) findViewById(R.id.textView3);
      dateView2=(TextView)findViewById(R.id.textView6);
      calendar = Calendar.getInstance();
      year = calendar.get(Calendar.YEAR);
      month = calendar.get(Calendar.MONTH);
      day = calendar.get(Calendar.DAY_OF_MONTH);
      showDate(year, month+1, day);
      showDate2(year, month+1, day);
      b1=(Button)findViewById(R.id.bNext);
      b1.setOnClickListener(this);
   }

   @SuppressWarnings("deprecation")
   public void setDate(View view) {
      showDialog(999);
   }
   
   @SuppressWarnings("deprecation")
   public void setDate2(View view) {
      showDialog(999);
   }

   @Override
   protected Dialog onCreateDialog(int id) {
   // TODO Auto-generated method stub
      if (id == 999) {
         return new DatePickerDialog(this, myDateListener, year, month, day);
       }
      return null;
   }

   private DatePickerDialog.OnDateSetListener myDateListener
   = new DatePickerDialog.OnDateSetListener() {

   @Override
   public void onDateSet(DatePicker arg0, int arg1, int arg2, int arg3) {
      // TODO Auto-generated method stub
      // arg1 = year
      // arg2 = month
      // arg3 = day
      showDate(arg1, arg2+1, arg3);
   }
   };

   private void showDate(int year, int month, int day) {
      dateView.setText(new StringBuilder().append(day).append("/")
      .append(month).append("/").append(year));
   }
   
   private void showDate2(int year, int month, int day) {
	      dateView2.setText(new StringBuilder().append(day).append("/")
	      .append(month).append("/").append(year));
	   }

   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

@Override
public void onClick(View v) {
	// TODO Auto-generated method stub
	switch(v.getId()){
	case R.id.bNext:
		Intent i1=new Intent(Date1.this,null);
		startActivity(i1);
		break;
	}
}

}
