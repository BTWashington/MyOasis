package com.BWash.myoasis_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class User_Login_Screen extends AppCompatActivity {



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		App_Logger app_logger = new App_Logger();
		app_logger.runLogger(User_Login_Screen.this, App_Logger.getRunLogger(), App_Logger.getLoginTag());
		app_logger.errorMessage(User_Login_Screen.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user__login__screen);



		app_logger.endLogger(User_Login_Screen.this, App_Logger.getEndLogger(), App_Logger.getLoginTag());



	}
}