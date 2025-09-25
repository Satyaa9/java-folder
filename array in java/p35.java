import java.util.*;
class Demo{

	static void change(int[]arr){
	arr[1]=50;
		}

	public static void main(String[]args){
		int [] arr={10,20,30};
		System.out.println("Before change:"+arr[1]);
		change(arr);
		System.out.println("After change:"+arr[1]);
	}
}

/*
OUTPUT:
Before change:20
After change:50

Passing array to the methods
*/