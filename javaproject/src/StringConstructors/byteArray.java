package StringConstructors;

public class byteArray {
	public static void main(String[] args) {
		byte b[] = {65, 66, 67, 68, 69, 70};
		String s = new String(b,0,3);//(b, 1, 3) ====o/p is BCD /(byte [] value, offset, length)
		System.out.println(s);
	}
}
