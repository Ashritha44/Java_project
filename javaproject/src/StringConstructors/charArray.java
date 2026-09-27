package StringConstructors;

public class charArray {
	public static void main(String[] args) {
		char ch[] = {'a','b','c','e'};
		String s = new String(ch,2,2);//(ch, 1, 2) o/p is bc; (ch [] value,, int offset, int count)
		System.out.println(s);
	}
}
