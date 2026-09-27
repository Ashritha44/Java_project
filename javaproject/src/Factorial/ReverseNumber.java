package Factorial;

public class ReverseNumber {
	static int ReverseNumber(int n, int rev) {
		if(n==0) {
			return rev;
		}
		return ReverseNumber (n/10,rev*10+n%10);
	}
	public static void main(String [] args) {
		int res = ReverseNumber(123,0);
		System.out.println(res);
	}

}
