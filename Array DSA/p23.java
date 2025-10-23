import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.print("Enter array elements :");

		for(int i=0; i<arr.length; i++){
			arr[i]=sc.nextInt();
		}

		rotate(arr);

		System.out.print("Final array after rotation :");
		for(int i =0; i<arr.length; i++){
			System.out.print(arr[i] + " ");
		}

}

		static void rotate(int [] arr){
			int temp = arr[0];

			for(int i=1; i<arr.length; i++){
				arr[i-1]=arr[i];
			}

			arr[arr.length-1]=temp;
		}		
}

/*
OUTPUT:
Enter array size :5
Enter array elements :10 20 30 40 50
Final array after rotation :20 30 40 50 10
*/