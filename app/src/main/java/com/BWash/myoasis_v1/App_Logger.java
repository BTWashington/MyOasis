package com.BWash.myoasis_v1;

import android.content.Context;
import android.util.Log;
import android.widget.Toast;

import java.nio.file.NoSuchFileException;
import java.security.Timestamp;

public class App_Logger {

	private static final String MAIN_ACTIVITY_TAG = "Main Activity: ";

	private static final String Registration_Error = "Registration Error";
	private static final String REGISTRATION_TAG = "Registration: ";

	private static final String PROFILE_VIEW_TAG = "Profile View: ";
	private static final String Profile_Error = "Profile Error";
	private static final String Profile_Error_Column_Fill = "ERROR";

	private static final String LOGIN_TAG = "Login: ";
	private static final String Login_Error = "Login Error";
	private static final String Login_Error_incorrect_password = "Login Failed: Incorrect Password";
	private static final String Login_Successful = "Login Success";

	private static final String RUN_LOGGER = "Run Logger: ";
	private static final String END_LOGGER = "End Logger";

	private static final String ON_CREATE_METHOD = "onCreate Method: ";
	private static final String VALIDATE_USER_INPUT = "Validate User Input Method: ";
	private static final String USER_INPUT_VALIDATED = "User input is validated";
	private static final String USER_INPUT_NOT_VALIDATED = "User input is NOT validated";
	private static final String SETUP_UI_VIEWS = "Setup UI Views Method: ";
	private static final String UI_VIEW_SETUP_SUCCESS = "UI Setup Success";
	private static final String UI_VIEW_SETUP_FAILURE = "UI Setup Failure";

	// Logging Detail Variables
	private int logID;
	private Timestamp timestamp;
	private String pageName;
	private String methodName;
	private String description;



	// Constructors
	public App_Logger(){}


	public App_Logger(int logID, Timestamp timestamp, String pageName, String methodName, String description) {
		this.logID = logID;
		this.timestamp = timestamp;
		this.pageName = pageName;
		this.methodName = methodName;
		this.description = description;
	}

	@Override
	public String toString() {
		return "App_Logger{" +
				"logID=" + logID +
				", timestamp=" + timestamp +
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
	public void toastMessageToUser(Context context, String s){
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

	public static String getProfile_Error_Column_Fill() {
		return Profile_Error_Column_Fill;
	}

	public static String getLogin_Error() {
		return Login_Error;
	}

	public static String getLogin_Error_incorrect_password() {
		return Login_Error_incorrect_password;
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

	public static String getUserInputValidated() {
		return USER_INPUT_VALIDATED;
	}

	public static String getUserInputNotValidated() {
		return USER_INPUT_NOT_VALIDATED;
	}

	public static String getSetupUiViews() {
		return SETUP_UI_VIEWS;
	}

	public static String getUiViewSetupSuccess() {
		return UI_VIEW_SETUP_SUCCESS;
	}

	public static String getUiViewSetupFailure() {
		return UI_VIEW_SETUP_FAILURE;
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

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

	public static String getLogin_Successful() {
		return Login_Successful;
	}
}
