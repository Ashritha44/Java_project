package StringBuffers;

public class reverseString {
 public void reverseS(String s) {
	 String rev = "";
	 for(int i =s.length()-1; i>=0;i--) {
		 char ch = s.charAt(i);
		 rev+=ch;
	 }
	 System.out.println(rev);
 }

public static void main(String[] args) {
	reverseString r =  new reverseString();
	r.reverseS("Ashritha");;
}
}