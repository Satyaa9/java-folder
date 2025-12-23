import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the size of array :");
	int n = sc.nextInt();

	int [] arr = new int[n];
	System.out.print("Enter the elements of array :");
		

		for(int i = 0 ; i < arr.length; i++){
			arr[i] = sc.nextInt();
		}
		System.out.print("Final sorted array :");

		for(int i = 0 ; i < arr.length; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:

Enter the size of array :4
Enter the elements of array :4 3 2 1
Final sorted array :1 2 3 4

*/