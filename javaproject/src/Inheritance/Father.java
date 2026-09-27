package Inheritance;

public class Father {
	String name;
	public Father(String name) {
		this.name = name;
		System.out.println("it is father constructor");
	}
	void doJob() {
		System.out.println("Father name: "+ name);
		}
}
