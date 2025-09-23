import java.util.*;
class Addition_Element{
	public static void main(String[]args){

		Scanner sc= new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements:");
		int sum=0;
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
			
		}
		for(int i=0;i<n;i++){
			sum+=arr[i];
		}
		System.out.println("Total sum of array elements:"+sum);
	}
}

/*
OUTPUT:
Enter a array size:4
Enter a array elements:10 20 30 40
Total sum of array elements:100

Test Case:
Enter a array size:2
Enter a array elements:10 20
Total sum of array elements:30
*/