package ArrayDsa;

public class Palindrome {
	public static void isPalindrome(String s) {
	int left=0;
	int right= s.length()-1;
	while(left<right) {
		if(s.charAt(left)!= s.charAt(right)){
			System.out.println("not a palindrome");
			return;
		}
		left++;
		right--;
	}
	System.out.println("is palindrome");
}
public static void main(String args[]) {
	String s = "level";
	String arr[]= {l,e,v,e,l};
}
}
