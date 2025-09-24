import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,4,5};
		arr[7]=10;

		for(int i=0;i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 7 out of bounds for length 5
Karan aapan array chi length 5 ghetali aahe aani array cha 7 index la element add karayala baghat aahe tyamule te exception fekat aahe.
*/