import java.util.*;
class Demo{
	static void rotateONE(int [] a){
		int temp=a[0];

		for(int i = 1; i < a.length; i++){
			a[i-1] = a[i];
		}
		a[a.length-1]=temp;
	}

	static void rotate(int [] a , int k){
		k = k%a.length;
		if(k < 0){
			k = k+a.length;
		}
		for(int i=1; i<=k ; i++){
			rotateONE(a);
		}	
	}



	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter aray size :");
		int n = sc.nextInt();

		int [] a = new int[n];
		System.out.print("Enter a array elements :");

		for(int i = 0; i < a.length; i++){
			a[i]=sc.nextInt();
		}

		rotate(a , 3);
		System.out.print("Rotated array :");
		for(int i = 0; i < a.length; i++){
			System.out.print(a[i] + " ");
		}	
	}
}

/*
OUTPUT:
Enter aray size :5
Enter a array elements :1 2 3 4 5
Rotated array :2 3 4 5 1
*/





