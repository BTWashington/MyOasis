package com.BWash.myoasis_v1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.SwitchCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class User_Registration_Screen extends AppCompatActivity {
	App_Logger app_logger = new App_Logger();

	// Layout Variables
	EditText et_reg_first_name,
			et_reg_last_name,
			et_reg_user_name,
			et_reg_street_address,
			et_reg_city,
			et_reg_state,
			et_reg_zip_code,
			et_reg_territory,
			et_reg_email,
			et_reg_phone,
			et_reg_date_of_birth,
			et_reg_password;

	Switch sw_reg_has_vehicle;

	Button btn_reg_register;

	TextView tv_reg_already_signed_in,
			tv_reg_profile_number;

	CheckBox cb_active_profile;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		app_logger.runLogger(User_Registration_Screen.this, App_Logger.getRunLogger(), App_Logger.getRegistrationTag());
		app_logger.toastMessageToUser(User_Registration_Screen.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user__registration__screen);

		setUIViews();

		// BUTTON CLICK FOR REGISTERING A PROFILE
		btn_reg_register.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				// Created an instance of a user_pi profile
				User_PI user_pi;

				try{
					// Using the registration constructor from the USER_PI class
					user_pi = new User_PI(
							tv_reg_profile_number.getText().toString(),
					        et_reg_first_name.getText().toString(),
					        et_reg_last_name.getText().toString(),
					        et_reg_user_name.getText().toString(),
					        et_reg_street_address.getText().toString(),
					        et_reg_city.getText().toString(),
					        et_reg_state.getText().toString(),
							// Using (.parseInt) to pull in the value of the integer  ****
							Integer.parseInt(et_reg_zip_code.getText().toString()),
							Integer.parseInt(et_reg_territory.getText().toString()),
							et_reg_email.getText().toString(),
							Integer.parseInt(et_reg_phone.getText().toString()),
							Integer.parseInt(et_reg_date_of_birth.getText().toString()),
							et_reg_password.getText().toString(),
							// Using (.isChecked) to pull in the value of the boolean
							sw_reg_has_vehicle.isChecked(),
					        cb_active_profile.isChecked()


					);


				}catch(Exception e){
					user_pi = new User_PI(
							"-1",
							App_Logger.getProfile_Error_Column_Fill(),
							App_Logger.getProfile_Error_Column_Fill(),
							App_Logger.getProfile_Error_Column_Fill(),
							App_Logger.getProfile_Error_Column_Fill(),
							App_Logger.getProfile_Error_Column_Fill(),
							App_Logger.getProfile_Error_Column_Fill(),
							-1,
							-1,
							App_Logger.getProfile_Error_Column_Fill(),
							-1,
							-1,
							App_Logger.getProfile_Error_Column_Fill(),
							false,
							false);
					app_logger.toastMessageToUser(User_Registration_Screen.this,App_Logger.getRegistration_Error());
					app_logger.toastMessageToUser(User_Registration_Screen.this, user_pi.toString());
				}

				// SQL to enter data into Database








			}
		});



		app_logger.endLogger(User_Registration_Screen.this, App_Logger.getEndLogger(), App_Logger.getRegistrationTag());
	}

	private void setUIViews(){
		app_logger.runLogger(User_Registration_Screen.this, App_Logger.getRunLogger(), App_Logger.getSetupUiViews());

		    try{
				// Set up EditText XML Connection
				et_reg_first_name = (EditText) findViewById(R.id.et_reg_first_name);
				et_reg_last_name = (EditText) findViewById(R.id.et_reg_last_name);
				et_reg_user_name = (EditText) findViewById(R.id.et_reg_user_name);
				et_reg_street_address = (EditText) findViewById(R.id.et_reg_street_address);
				et_reg_city = (EditText) findViewById(R.id.et_reg_city);
				et_reg_state = (EditText) findViewById(R.id.et_reg_state);
				et_reg_zip_code = (EditText) findViewById(R.id.et_reg_zip_code);
				et_reg_territory = (EditText) findViewById(R.id.et_reg_territory);
				et_reg_email = (EditText) findViewById(R.id.et_reg_email);
				et_reg_phone = (EditText) findViewById(R.id.et_reg_phone);
				et_reg_date_of_birth = (EditText) findViewById(R.id.et_reg_date_of_birth);
				et_reg_password = (EditText) findViewById(R.id.et_reg_password);

				// Set up TextView XML Connection
				tv_reg_already_signed_in = (TextView) findViewById(R.id.tv_reg_already_signed_in);
				tv_reg_profile_number = (TextView) findViewById(R.id.tv_reg_profile_number);

				// Set up Switches XML Connection
				sw_reg_has_vehicle = findViewById(R.id.sw_reg_has_vehicle);

				// Set up CheckBox XML Connection
				cb_active_profile = findViewById(R.id.cb_reg_active_profile);

				// Set up Button XML Connection
				btn_reg_register = findViewById(R.id.btn_reg_registration);



			}catch(Exception e){
		    	// UI Set up Failure -> Toast to the User
				app_logger.toastMessageToUser(User_Registration_Screen.this,App_Logger.getUiViewSetupFailure());

				// Reload a fresh Registration screen on failure
				Intent intent = new Intent(User_Registration_Screen.this,User_Registration_Screen.class);
				startActivity(intent);
			}

		app_logger.toastMessageToUser(User_Registration_Screen.this,App_Logger.getUiViewSetupSuccess());
		app_logger.endLogger(User_Registration_Screen.this, App_Logger.getEndLogger(),App_Logger.getRegistrationTag());
	}









}