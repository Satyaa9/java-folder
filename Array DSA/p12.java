import java.util.*;
class Demo{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		boolean a=true;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length-1;i++){
			if(arr[i]>arr[i+1]){
				a = false;
				break;
			}
			
		}
		System.out.print("Array is sorted or not :"+a);
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :1 2 4 1 3
Array is sorted or not :false
*/