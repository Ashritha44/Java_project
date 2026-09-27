package Arrays;
public class SecondMin {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[6];
		for(int i=0;i<arr.length;i++) {
			
			arr[i]=sc.nextInt();
		}
		int min=arr[0];
		int secondmin=arr[1];
		for(int i=1;i<arr.length;i++) {
			if(arr[i]<min) {
				secondmin=min;
				min=arr[i];
			}
			else if(arr[i]<secondmin && min<arr[i]) {
				secondmin=arr[i];
			}
		}
		System.out.println(secondmin);
		sc.close();

	}
}

    
}

        