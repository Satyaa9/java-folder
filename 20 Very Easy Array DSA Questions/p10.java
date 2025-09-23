import java.util.*;
class Check_if_Array_Contains_5{
	public static void main(String[]args){
		Scanner sc =new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter the elements of array:");

		boolean x=false;
	
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]==5){
				x=true;
				break;
				
			}
		}
		
		if(x){
			System.out.print("Yes element 5 found");
		}
		else{
			System.out.print("No element 5 not found");
		}
	}
}

/*
OUTPUT:
Enter a array size:5
Enter the elements of array:1 2 3 4 5
Yes element 5 found

Test case:
Enter a array size:4
Enter the elements of array:1 2 3 4
No element 5 not found
*/