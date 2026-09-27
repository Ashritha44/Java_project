package Encapsulation;

public class BankDetails {
	public static void main(String[] args) {
		BankAccount b = new BankAccount();
		b.setbalance(20000);
		b.setwithdraw(5000);
		b.setdeposit(2000);
		System.out.println("Available balance"+b.getbalance() );
		System.out.println("After withdraw balance"+b.getwithdraw() );
		System.out.println("After deposit balance"+b.getdeposit() );
	}

}
