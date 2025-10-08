import java.util.*;
class Demo{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n =sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array elements :");

		int count_even=0;
		int count_odd=0;



		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Elements in even index :");
		for(int i=0;i<arr.length;i++){
			if(i%2==0){
				System.out.print(arr[i]+" ");
			}
			
		}

		System.out.println();

		System.out.print("Elements in odd index :");
		for(int i=0;i<arr.length;i++){
			if(i%2!=0){
			System.out.print(arr[i]+" ");
			}
		}
		
	}
}



/*
OUTPUT:
Enter array size :5
Enter array elements :10 20 30 40 50
Elements in even index :10 30 50
Elements in odd index :20 40
*/