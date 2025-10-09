import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,4,5};

		int max=0;
		int second_max=0;
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]>second_max && second_max!=max){
				second_max=arr[i];
			}
		}
		System.out.print(max + " ");
		System.out.print(second_max+ " ");
	}
}