import java.util.*;
class Replace_First_Element_with_100{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n=sc.nextInt();

		int[] arr=new int[n];
		System.out.print("Enter elements of array:");

		int num=100;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Final array after modification:");
		for(int i=0;i<arr.length;i++){
			arr[0]=num;
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter a array size:4
Enter elements of array:1 2 3 4
Final array after modification:100 2 3 4

Test Case:
Enter a array size:1
Enter elements of array:7
Final array after modification:100
*/