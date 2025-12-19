import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	
	System.out.print("Enter a array size:");

	int n = sc.nextInt();

	int [] arr = new int[n];
	System.out.print("Enter the array elements:");

		for(int i = 0 ; i<arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i< arr.length ; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:

Enter a array size:5
Enter the array elements:1 2 3 4 5
1 2 3 4 5

*/