import java.util.*;
class array_elements_to_another_array{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		int [] new_arr=new int[arr.length];

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			new_arr[i]=arr[i];	
		}
		
		System.out.print("New Array :");		

		for(int i=0;i<arr.length;i++){
			System.out.print(new_arr[i]+ " ");
		}
	}
}

/*
OUTPUT:
Enter a array size :4
Enter a array elements :10 20 30 40
New Array :10 20 30 40
*/