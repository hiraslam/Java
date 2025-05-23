package application;

// we have done the code for account class in the assignment
public class Account {
		  private int id;
		  private double balance;

		  //constructor
		  public Account(int id, double balance) {
		      this.id = id;
		      this.balance = balance;
		  }

		  //getter methods
		  public int getId() {
		      return id;
		  }

		  public double getBalance() {
		      return balance;
		  }

		  //deposit(adding) amount into account balance
		  public void deposit(double amount) {
		      if (amount > 0)
		          balance += amount;
		  }

		  //withdraw(taking out/ subtracting amount from account balance)
		  public void withdraw(double amount) {
		      if (amount > 0 && amount <= balance)
		          balance -= amount;
		  }
		}

