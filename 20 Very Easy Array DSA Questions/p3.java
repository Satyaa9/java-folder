import java.util.*;
class Last_Fisrt_Element{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the array size:");
		int n=sc.nextInt();
		System.out.println("-----------------------------------------");

		int [] arr=new int[n];
		System.out.print("Enter the array element :");

	
		for(int i=0;i<n;i++){
			arr[i]=sc.nextInt();
		
		}

		System.out.println("--------------------------------------------");
		
		if(arr.length>0){
			System.out.println("First element is :"+arr[0]);
			System.out.println("Last Element is :"+arr[arr.length-1]);
		}

		
	}
}

/*
OUTPUT:
Enter the array size:4
-----------------------------------------
Enter the array element :1 2 3 4
--------------------------------------------
First element is :1
Last Element is :4



Test Case:
Enter the array size:1
-----------------------------------------
Enter the array element :9
--------------------------------------------
First element is :9
Last Element is :9
*/