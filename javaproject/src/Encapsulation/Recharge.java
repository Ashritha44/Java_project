package Encapsulation;

public class Recharge {
	private String mobileNumber;
	private String operatorName;
	private double rechargeAmount;
	public String getmobileNumber() {
		return mobileNumber;
	}
	public String getoperatorName() {
		return operatorName;
	}
	public double getrechargeAmount() {
		return rechargeAmount;
		}
	public void setmobileNumber( String mobileNumber) {
		if(mobileNumber.length() == 10) {
			this.mobileNumber = mobileNumber;
		} else {
			System.out.println("invalid mobileNumber");
		}
	}
	public void setoperatorName( String operatorName) {
		this.operatorName = operatorName;
	}
	public void setrechargeAmount(double rechargeAmount  ) {
		if(rechargeAmount >= 10) {
			this.rechargeAmount = rechargeAmount;
		} else {
			System.out.println("invalid rechargeAmount");
		}
	}
}

