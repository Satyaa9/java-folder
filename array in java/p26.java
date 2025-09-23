import java.util.*;
class Demo{
	public static void main(String[]args){
		int [] arr={10,2,30,50,16,76};
	
		int x=50;
		boolean flag=true;

		for(int i=0; i<arr.length;i++){
			if(arr[i]==x){
				flag=true;
				break;
			}
		}
		
		if(flag==true){
			System.out.println("Element found !");
		}
		else{
			System.out.println("Element not found!");
		}
	}
}

/*
OUTPUT:
Element found !


In Java, a flag is not a special keyword or reserved word—it’s just a common programming term.

A flag usually means a boolean variable (or sometimes an integer/char) that acts as a signal to indicate whether a particular condition is true or false, or whether a certain state has been reached.


*/