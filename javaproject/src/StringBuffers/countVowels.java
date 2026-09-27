package StringBuffers;

public class countVowels {
	public void countVowel(String s) {
		s =s.toLowerCase();
		int count = 0;
		for (int i = 0; i<s.length();i++) {
		char ch = s.charAt(i);
		if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
			count++;
		}
		}
		System.out.println("count vowels :" + count );
	}
public static void main(String[] args) {
	countVowels c = new countVowels();
	c.countVowel("Javajava");
}
}
