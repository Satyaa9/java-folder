import java.util.*;
class Demo{
	public static void main(String[]args){
		int[]arr={10,2,3,56,7};
		
		int count=0;
		int num=5;

		for(int i=0;i<arr.length;i++){
			if(arr[i]>num){
				count++;
			}
		}
		System.out.print("Total numbers greater than 5:"+count);
	}
}

/*
OUTPUT:
Total numbers greater than 5:3
*/