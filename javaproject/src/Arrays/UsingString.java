package Arrays;

import java.util.Scanner;

public class UsingString {
	public static void main (String[] args) {
		Scanner sc = new Scanner(System.in);
		String fruits[]= new String[5];
		for (int i = 0;i < fruits.length;i++) {
			System.out.println("enter "+i+" the fruit value:");
			fruits[i] = sc.nextLine();
		}
		for (int i = 0;i < fruits.length;i++) {
			System.out.println(fruits[i]);
		}
	}

}
