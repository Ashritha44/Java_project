package ArrayDsa;

public class DeletionArr {
	public static void main(String [] args) {
		int arr[] = {12,14,16,19,20};
	int[] newarr= new int[arr.length-1];
	int p = 3;//p = position
	for(int i= 0;i<p;i++) {
		newarr[i]=arr[i];
	}
	for(int i =p;i<arr.length;i++) {
		newarr[i+1]=arr[i+1];
	}
		System.out.println("after deleting specific p e;elements");
		for(int x:newarr.length;x++) {
			System.out.println(newarr[x]+" ");
		}
		}
	}
}
