package Encapsulation;

public class mobileRechargeSystem {
	public static void main(String[] args) {
		Recharge b = new Recharge();
		b.setmobileNumber("9059054795");
		b.setoperatorName("Ashritha");
		b.setrechargeAmount(1000);
		System.out.println("mobileNumber is :"+b.getmobileNumber() );
		System.out.println("operatorName is :"+b.getoperatorName() );
		System.out.println("rechargeAmount is :"+b.getrechargeAmount() );
	}

}
