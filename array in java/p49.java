import java.util.*;
class Demo{
	public static void main(String [] args){
	
	int [] arr = {10,20,30,5};

	int max = Integer.MIN_VALUE;
	int smax = -2147483648;

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max){
				max = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > smax && arr[i] != max){
				smax=arr[i];
			}
		}
		System.out.println("First max in the array :"+max);
		System.out.println("Second max in the array :"+smax);
	}
}


/*
OUTPUT:
First max in the array :30
Second max in the array :20
*/