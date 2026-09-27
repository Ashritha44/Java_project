package Arrays;

public class maxnumber {
	public static void main(String[] args) {
		int arr[] = {2,3,4,5,6};
		int max=arr[0];
		for (int i=1;i<arr.length;i++) {
			if (arr[i]>max[0]) {
				max[0]=arr[i];
			}
		}
		System.out.println(max);	
	}

}
