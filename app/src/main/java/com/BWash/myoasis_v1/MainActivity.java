package com.BWash.myoasis_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		App_Logger app_logger = new App_Logger();
		app_logger.runLogger(MainActivity.this, App_Logger.getRunLogger(), App_Logger.getMainActivityTag());
		app_logger.toastMessageToUser(MainActivity.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		Intent intent = new Intent(MainActivity.this, User_Login_Screen.class);
		startActivity(intent);

		app_logger.endLogger(MainActivity.this, App_Logger.getEndLogger(), App_Logger.getMainActivityTag());
	}
}