import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n = sc.nextInt();


		int [] arr = new int[n];
		System.out.print("Enter a array elements :");

		

		for(int i = 0 ; i < n ; i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Unique values in the array :");

		for(int j = 0 ; j < n ; j++){
			int count = 0 ;

			for(int k = 0 ; k < n ; k++){
				if(arr[j]==arr[k]){
					count++;
				}
			}
			if(count ==1){
				System.out.print(arr[j]+" ");
			}
			
		}

	}
}

/*
OUTPUT:
Enter a array size :6
Enter a array elements :1 1 2 3 4 4
Unique values in the array :2 3 
*/