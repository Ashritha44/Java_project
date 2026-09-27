package Polymorphism;

public class MovieTicket {
	int price;
	public void bookTicket(int tickets) {
		int total_amount = tickets * 200;
		System.out.println(total_amount);
	}
	public void bookTicket(int tickets, boolean isPremium) {
		if(isPremium) {
			int price = 350;
		}
		else{
			int price = 200;
		}
		int total_amount = tickets * price;
		System.out.println("total amount is :" + total_amount);
		
	}
	public void bookTicket(int tickets, boolean isPremium, double discount) {
		if(isPremium) {
			int price = 350;
		}
		else{
			int price = 200;
		}
		double total_amount = tickets * price;
		double finalAmount = total_amount - (total_amount* discount/100);
		System.out.println();
		
		
		
		
	}
	

}
