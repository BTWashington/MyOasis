package com.BWash.myoasis_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class User_Registration_Screen extends AppCompatActivity {
	App_Logger app_logger = new App_Logger();

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		app_logger.runLogger(User_Registration_Screen.this, App_Logger.getRunLogger(), App_Logger.getRegistrationTag());
		app_logger.errorMessage(User_Registration_Screen.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user__registration__screen);



		app_logger.endLogger(User_Registration_Screen.this, App_Logger.getEndLogger(), App_Logger.getRegistrationTag());
	}
}