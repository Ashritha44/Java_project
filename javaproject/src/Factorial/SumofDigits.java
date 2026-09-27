package Factorial;

public class SumofDigits {
	static int SumofDigits(int n) {
		if(n==0) {
			return 0;
		}
		return n%10+SumofDigits(n/10);
	}
	public static void main(String [] args) {
		int res = SumofDigits(246);
		System.out.println(res);
	}

}
