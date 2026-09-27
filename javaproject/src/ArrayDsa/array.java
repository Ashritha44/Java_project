package ArrayDsa;

public class array {
	public static void main(String [] args) {
		int arr[] = {12,14,16,19};
	int[] newarr= new int[arr.length+1];
	int p = 2;//p = position
	int value= 15;
	for(int i= 0;i<p;i++) {
		newarr[i]=arr[i];
	}
	newarr[p]=value;
	for(int i =p;i<arr.length;i++) {
		newarr[i+1]=arr[i];
	}
	for(int i =0; i<newarr.length; i++) {
		System.out.println(newarr[i]+" ");
		}
	}
}
