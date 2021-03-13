package com.BWash.myoasis_v1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class User_Login_Screen extends AppCompatActivity {
	App_Logger app_logger = new App_Logger();

	public static final String ATTEMPTS_REMAINING = "No. of attempts remaining: ";

	EditText et_login_username, et_login_password;
	TextView tv_login_title, tv_login_new_user, tv_number_of_attempts, tv_login_third_party;
	Button btn_login_login;

	// Logic Variables
	private boolean isValid = false;
	private String UserName = "admin";
	private String Password = "123456789";
	private int counter = 0;
	private String attempts = ATTEMPTS_REMAINING + counter;


	@Override
	protected void onCreate(Bundle savedInstanceState) {

		// app logger logs data to the Build screen
		app_logger.runLogger(User_Login_Screen.this, App_Logger.getRunLogger(), App_Logger.getLoginTag());
		app_logger.errorMessage(User_Login_Screen.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user__login__screen);

		et_login_password = (EditText) findViewById(R.id.et_login_password);
		et_login_username = (EditText) findViewById(R.id.et_login_username);
		tv_login_title = (TextView) findViewById(R.id.tv_login_title);
		tv_login_new_user = (TextView) findViewById(R.id.tv_login_new_user);
		btn_login_login = (Button) findViewById(R.id.btn_login_login);
		tv_number_of_attempts = (TextView) findViewById(R.id.tv_login_number_of_attempts);
		tv_login_third_party = (TextView) findViewById(R.id.tv_login_third_party);

		btn_login_login.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View v) {
				Toast.makeText(User_Login_Screen.this,"Login Button",Toast.LENGTH_SHORT).show();

				// Get the Username that the user entered
				String UserInputName = et_login_username.getText().toString();
				String UserInputPassword = et_login_password.getText().toString();

				// Checking to see if the User input a value
				if(UserInputName.isEmpty() || UserInputPassword.isEmpty()) {
					Toast.makeText(User_Login_Screen.this, "Please enter both a Username and a password", Toast.LENGTH_SHORT).show();
				}else{
					// using the isValid variable to implement the ValidateUserInput Method
					isValid = ValidateUserInput(UserInputName, UserInputPassword);

					// Checking to see if the entry was valid or not
					if(!isValid){
						counter--;
						app_logger.errorMessage(User_Login_Screen.this, App_Logger.getLogin_Error());

						tv_number_of_attempts.setText(attempts);

						// if the counter is reduced to 0 then the login button will become disabled
						if(counter == 0){
							btn_login_login.setEnabled(false);
						}
					}else{
						Toast.makeText(User_Login_Screen.this, "Login Successful", Toast.LENGTH_SHORT).show();

						// Add the code here to go to new activity
						Intent intent = new Intent(User_Login_Screen.this, Profile_View.class);
						startActivity(intent);



					}
				}




			}
		});

		tv_login_new_user.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				Intent intent = new Intent(User_Login_Screen.this, Registration_Screen.class);
				startActivity(intent);
			}
		});

		tv_login_third_party.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {
				Toast.makeText(User_Login_Screen.this,"Third Party Access",Toast.LENGTH_SHORT).show();
			}
		});




		app_logger.endLogger(User_Login_Screen.this, App_Logger.getEndLogger(), App_Logger.getLoginTag());

	}

	private boolean ValidateUserInput(String name, String password){
		app_logger.runLogger(User_Login_Screen.this, App_Logger.getRunLogger(), App_Logger.getLoginTag());
		app_logger.errorMessage(User_Login_Screen.this, App_Logger.getValidateUserInput());

		if(name.equals(UserName) && password.equals(Password)){
			return true;
		}
		app_logger.endLogger(User_Login_Screen.this, App_Logger.getEndLogger(), App_Logger.getLoginTag());
		return false;
	}





}