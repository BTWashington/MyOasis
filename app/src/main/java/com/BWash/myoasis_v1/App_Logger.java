package com.BWash.myoasis_v1;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.nio.file.NoSuchFileException;

public class App_Logger {

	private static final String MAIN_ACTIVITY_TAG = "Main Activity: ";
	private static final String REGISTRATION_TAG = "Registration: ";
	private static final String LOGIN_TAG = "Login: ";
	private static final String PROFILE_VIEW_TAG = "Profile View: ";
	private static final String Registration_Error = "Registration Error";
	private static final String Profile_Error = "Profile Error";
	private static final String Login_Error = "Login Error";
	private static final String RUN_LOGGER = "Run Logger: ";
	private static final String END_LOGGER = "End Logger";

	private static final String ON_CREATE_METHOD = "onCreate Method: ";
	private static final String VALIDATE_USER_INPUT = "Validate User Input Method: ";

	// Logging Detail Variables
	private int logID;
	private String pageName;
	private String methodName;
	private String description;



	// Constructors
	public App_Logger(){}


	public App_Logger(int logID, String pageName, String methodName, String description) {
		this.logID = logID;
		this.pageName = pageName;
		this.methodName = methodName;
		this.description = description;
	}

	// ToString Method
	@Override
	public String toString() {
		return "App_Logger{" +
				"logID=" + logID +
				", pageName='" + pageName + '\'' +
				", methodName='" + methodName + '\'' +
				", description='" + description + '\'' +
				'}';
	}


	// Class Methods
	public void runLogger(Context context, String message, String TAG){
		Log.d(TAG, RUN_LOGGER + context + ": " + message);

	}

	public void endLogger(Context context, String message, String TAG){
		Log.d(TAG, END_LOGGER + ": " + context + ": " + message);
	}

	// Class Exception Toast Methods
	public void errorMessage(Context context, String s){
		Toast.makeText(context, s , Toast.LENGTH_SHORT).show();

	}


	// Getters and Setters


	public static String getMainActivityTag() {
		return MAIN_ACTIVITY_TAG;
	}

	public static String getRegistrationTag() {
		return REGISTRATION_TAG;
	}

	public static String getLoginTag() {
		return LOGIN_TAG;
	}

	public static String getProfileViewTag() {
		return PROFILE_VIEW_TAG;
	}

	public static String getRegistration_Error() {
		return Registration_Error;
	}

	public static String getProfile_Error() {
		return Profile_Error;
	}

	public static String getLogin_Error() {
		return Login_Error;
	}

	public static String getRunLogger() {
		return RUN_LOGGER;
	}

	public static String getEndLogger() {
		return END_LOGGER;
	}

	public static String getOnCreateMethod(){
		return ON_CREATE_METHOD;
	}

	public static String getValidateUserInput() {
		return VALIDATE_USER_INPUT;
	}

	public int getLogID() {
		return logID;
	}

	public void setLogID(int logID) {
		this.logID = logID;
	}

	public String getPageName() {
		return pageName;
	}

	public void setPageName(String pageName) {
		this.pageName = pageName;
	}

	public String getMethodName() {
		return methodName;
	}

	public void setMethodName(String methodName) {
		this.methodName = methodName;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}
}
