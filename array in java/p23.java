import java.util.*;
class Demo {
	public static void main(String[]args){
		int [] arr= {60,30,60,50,90};

		int sum=0;
		for(int i=0; i<arr.length; i++){
			sum+=arr[i];

		}
		System.out.println("This is the total sum :"+sum);
	}
}

/*
OUTPUT:
This is the total sum :290
*/