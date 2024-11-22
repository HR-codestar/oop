package test;

public class banking {
	    private int  acc_number;
		 double balance;
		 
	  
	public banking(int acc_number,double balance) {
		this.acc_number = acc_number;
		this.balance = balance;
	}
	
	double  getb() {
		return balance;
	}
	int getn() {
		return acc_number;
	}
	
	
	public void deposit(double amount) {
		System.out.println("the deposit was successful the amount deposited is "+amount+".the balance is "+balance);
	}
	public void interest(double interest_rate) {
		double interest = balance*interest_rate;
		System.out.println(interest+" is the interest");
	}
}
