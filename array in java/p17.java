import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a array size :");
		int n =sc.nextInt();

		int [] arr= new int[n];
		System.out.println("Enter a array elements :");

		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}

		System.out.println("This is the Array elements :");
		for(int i=0; i<n; i++){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter a array size :
4
Enter a array elements :
10
20
30
40
This is the Array elements :
10 20 30 40
*/