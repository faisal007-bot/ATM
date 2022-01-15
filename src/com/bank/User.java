package com.bank;

public class User {
	private int userId;
	private String name;
	private long phoneNumber;
	private String city;
	private String state;
	private String country;
	private double balance;
	
	public double getBalance() {
		return balance;
	}
	public void setBalance(double balance) {
		this.balance = balance;
	}
	public int getUserId() {
		return userId;
	}
	public void setUserId(int userId) {
		this.userId = userId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public long getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(long phoneNumber) {
		this.phoneNumber = phoneNumber;
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
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public User(int userId, String name, long phoneNumber, String city, String state, String country, double balance) {
		super();
		this.userId = userId;
		this.name = name;
		this.phoneNumber = phoneNumber;
		this.city = city;
		this.state = state;
		this.country = country;
		this.balance = balance;
	}
	public User() {
		super();
	}
	@Override
	public String toString() {
		return "User [userId=" + userId + ", name=" + name + ", phoneNumber=" + phoneNumber + ", city=" + city
				+ ", state=" + state + ", country=" + country + ", balance=" + balance + "]";
	}
}
