import java.util.*;
class Demo{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a array size :");

	int n = sc.nextInt();
	int [] arr = new int[n];
	System.out.print("Enter a array elements :");
	

		for(int i = 0 ; i < arr.length; i++){
			arr[i]=sc.nextInt();
		}

		for(int j = 0 ; j < arr.length ; j++){
			int count = 0 ;
			for(int k = 0 ; k < arr.length ; k++){
				if(arr[j]==arr[k]){
					count++;
				}
			}
			if(count == 1){
				System.out.print(arr[j]+" ");
			}
		}
	
	}
}