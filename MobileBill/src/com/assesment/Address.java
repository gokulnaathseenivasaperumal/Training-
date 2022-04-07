package com.assesment;

public class Address {
private String doorNumber;
private String streetName;
private String city;
@Override
public String toString() {
	return "Address [doorNumber=" + doorNumber + ", streetName=" + streetName + ", city=" + city + "]";
}
public String getDoorNumber() {
	return doorNumber;
}
public void setDoorNumber(String doorNumber) {
	this.doorNumber = doorNumber;
}
public String getStreetName() {
	return streetName;
}
public void setStreetName(String streetName) {
	this.streetName = streetName;
}
public String getCity() {
	return city;
}
public void setCity(String city) {
	this.city = city;
}
public Address(String doorNumber, String streetName, String city) {
	super();
	this.doorNumber = doorNumber;
	this.streetName = streetName;
	this.city = city;
}
public Address() {
	super();
	// TODO Auto-generated constructor stub
}
}
