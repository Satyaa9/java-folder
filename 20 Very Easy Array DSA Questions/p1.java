import java.util.*;
class Array{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.print("Enter array elements :");

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements in the array are :");
		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT:
Enter a array size :4
Enter array elements :1 2 3 4
Elements in the array are :
1 2 3 4
*/