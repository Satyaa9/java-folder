import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={5,8,2,10,3};

		int max=arr[0];
		int min=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}

			if(arr[i]<min){
				min=arr[i];
			}
		}
		System.out.println("Maximun in array :"+max);
		System.out.println("Minimun in array :"+min);
	}
}

/*
OUTPUT:
Maximun in array :10
Minimun in array :2
*/