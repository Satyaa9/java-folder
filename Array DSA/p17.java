import java.util.*;
class Reverse_an_array_in_place{
	public static void main(String[]args){
		
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n= sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Reversed array is :");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :1 2 3 4 5
Reversed array is :5 4 3 2 1
*/