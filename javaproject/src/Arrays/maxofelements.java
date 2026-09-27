package Arrays;

public class maxofelements {
	public static void main(String [] args) {
		int arr[] = {2,3,4,5,6};
		int new_max = 0;
		for (int i = 0; i<arr.length;i++) {
			for(int j = 1; j<arr.length;j++) {
			int b = arr[j] - arr[i];
			if(b>new_max) {
				new_max = b;
				}
			}
		}
	
	System.out.println(new_max);
	}
}
