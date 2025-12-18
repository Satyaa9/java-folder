import java.util.*;
class Demo{
	public static void main(String [] args){
	
	int [] arr = {10,20,5,7};
	int min = Integer.MAX_VALUE;

	
		for(int i = 0 ; i < arr.length; i++){
			if (arr[i] < min){
				min = arr[i];
			}
		}
		System.out.print("Minimun Number in array :"+min);
	}
}

/*
OUTPUT:

Minimun Number in array :5
*/