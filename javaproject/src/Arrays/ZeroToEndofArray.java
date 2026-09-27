package Arrays;

public class ZeroToEndofArray {
public static void main(String[] args) {
	int arr[] = {0,5,2,3,0,1};
	res=[];
	index= 0;
	for (int i = 0;i<arr.length;i++) {
		if(arr[i] != 0) {
			res[]=arr[i];
			index++;
		}
	}
	
}
}
