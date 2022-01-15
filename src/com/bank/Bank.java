package com.bank;

import java.util.Scanner;

public class Bank {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		User user = new User();
		ExecutionImpl ex = new ExecutionImpl();
		int choice;
		boolean istrue = true;
		
		while(istrue) {
			System.out.println("enter 1 for balance check.");
			System.out.println("enter 2 for withdrawal");
			System.out.println("enter 3 for deposit");
			choice = sc.nextInt();
			if(choice==1) {
				try {
					System.out.println("enter the user ID");
					user.setUserId(sc.nextInt());
					sc.nextLine();
					
					System.out.println("enter the name");
					user.setName(sc.nextLine());
					
					System.out.println("enter the city");
					user.setCity(sc.nextLine());
					
					System.out.println("enter the state");
					user.setState(sc.nextLine());
					
					System.out.println("enter the country");
					user.setCountry(sc.nextLine());
					
					System.out.println("enter the phone number");
					user.setPhoneNumber(sc.nextLong());
					ex.checkBalance(user);
				}
				catch (Exception e) {
					System.out.println(e);
					istrue = false;
				}
			}
			else if(choice==2) {
				try {
					System.out.println("enter the user ID");
					user.setUserId(sc.nextInt());
					sc.nextLine();
					System.out.println("enter the name");
					user.setName(sc.nextLine());
					
					System.out.println("enter the city");
					user.setCity(sc.nextLine());
					
					System.out.println("enter the state");
					user.setState(sc.nextLine());
					
					System.out.println("enter the country");
					user.setCountry(sc.nextLine());
					
				System.out.println("enter the phone number");
					user.setPhoneNumber(sc.nextLong());
					
					System.out.println("Enter the amount you want to withdraw");
					user.setBalance(sc.nextDouble());
					
					ex.withdraw(user);
				}
				catch(Exception e) {
					System.out.println(e);
					istrue = false;
				}
			}
			else if(choice==3) {
				try {
					System.out.println("enter the user ID");
					user.setUserId(sc.nextInt());
					sc.nextLine();
					
					System.out.println("enter the name");
					user.setName(sc.nextLine());
					
					System.out.println("enter the city");
					user.setCity(sc.nextLine());
					
					System.out.println("enter the state");
					user.setState(sc.nextLine());
					
					System.out.println("enter the country");
					user.setCountry(sc.nextLine());
					
					System.out.println("enter the phone number");
					user.setPhoneNumber(sc.nextLong());
					
					System.out.println("Enter the amount you want to deposit");
					user.setBalance(sc.nextDouble());
					
					ex.deposit(user);
				}
				catch(Exception e) {
					System.out.println(e);
					istrue = false;
				}
			}
			else {
				
				istrue = false;
				break;
			}
		}

		System.out.println("Exiting from the program");
		System.out.println("thanks for using the program");
		
		sc.close();
	}
}
