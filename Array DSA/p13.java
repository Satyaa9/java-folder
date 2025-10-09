import java.util.*;
class Demo{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		int min=Integer.MAX_VALUE;
		int smin=Integer.MAX_VALUE;


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

		for(int i=0;i<arr.length;i++){
			if(arr[i]<min){
				min=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]<smin && arr[i]!=min){
				smin=arr[i];
			}
		}
		System.out.println("------------------------------------");
		System.out.print("Second biggest number in array :"+smax+ " ");
		System.out.println();
		System.out.print("Second smalles number in array :"+smin+" ");
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :13 4 5 10 44
------------------------------------
Second biggest number in array :13
Second smalles number in array :5
*/