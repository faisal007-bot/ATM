package com.bank;

public interface Execution {
	void checkBalance(User user);
	void deposit(User user);
	void withdraw(User user);
}
