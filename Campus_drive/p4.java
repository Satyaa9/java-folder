import java.util.*;
class Demo{
	public static void main(String [] args){
	
	int [] arr = {4,3,6,2,1,1,8};

		int missing = 0 ;
		int dupli = 0;

		Arrays.sort(arr);

		System.out.print("Missing elements in the Array :");
		for(int i = 0 ; i < arr.length-1; i++){
			if(arr[i] == arr[i+1]){
				dupli = arr[i];
			}

			if(arr[i+1] - arr[i] > 1){
				for(int j = arr[i]+1 ; j < arr[i+1]; j++){
					System.out.print(j+" ");
				}
			}
		}
		System.out.println();
		System.out.println("Duplicate element in the aaray:"+dupli);
		
	}
}


/*
OUTPUT:
Missing elements in the Array :5 7
Duplicate element in the aaray:1
*/
