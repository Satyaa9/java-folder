import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n = sc.nextInt();

		int [] arr = new int [n];
		System.out.print("Enter array elements :");

		int pos_count = 0;
		int neg_count = 0;
		int zero_count = 0;

		for(int i = 0 ; i<arr.length; i++){
			arr[i] = sc.nextInt();
		}
	
		for(int i = 0; i < arr.length ; i++){
			if(arr[i] < 0){
				neg_count++;
			}
			if(arr[i] > 0){
				pos_count++;
			}
			if(arr[i] == 0){
				zero_count++;
			}
		}
		System.out.println("----------------------------------");

		System.out.println("Postive elements count :"+ pos_count);
		System.out.println("Negative elements count :"+ neg_count);
		System.out.println("Zero elements  count :"+ zero_count);
	}
}

/*
OUTPUT:
Enter a array size :5
Enter array elements :1 -2 0 -3 4
----------------------------------
Postive elements count :2
Negative elements count :2
Zero elements  count :1
*/