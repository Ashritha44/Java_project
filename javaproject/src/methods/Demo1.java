package methods;

public class Demo1 {
	int bal=20000;
	void checkbalance() {
		System.out.println(bal);
	}
	void withdraw(int amt)
	bal=bal-amt;
	System.out.println("remaining: " + bal);
	
	public static void main(String[] args) {
		Demo1 s1 = new Demo1();
		s1.checkbalance();
		s1.withdraw(10000);
		Demo1 s2 = new Demo1();
		s2.checkbalance();
		s2.withdraw(5000);
			
		}
	}

}
