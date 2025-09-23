import java.util.*;
class Replace_Last_Element_with_0{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n =sc.nextInt();

		int[] arr = new int[n];
		System.out.print("Enter array elements:");
			
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Final array after modification:");
		for(int i=0;i<arr.length;i++){
			arr[arr.length-1]=0;
			System.out.print(arr[i]+" ");
		}
		
	}
}

/*
OUTPUT:
Enter array size :4
Enter array elements:1 2 3 4
Final array after modification:1 2 3 0

Test Case:
Enter array size :1
Enter array elements:5
Final array after modification:0
*/