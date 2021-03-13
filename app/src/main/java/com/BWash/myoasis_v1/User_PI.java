package com.BWash.myoasis_v1;

public class User_PI {


	//
	private String id;
	private String first_name;
	private String last_name;
	private String UserName;
	private String address_mailing;
	private String city;
	private String state;
	private int zipCode;

	private int territory;
	private String email;
	private long phone;
	private int DateOfBirth;
	private String password;
	private boolean hasVehicle;
	private boolean isActive;

	private boolean hasInsurance;
	private boolean hasWarranty;
	private boolean hasClaims;


	// CONSTRUCTORS FOR PROFILE CONSTRUCTORS
	public User_PI(){}

	// CONSTRUCTOR USED FOR UPDATING NAME AND PROFILE ADDRESS INFORMATION
	public User_PI(String id, String first_name, String last_name, String userName,
				   String address_mailing, String city, String state, int zipCode) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		UserName = userName;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
	}

	// toString() for constructor
	public String nameAndAddresstoString() {
		return "User_PI{" +
				"id='" + id + '\'' +
				", first_name='" + first_name + '\'' +
				", last_name='" + last_name + '\'' +
				", UserName='" + UserName + '\'' +
				", address_mailing='" + address_mailing + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode=" + zipCode +
				'}';
	}

	// CONSTRUCTOR USED ON THE REGISTRATION SCREEN -> PARTIALLY PARAMETERIZED CONSTRUCTOR ->
	// PHONE, EMAIL, DATE OF BIRTH, PASSWORD, HAS VEHICLE, IS ACTIVE

	// Secondary PI Constructor

	public User_PI(int territory, String email, long phone, int dateOfBirth, String password,
				   boolean hasVehicle, boolean isActive) {
		this.territory = territory;
		this.email = email;
		this.phone = phone;
		DateOfBirth = dateOfBirth;
		this.password = password;
		this.hasVehicle = hasVehicle;
		this.isActive = isActive;
	}

	// toString() for constructor
	public String secondaryPItoString() {
		return "User_PI{" +
				"territory=" + territory +
				", email='" + email + '\'' +
				", phone=" + phone +
				", DateOfBirth=" + DateOfBirth +
				", password='" + password + '\'' +
				", hasVehicle=" + hasVehicle +
				", isActive=" + isActive +
				'}';
	}

	// CONSTRUCTOR USED ON THE REGISTRATION SCREEN -> PARTIALLY PARAMETERIZED CONSTRUCTOR
	public User_PI(String id, String first_name, String last_name, String userName,
				   String address_mailing, String city, String state, int zipCode, int territory,
				   String email, long phone, int dateOfBirth, String password, boolean hasVehicle,
				   boolean isActive) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		UserName = userName;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.territory = territory;
		this.email = email;
		this.phone = phone;
		DateOfBirth = dateOfBirth;
		this.password = password;
		this.hasVehicle = hasVehicle;
		this.isActive = isActive;
	}

	// toString() for registration profile constructor
	public String regProfiletoString() {
		return "User_PI{" +
				"id='" + id + '\'' +
				", first_name='" + first_name + '\'' +
				", last_name='" + last_name + '\'' +
				", UserName='" + UserName + '\'' +
				", address_mailing='" + address_mailing + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode=" + zipCode +
				", territory=" + territory +
				", email='" + email + '\'' +
				", phone=" + phone +
				", DateOfBirth=" + DateOfBirth +
				", password='" + password + '\'' +
				", hasVehicle=" + hasVehicle +
				", isActive=" + isActive +
				'}';
	}

	// FULLY PARAMETERIZED CONSTRUCTOR
	public User_PI(String id, String first_name, String last_name, String userName,
				   String address_mailing, String city, String state, int zipCode, int territory,
				   String email, long phone, int dateOfBirth, String password, boolean hasVehicle,
				   boolean hasInsurance, boolean hasWarranty, boolean hasClaims, boolean isActive) {
		this.id = id;
		this.first_name = first_name;
		this.last_name = last_name;
		UserName = userName;
		this.address_mailing = address_mailing;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.territory = territory;
		this.email = email;
		this.phone = phone;
		DateOfBirth = dateOfBirth;
		this.password = password;
		this.hasVehicle = hasVehicle;
		this.hasInsurance = hasInsurance;
		this.hasWarranty = hasWarranty;
		this.hasClaims = hasClaims;
		this.isActive = isActive;
	}

	// toString() for fully parameterized constructor
	@Override
	public String toString() {
		return "User_PI{" +
				"id='" + id + '\'' +
				", first_name='" + first_name + '\'' +
				", last_name='" + last_name + '\'' +
				", UserName='" + UserName + '\'' +
				", address_mailing='" + address_mailing + '\'' +
				", city='" + city + '\'' +
				", state='" + state + '\'' +
				", zipCode=" + zipCode +
				", territory=" + territory +
				", email='" + email + '\'' +
				", phone=" + phone +
				", DateOfBirth=" + DateOfBirth +
				", password='" + password + '\'' +
				", hasVehicle=" + hasVehicle +
				", hasInsurance=" + hasInsurance +
				", hasWarranty=" + hasWarranty +
				", hasClaims=" + hasClaims +
				", isActive=" + isActive +
				'}';
	}

	// Getters and Setters


	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getFirst_name() {
		return first_name;
	}

	public void setFirst_name(String first_name) {
		this.first_name = first_name;
	}

	public String getLast_name() {
		return last_name;
	}

	public void setLast_name(String last_name) {
		this.last_name = last_name;
	}

	public String getUserName() {
		return UserName;
	}

	public void setUserName(String userName) {
		UserName = userName;
	}

	public String getAddress_mailing() {
		return address_mailing;
	}

	public void setAddress_mailing(String address_mailing) {
		this.address_mailing = address_mailing;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public int getZipCode() {
		return zipCode;
	}

	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}

	public int getTerritory() {
		return territory;
	}

	public void setTerritory(int territory) {
		this.territory = territory;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public long getPhone() {
		return phone;
	}

	public void setPhone(long phone) {
		this.phone = phone;
	}

	public int getDateOfBirth() {
		return DateOfBirth;
	}

	public void setDateOfBirth(int dateOfBirth) {
		DateOfBirth = dateOfBirth;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public boolean isHasVehicle() {
		return hasVehicle;
	}

	public void setHasVehicle(boolean hasVehicle) {
		this.hasVehicle = hasVehicle;
	}

	public boolean isHasInsurance() {
		return hasInsurance;
	}

	public void setHasInsurance(boolean hasInsurance) {
		this.hasInsurance = hasInsurance;
	}

	public boolean isHasWarranty() {
		return hasWarranty;
	}

	public void setHasWarranty(boolean hasWarranty) {
		this.hasWarranty = hasWarranty;
	}

	public boolean isHasClaims() {
		return hasClaims;
	}

	public void setHasClaims(boolean hasClaims) {
		this.hasClaims = hasClaims;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean active) {
		isActive = active;
	}
}
