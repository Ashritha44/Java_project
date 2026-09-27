package Arrays;

public class printPrimeNumbersPosition {

	public static void main(String[] args) {
		int arr [] = {7,8,5,10,11};
		for(int i = 0;i<arr.length;i++) {
			int count = 0;
			for (int j = 0; j<=arr[i];j++) {
				if(arr[i]%j == 0) {
					count++;
					
				}
			}
			if(count==2) {
				System.out.println(i);
			}
		}

	}

}
