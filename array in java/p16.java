import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter array size :");
		int n = sc.nextInt();

		int [] arr = new int[n];

		System.out.println("Enter array elements");

		for(int i=0;i<n; i++ ){
			arr[i]=sc.nextInt();
		}
		System.out.println("Elements of array are :");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}
/*
OUTPUT:
Enter array size :
4
Enter array elements
1
2
3
4
Elements of array are :
1 2 3 4
*/