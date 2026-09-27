package Arrays;

public class MergeArrays {
	public static void main(String[] arr) {
		int arr1[] = {1,2,3};
		int arr2[] = {1,2,3};
		int merge[] = new int[6];
		for(int i = 0;i<arr1.length;i++) {
			merge[i]=arr1[i];
		}
			for(int j = 0; j<arr2.length;j++) {
				merge[j+arr2.length] = arr2[j];
			}
			for(int k = 0;k<merge.length;k++) {
				System.out.print(merge[k]+" ");
			}
	}
}
