import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={2,3,4,5};

		int max=Integer.MIN_VALUE;
		int smax=Integer.MIN_VALUE;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				 
				max=arr[i];
			}
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>smax && arr[i]!=max){
				smax=arr[i];
			}
		}
			System.out.println("Fisrt larget number:"+max);
			System.out.println("Second largest number:"+smax);
	}
}

/*
OUTPUT:
Fisrt larget number:5
Second largest number:4

To find the second largest number in the array.
*/