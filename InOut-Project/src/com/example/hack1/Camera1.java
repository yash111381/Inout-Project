package com.example.hack1;

import java.io.InputStream;


import android.app.Activity;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ListView;

public class Camera1 extends Activity implements OnClickListener{

	Button bPhoto;
	EditText etExp;
	Bitmap bmp;
	String exp;
	ListView lv1;
	ImageView ig;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.cam);
		initialize();
		InputStream is=getResources().openRawResource(R.drawable.travel);
		bmp=BitmapFactory.decodeStream(is);
		ig.setImageBitmap(bmp);
		exp=etExp.getText().toString();
	}
	private void initialize() {
		// TODO Auto-generated method stub
		bPhoto=(Button)findViewById(R.id.bAddPhoto);
		etExp=(EditText)findViewById(R.id.editTextExp);
		lv1=(ListView)findViewById(R.id.listViewPhoto);
		bPhoto.setOnClickListener(this);
		ig=(ImageView)findViewById(R.id.imgView1);
	}
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		switch(v.getId()){
		case R.id.bAddPhoto:
			Intent ii=new Intent(android.provider.MediaStore.ACTION_IMAGE_CAPTURE);
			startActivityForResult(ii, 123);
			break;
		}
	}
	@Override
	protected void onActivityResult(int requestCode, int resultCode, Intent data) {
		// TODO Auto-generated method stub
		super.onActivityResult(requestCode, resultCode, data);
		if(requestCode==123 && resultCode==Activity.RESULT_OK){
			Bundle b=data.getExtras();
			bmp=(Bitmap)b.get("data");
			ig.setImageBitmap(bmp);
		}

}
}
