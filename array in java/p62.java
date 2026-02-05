// Finding Smallest And Second Smallest Number In The Array 

import java.util.*;
class Demo{
	public static void main(String [] args){
		int [] arr = {2,3,6,9,1,9,0};

		int smallest = Integer.MAX_VALUE;
		int s_smallest = Integer.MAX_VALUE;

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < smallest){
				smallest = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < s_smallest && arr[i] != smallest){
				s_smallest = arr[i];
			}
		}		

		System.out.print("First Smallest Number :"+smallest);
		System.out.println();
		System.out.print("Second Smallest Number :"+s_smallest);
	}
}

// biggest number of integer is => 2147483647

// OUTPUT => First Smallest Number :0
//	  => Second Smallest Number :1