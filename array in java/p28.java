import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={-100,-496,-60,-23,-450,-500};

		int max=arr[0];

		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
			}
		}
		System.out.println("This is maximum element :"+max);
	}
}

/*
OUTPUT:
This is maximum element :-23

Nehami array madhala jr maximum number kadhayacha asel tr aaplyala array cha 0 index la max initialize karava lagto.
*/