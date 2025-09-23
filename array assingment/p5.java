import java.util.*;
class Reverse_Array{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter Array elements:");
	
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}

		System.out.print("This is the reversed array :");

		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter the array size:4
Enter Array elements:1 2 3 4
This is the reversed array :4 3 2 1

Test Case:
Enter the array size:2
Enter Array elements:8 9
This is the reversed array :9 8

*/