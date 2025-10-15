import java.util.*;
class Demo{

	public static void main(String[]args){

		int [] a = {1,2,3,4,5};

		System.out.print("Before rotation :");

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}

		System.out.println();

		System.out.print("After rotation :");

		rotate(a);

		for(int i = 0; i < a.length; i++){
			System.out.print(a[i]+" ");
		}
	}

	static void rotate(int [] a){
	int temp = a[0];

	for(int i = 1;i < a.length;i++){
			a[i-1] = a[i];
		}
		a[a.length-1] = temp;
	}
}

/*
OUTPUT:
Before rotation :1 2 3 4 5
After rotation :2 3 4 5 1
*/