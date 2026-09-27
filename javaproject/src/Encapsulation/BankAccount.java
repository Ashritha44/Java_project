package Encapsulation;

public class BankAccount {
	private double balance;
	private double withdraw;
	private double deposit;
	public double getbalance() {
		return balance;
	}
	public double getwithdraw() {
		
		return withdraw;
		}
	public double getdeposit() {
		return deposit;
		}
	//setters
	public void setbalance(double balance) {
		if(balance>0) {
		this.balance=balance;
		}else {
			System.out.println("Invalid balance");
		}
	}
	public void setwithdraw(double withdraw) {
		if(balance>= withdraw) {
			withdraw = balance - withdraw;
			this.withdraw=withdraw;
		}
		else {
			System.out.println("insufficient balance");
		}
	}
	public void setdeposit(double deposit) {
		
		if(deposit>0) {
			deposit = withdraw+ deposit;
			this.deposit=deposit;
		}
		else {
			System.out.println(" amount entered is invalid");
		}
	}
	
}
