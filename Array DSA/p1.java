import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int [] arr= new int[n];
		System.out.print("Enter a array size :");

		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
			System.out.print("Reversed array :");
		for(int i=n-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter a array size :4
Enter a array size :1 2 3 4
Reversed array :4 3 2 1
*/