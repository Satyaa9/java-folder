import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr = {10,20,40,4,7,90};

		int x=40;

		for(int i=0; i<arr.length; i++){
			if(arr[i]==x){
				System.out.println("Element found at index:"+i);
			}
			
		}
	}
}

/*
OUTPUT:
Element found at index:2

Array madhe specific elements search karnya sathi.
*/