import java.util.*;
class greater_Than_Five{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n=sc.nextInt();

		int [] arr= new int[n];
		System.out.print("Enter the array elements:");
		
	
		int count=0;
		int num=5;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>num){
				count++;
			}
		}
		System.out.println("Count of element grater than 5 :"+count);
	}
}

/*
OUTPUT:
Enter a array size:4
Enter the array elements:6 10 3 2
Count of element grater than 5 :2

Test Case:
Enter a array size:2
Enter the array elements:10 2
Count of element grater than 5 :1
*/