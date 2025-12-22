import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size :");
	int n = sc.nextInt();
	

	int [] arr = new int[n];
	System.out.print("Enter array Element :");

		int sum = 0;

		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}


		for(int i = 0 ; i < arr.length ; i++){
			sum+=arr[i];
		}
		System.out.print("Sum of array element:"+sum);
	}
}

/*
OUTPUT:

Enter array size :2
Enter array Element :10 10
Sum of array element:20

*/