package ArrayDsa;

public class FirtsEven {
public static void main(String args[]) {
	int arr[]= {13,5,33,90,23};
	for(int num:arr) {
		if(num%2==0) {
			System.out.println("found even num:"+num);
			return;
		}
	}
	System.out.println("nou found element");
}
}
