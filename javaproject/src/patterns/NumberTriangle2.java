package patterns;
import java.util.*;
public class NumberTriangle2{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int val=1;
		for(int i=1;i<=n;i++) {
			for(int j=1;j<=val;j++) {
				System.out.print(i);
			}
			System.out.println();
			val++;
		}
	}

}