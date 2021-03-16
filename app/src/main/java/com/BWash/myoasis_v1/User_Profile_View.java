package com.BWash.myoasis_v1;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.ListView;

import com.BWash.myoasis_v1.dataItems.User_PI;
import com.BWash.myoasis_v1.sample.SampleDataProvider;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class User_Profile_View extends AppCompatActivity {
	App_Logger app_logger = new App_Logger();
	List<User_PI> sampleUserPiList = SampleDataProvider.dataItemList;
	List<User_PI> UserPiList = new ArrayList<>();
	List<String> userList = new ArrayList<>();

	String dataString = "Data to be added for each Profile..." + "\n";

	// XML Layout Variables
	EditText et_pi_view_profile_number,
			et_pi_view_first_name,
			et_pi_view_last_name,
			et_pi_view_user_name,
			et_pi_view_garaging_address,
			tv_pi_view_city,
			tv_pi_view_state,
			et_pi_view_zipcode,
			et_pi_view_territory,
			et_pi_view_email,
			et_pi_view_phone,
			et_pi_view_date_of_birth,
			et_pi_view_password;

	CheckBox cb_pi_view_has_vehicle,
			cb_pi_view_is_active;

	Button btn_pi_view_view_profile_list;

	ListView userProfileListView;



	@Override
	protected void onCreate(Bundle savedInstanceState) {
		app_logger.runLogger(User_Profile_View.this,App_Logger.getRunLogger(),App_Logger.getProfileViewTag());
		app_logger.toastMessageToUser(User_Profile_View.this, App_Logger.getOnCreateMethod());
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_user__profile__view);
		SetUpProfileViews();
		// The List Adapter for strings
		ArrayAdapter<String> adapter = new ArrayAdapter<String>(
				// (context, android layout template, list)
				this, android.R.layout.simple_list_item_1, userList);




		btn_pi_view_view_profile_list.setOnClickListener(new View.OnClickListener() {
			@Override
			public void onClick(View v) {

				// To loop through the list of user profiles
				for(String s : userList){
					userList.add(s);
				}

				// A reference to the list view object

				userProfileListView.setAdapter(adapter);
			}
		});

		app_logger.endLogger(User_Profile_View.this,App_Logger.getEndLogger(),App_Logger.getProfileViewTag());
	}

	private void SetUpProfileViews(){
		app_logger.runLogger(User_Profile_View.this, App_Logger.getRunLogger(),App_Logger.getProfileViewTag());
		app_logger.toastMessageToUser(User_Profile_View.this, App_Logger.getSetupProfileViews());

				try{
					// EDITTEXT
					et_pi_view_profile_number = (EditText)findViewById(R.id.et_pi_view_profile_number);
					et_pi_view_first_name = (EditText) findViewById(R.id.et_pi_view_first_name);
					et_pi_view_last_name = (EditText) findViewById(R.id.et_pi_view_last_name);
					et_pi_view_user_name = (EditText) findViewById(R.id.et_pi_view_user_name);
					et_pi_view_garaging_address = (EditText) findViewById(R.id.et_pi_view_garaging_address);
					tv_pi_view_city = (EditText) findViewById(R.id.et_pi_view_city);
					tv_pi_view_state = (EditText) findViewById(R.id.et_pi_view_state);
					et_pi_view_zipcode = (EditText) findViewById(R.id.et_pi_view_zipcode);
					et_pi_view_territory = (EditText) findViewById(R.id.et_pi_view_territory);
					et_pi_view_email = (EditText) findViewById(R.id.et_pi_view_email);
					et_pi_view_phone = (EditText) findViewById(R.id.et_pi_view_phone);
					et_pi_view_date_of_birth = (EditText) findViewById(R.id.et_pi_view_date_of_birth);
					et_pi_view_password = (EditText) findViewById(R.id.et_pi_view_password);

					// CHECKBOX
					cb_pi_view_has_vehicle = (CheckBox) findViewById(R.id.cb_pi_view_has_vehicle);
					cb_pi_view_is_active = (CheckBox) findViewById(R.id.cb_pi_view_is_active);

					// LISTVIEW
					userProfileListView = (ListView) findViewById(R.id.lv_pi_view_user_profile_list);

				}catch(Exception e){

					app_logger.toastMessageToUser(User_Profile_View.this, App_Logger.getProfileViewsFailure());
				}


		app_logger.endLogger(User_Profile_View.this, App_Logger.getEndLogger(), App_Logger.getProfileViewTag());
		app_logger.toastMessageToUser(User_Profile_View.this, App_Logger.getProfileViewsSuccess());
	}












}