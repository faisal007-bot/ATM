package com.bank;

import java.util.Random;

public class ExecutionImpl implements Execution {

	@Override
	public void checkBalance(User user) {
		boolean isvalid = false;
		int totalBalance = new Random().nextInt(1000000);
		if (user.getUserId() > 1000 && user.getUserId() < 9999) {
			for (int i = 0; i < user.getName().length(); i++) {
				if (user.getName().charAt(i) >= 'a' && user.getName().charAt(i) <= 'z'
						|| user.getName().charAt(i) >= 'A' && user.getName().charAt(i) <= 'Z') {
					isvalid = true;
				}
				else {
					isvalid = false;
				}
			}
			if (isvalid) {
				if (user.getCountry().toLowerCase().contains("india")) {
					if (user.getPhoneNumber() >= 1000000000l && user.getPhoneNumber() <= 9999999999l) {
						System.out.println(user.getUserId());
						System.out.println(user.getName().toUpperCase());
						System.out.println(user.getPhoneNumber());
						System.out.println(user.getCity().toUpperCase());
						System.out.println(user.getState().toUpperCase());
						System.out.println(user.getCountry().toUpperCase());
						System.out.println("---------------------------------------------------------------------------------------------");
						System.out.println("total balance in your account = " + totalBalance + " Rupees");
					}
					else {
						System.out.println("phone number is invalid = "+user.getPhoneNumber());
					}
				}
				else {
					System.out.println("country is incorrect = "+user.getCountry());
				}
			}
			else if(!isvalid){
				System.out.println("username is inccorect ="+user.getName());
			}
		}
		else {
			System.out.println("user ID is invalid = "+user.getUserId());
		}
	}

	@Override
	public void deposit(User user) {
		boolean isvalid = false;
		int totalBalance = new Random().nextInt(1000000);
		if (user.getUserId() > 1000 && user.getUserId() < 9999) {
			for (int i = 0; i < user.getName().length(); i++) {
				if (user.getName().charAt(i) >= 'a' && user.getName().charAt(i) <= 'z'
						|| user.getName().charAt(i) >= 'A' && user.getName().charAt(i) <= 'Z') {
					isvalid = true;
				}
				else {
					isvalid = false;
				}
			}
			if (isvalid) {
				if (user.getCountry().toLowerCase().contains("india")) {
					if (user.getPhoneNumber() >= 1000000000l && user.getPhoneNumber() <= 9999999999l) {
						if(user.getBalance()<0) {
							System.out.println("the deposit amount cannot be less than 0");
							System.out.println("try again");
							System.exit(100);
						}
						else {
							System.out.println(user.getUserId());
							System.out.println(user.getName().toUpperCase());
							System.out.println(user.getPhoneNumber());
							System.out.println(user.getCity().toUpperCase());
							System.out.println(user.getState().toUpperCase());
							System.out.println(user.getCountry().toUpperCase());
							System.out.println("---------------------------------------------------------------------------------------------");
							System.out.println("total balance in your account = " + totalBalance + " Rupees");
							System.out.println("your deposit amount = "+user.getBalance()+" Rupees");
							System.out.println("After depositing you have "+user.getBalance()+totalBalance+" Rupees");
						}
					}
					else {
						System.out.println("phone number is invalid = "+user.getPhoneNumber());
					}
				}
				else {
					System.out.println("country in incorrect = "+user.getCountry());
				}
			}
			else if(!isvalid){
				System.out.println("user name is incorrect = "+user.getName());
			}
		}
		else {
			System.out.println("user ID is invalid  = "+user.getUserId());
		}
	}

	@Override
	public void withdraw(User user) {
		boolean isvalid = false;
		int totalBalance = new Random().nextInt(1000000);
		user.getName().toLowerCase();
		user.getCity().toLowerCase();
		user.getState().toLowerCase();
		user.getCountry().toLowerCase();
		if (user.getUserId() >= 1000 && user.getUserId() <= 9999) {
			for (int i = 0; i < user.getName().length(); i++) {
				if (user.getName().charAt(i) >= 'a' && user.getName().charAt(i) <= 'z'
						|| user.getName().charAt(i) >= 'A' && user.getName().charAt(i) <= 'Z') {
					isvalid = true;
				}
				else {
					isvalid = false;
				}
			}
			if (isvalid) {
				if (user.getCountry().toLowerCase().contains("india")) {
					if (user.getPhoneNumber() >= 1000000000l && user.getPhoneNumber() <= 9999999999l) {
						if(user.getBalance()>totalBalance || user.getBalance()<0) {
							System.out.println("total amount in your account = "+totalBalance +" Rupees and withdrawal amount is invalid"
						+user.getBalance()+" Rupees");
							System.exit(200);
						}
						else {
							System.out.println(user.getUserId());
							System.out.println(user.getName().toUpperCase());
							System.out.println(user.getPhoneNumber());
							System.out.println(user.getCity().toUpperCase());
							System.out.println(user.getState().toUpperCase());
							System.out.println(user.getCountry().toUpperCase());
							System.out.println("---------------------------------------------------------------------------------------------");
							System.out.println("total balance in your account ="+totalBalance+" Rupees");
							System.out.println("your withdrawal amount = "+user.getBalance()+" Rupees");
							System.out.println("balance left in your account after withdrawal = "+(totalBalance-user.getBalance())+" Rupees");
						}
					}
					else {
						System.out.println("phone number is invalid = "+user.getPhoneNumber());
					}
				}
				else {
					System.out.println("country is incorrect = "+user.getCountry());
				}
			}
			else if(!isvalid) {
				System.out.println("user name is incorrect = "+user.getName());
			}
		}
		else {
			System.out.println("user ID is invalid = "+user.getUserId());
		}
	}

}
