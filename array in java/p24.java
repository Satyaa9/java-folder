import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the size of array");
		int n = sc.nextInt();

		int [] arr= new int[n];
		System.out.println("Enter the array elements");

		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		int sum = 0;
		for(int i=0; i<n; i++){
			sum+=arr[i];
		}
		System.out.println("Final sum is :"+sum);
	}
}

/*
OUTPUT:
Enter the size of array
4
Enter the array elements
2
2
2
2
Final sum is :8

Input gheun array chi sum calculate karnya sathi.
*/