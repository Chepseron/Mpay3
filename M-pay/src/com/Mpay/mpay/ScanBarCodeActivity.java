package com.Mpay.mpay;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;  
import android.view.View;  
import android.content.Intent;  
public class ScanBarCodeActivity extends Activity {
	 Button  btnScanBarcode;  
	@Override
	protected void onCreate(Bundle savedInstanceState) {
	     super.onCreate(savedInstanceState);  
	        setContentView(R.layout.activity_main);  
	        btnScanBarcode = findViewById(R.id.btnScanBarcode);  
	  
	        btnScanBarcode.setOnClickListener(new View.OnClickListener() {  
	            @Override  
	            public void onClick(View view) {  
	                startActivity(new Intent(ScanBarCodeActivity.this, ScannedBarCodeActivity.class));  
	            }  
	        });  
	}
}
