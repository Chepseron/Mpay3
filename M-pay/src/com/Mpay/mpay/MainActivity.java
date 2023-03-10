package com.Mpay.mpay;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;
import android.view.View;

import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	Button signIn, signUp;
	EditText userName, password;

	TextView tx1;
	int counter = 3;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		signIn = (Button) findViewById(R.id.button);
		userName = (EditText) findViewById(R.id.unameTxt);
		password = (EditText) findViewById(R.id.pwordTxt);

		signUp = (Button) findViewById(R.id.button2);
		tx1 = (TextView) findViewById(R.id.textView3);
		tx1.setVisibility(View.GONE);

		signIn.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				if (userName.getText().toString().equals("admin") && password.getText().toString().equals("admin")) {
					Toast.makeText(getApplicationContext(), "Redirecting...", Toast.LENGTH_SHORT).show();
				} else {
					Toast.makeText(getApplicationContext(), "Wrong Credentials", Toast.LENGTH_SHORT).show();

					tx1.setVisibility(View.VISIBLE);
					tx1.setBackgroundColor(Color.RED);
					counter--;
					tx1.setText(Integer.toString(counter));

					if (counter == 0) {
						signIn.setEnabled(false);
					}
				}
			}
		});

		signUp.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				finish();
			}
		});
	}
}
