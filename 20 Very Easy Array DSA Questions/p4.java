import java.util.*;
class Sum_First_last_Element{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size :");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter the array elements :");

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		

		int sum=0;

		if(arr.length>0){
			sum=arr[0]+arr[arr.length-1];
			System.out.println("This is the sum of first and last Element :"+sum);
		}
	}
}

/*
OUTPUT:
Enter the array size :4
Enter the array elements :2 4 6 8
This is the sum of first and last Element :10

Test Case:
Enter the array size :1
Enter the array elements :5
This is the sum of first and last Element :10
*/