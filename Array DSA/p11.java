import java.util.*;
class largest_element_in_the_array{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		
		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		int max=0;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.print("Maximum element in the array is :"+max);
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :10 55 100 52 60
Maximum element in the array is :100
*/