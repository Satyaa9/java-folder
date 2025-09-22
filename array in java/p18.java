import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.print("Enter a array elements :");

		for(int i=0; i<n; i++){
			arr[i]=sc.nextInt();
		}
		System.out.print("Final output is :");

		for(int i=0; i<n; i++){
			System.out.print(arr[i]*2+" ");
		}
	}
}

/*
OUTPUT:
Enter a array size :4
Enter a array elements :1 2 3 4
Final output is :2 4 6 8

Jr aaplyala array chi size double ne increase karayachi asel tr aapan ti ashi mhanje arr[i]*2 as lihun vadhau shakto.
*/