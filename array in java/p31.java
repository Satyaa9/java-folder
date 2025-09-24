import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();

		int[]arr=new int[n];
		System.out.print("Enter the array elements:");
			

		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
	
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>smax && arr[i]!=max){
				smax=arr[i];
			}
		}
		System.out.println("------------------------------------");
		System.out.println("This is the maximum number:"+max);
		System.out.println("This is the second maximum number:"+smax);
	}
}

/*
OUTPUT:
Enter the array size:4
Enter the array elements:23 65 89 10
------------------------------------
This is the maximum number:89
This is the second maximum number:65
*/