package Inheritance;

public class Child extends Father {
	int age;
	public Child(String name,int age) {
		super(name);
		this.age = age;
		System.out.println("it is a child constructor");
	}
	void doJob() {
		super.doJob();
		System.out.println("Child Age:" + age);
	}

}
