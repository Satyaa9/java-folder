import java.util.*;
class occurance {
	public static void main(String[]args){
		Scanner sc=new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements:");

		int count=0;

		for(int i = 0; i<n;i++){
			arr[i]=sc.nextInt();
		}

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}

			if(count > n/2){
				System.out.println(arr[i]);
				break;
			}
		}
	}
}

/*
OUTPUT:
Enter a array size : 5
Enter a array elements:2 5 6 6 7
6
*/