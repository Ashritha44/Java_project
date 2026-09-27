package Factorial;

public class ArmstrongNumber {
	static int ArmstrongNumber( int n) {
		if(n==0) {
			return 0;
		}
		
		return (n%10)*(n%10)*(n%10) + ArmstrongNumber(n/10);
	}
	public static void main(String [] args) {
		int res = ArmstrongNumber(153);
		System.out.println(res);
	if(res == 153) {
		System.out.println("its a Armstrong number");
	}
	else {
		System.out.println("its not a Armstrong Number");
		}
	}
}
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
				
	}
}
