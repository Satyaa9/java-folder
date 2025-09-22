import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr= {3,4,7,9,6,10};

		int even=0;
		int odd=0;

		for(int i =0; i<arr.length; i++){
			if(arr[i]%2==0){	
				even++;
			}
			else{
				odd++;
			}
		}
		System.out.println("Even numbers :"+even);
		System.out.println("Odd numbers :"+odd);
	}
}

/*
OUTPUT:
Even numbers :3
Odd numbers :3
*/