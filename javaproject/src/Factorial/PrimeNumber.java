package Factorial;

public class PrimeNumber {
	static boolean PrimeNumber(int n, int divn) {
		if(n==divn) {
			return true;
		}
		if(n%10 == divn) {
			return false;
		}
		return PrimeNumber(n,divn+1);
	}
	public static void main(String[] args) {
		boolean res = PrimeNumber(7,2);
	if(res) {
		System.out.println("it is a prime number");
	}
	else {
		System.out.println("it is not a prime number");
		}
	}
}
