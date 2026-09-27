package StringBuffers;

public class count {
	public void countJ(String s) {
		s.toUpperCase();
		int count = 0;
		for (int i = 0; i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch=='J') {
			count++;
		}
		}
		System.out.println(count);
	}
public static void main(String[] args) {
	count c = new count();
	c.countJ("Javajava");
}
}