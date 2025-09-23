import java.util.*;
class Check_if_Array_is_Empty{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size:");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array elements:");
		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		
		if(arr.length==0){
			System.out.print("true");
		}
		else{
			System.out.println("false");
		}
	}
}

/*
OUTPUT:
Enter array size:2
Enter array elements:2 3
false

Test Case:
Enter array size:0
Enter array elements:
true
*/