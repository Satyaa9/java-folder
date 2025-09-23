import java.util.*;
class Smaller_than_ten{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements:");

		int count=0;
		int num=10;
		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]<10){
				count++;
			}
		}
		System.out.println("Element smaller than 10:"+count);
	}
}

/*
OUTPUT:
Enter a array size:4
Enter a array elements:1 55 13 2
Element smaller than 10:2

Test Case:
Enter a array size:2
Enter a array elements:20 30
Element smaller than 10:0
*/