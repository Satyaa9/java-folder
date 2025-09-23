import java.util.*;
class Substract{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n =sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array elements :");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Array after substraction:");
		for(int i=0;i<arr.length;i++){
			System.out.print(arr[i]-1+" ");
		}
	}
}
/*
OUTPUT:
Enter a array size :4
Enter array elements :1 2 3 4
Array after substraction:0 1 2 3

Test Cases:
Enter a array size :1
Enter array elements :10
Array after substraction:9
*/