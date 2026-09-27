package conditionalStatements;
public class ATMmenusystem {
	public static void main(String[]args) {
		System.out.println("==== ATM MENU ====");
		System.out.println("Check Balance");
		System.out.println("Deposite Money");
		System.out.println("Withdraw Money");
		System.out.println("Mini Statement");
		System.out.println("Exit");
		int ATMmenusystem = 1;
		switch (ATMmenusystem) {
		case 1: System.out.println("Your balance is 25,000"); break;
		case 2: System.out.println("Enter amount to deposit"); break;
		case 3: System.out.println("Enter amount to withdraw"); break;
		case 4: System.out.println("Displaying mini statement...."); break;
		case 5: System.out.println("Thank you for using our ATM.");
		}
	}
	
}
