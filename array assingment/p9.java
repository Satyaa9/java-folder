import java.util.*;
class Multiply_All_Elements{
	public static void main(String[]args){
		Scanner sc= new Scanner(System.in);
		System.out.print("Enter the Array size:");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array elements:");
		
		
		int mul=1;

		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<n;i++){
			mul*=arr[i];
		}
		System.out.println("Multiplication of the array elements is:"+mul);
	}
}

/*
OUTPUT:
Enter the Array size:3
Enter array elements:2 3 4
Multiplication of the array elements is:24
*/