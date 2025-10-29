import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
	
		int n = sc.nextInt();
		int [] arr = new int [n];

		System.out.print("Enter array elements :");

		int odd_sum = 0;
		int even_sum = 0;

		for(int i =0 ; i < arr.length; i++){
			arr[i]=sc.nextInt();
		}

		for(int i = 0; i < arr.length ; i++){
			if(arr[i] % 2 == 0){
				even_sum += arr[i];
			}
			if(arr[i] % 2 != 0){
				odd_sum += arr[i];
			}
		}
	
		System.out.println("Sum Of Even Elements :"+even_sum);
		System.out.println("Sum Of Odd Elements :"+odd_sum);
	}
}

/*
OUTPUT:
Enter a array size :5
Enter array elements :1 2 3 4 5
Sum Of Even Elements :6
Sum Of Odd Elements :9
*/