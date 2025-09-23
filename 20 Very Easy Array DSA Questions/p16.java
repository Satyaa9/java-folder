import java.util.*;
class Odd_Numbers{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n = sc.nextInt();

		
		int [] arr=new int[n];
		System.out.print("Enter a array elements :");
		int count=0;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]%2!=0){
				count++;
			}
		}
		System.out.print("Total odd numbers :"+count);
		
	}
}

/*
OUTPUT:
Enter array size :4
Enter a array elements :1 2 3 4
Total odd numbers :2

Test Case:
Enter array size :2
Enter a array elements :2 4
Total odd numbers :0
*/