import java.util.*;
class occurance{
	public static void main(String[]args){
		int [] arr={3,3,4,2,3,3,3};
		
		int n=arr.length;
		int count=0;

		for(int i = 0; i < n; i++){
			for(int j = 0; j < n; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
		if(count > n/2){
			System.out.println("Element occurance greater then array size :"+arr[i]);
			break;
			}
		}
		
	}
}

/*
OUTPUT:
Element occurance greater then array size :3
*/