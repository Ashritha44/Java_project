package StringConstructors;

public class StringMethods {
	public static void main(String [] args) {
		String s = "core java";
		String s1 = "Hello";
		String s2 = "World";
	    String s3 = "hello";
	    String s4 = "   Java Programming   ";
	    String s5 = "Java,Python,C++";
	    String s6 = new String("Java");
	    String s7 = "";
		System.out.println(s.length());//9
		System.out.println(s.charAt(3));//e
		System.out.println(s.substring(5,8));//(5,8) // java 
		System.out.println(s.toUpperCase());// CORE JAVA
		System.out.println(s.toLowerCase()); //core java
		System.out.println(s.contains("ash"));//false , if("java") then true
		System.out.println(s.startsWith("core"));//true
		System.out.println(s.endsWith("a"));//true
		System.out.println(s.replace("core", "advanced"));//advanced java
        System.out.println(s1.concat(" ").concat(s2));
        System.out.println(s1.equals(s2));//("hello")
        System.out.println(s1.equalsIgnoreCase(s3));//("Java")// TRUE
        System.out.println(s4.indexOf('a'));
        System.out.println(s4.lastIndexOf('a'));
        System.out.println(s4.trim());
        System.out.println(s7.isEmpty());
        System.out.println(s1.compareTo(s2));
        //tocharArray
        System.out.print("toCharArray(): ");
        char[] ch = s1.toCharArray();
        for (char c : ch) {
            System.out.print(c + " ");
        }
        System.out.println();

        // 8. split()
        System.out.println("split():");
        String[] arr = s5.split(",");
        for (String str : arr) {
            System.out.println(str);
        }
        //intern
        String poolString = s6.intern();
        System.out.println((poolString == "Java"));
	}

}
