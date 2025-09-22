import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a size of array :");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.print("Enter the array elements :");

		int sum=0;

		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
			sum+=arr[i];
		}
		
		for(int i=0; i<1; i++){
			
			System.out.println("This is the sum if array :"+sum);
		}
	}
}

/*
OUTPUT:
Enter a size of array :4
Enter the array elements :10 20 30 40
This is the sum if array :100

calculate the sum of the elements in the given array.
*/