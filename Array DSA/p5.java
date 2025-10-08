import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={1,2,3,4,5,6};

		int count_even=0;
		int count_odd=0;

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count_even++;
			}
			if(arr[i]%2!=0){
				count_odd++;
			}
		}
		System.out.println("Even count :"+count_even);
		System.out.println("Odd count :"+count_odd);
	}
}

/*
OUTPUT:
Even count :3
Odd count :3
*/