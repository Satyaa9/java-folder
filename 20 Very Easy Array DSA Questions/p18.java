import java.util.*;
class Double{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size :");
		int n=sc.nextInt();

		int [] arr= new int[n];
		System.out.print("Enter array elements :");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Double value of given array:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]*2+" ");
		}
	}
}

/*
OUTPUT:
Enter the array size :4
Enter array elements :1 2 3 4
Double value of given array:2 4 6 8

Test Case:
Enter the array size :1
Enter array elements :5
Double value of given array:10


*/