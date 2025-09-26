import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n= sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array Elements:");

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("This is reversed array :");
		for(int i=arr.length-1;i>=0;i--){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
Enter array size :4
Enter array Elements:1 2 3 4
This is reversed array :4 3 2 1
*/