import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size:");
		int n=sc.nextInt();

		int[]arr=new int[n];
		System.out.print("Enter a array elements:");

		int count=0;
		int num=5;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>num){
				count++;
			}
		}
		System.out.print("Total numbers grater than 5:"+count);
	}
}

/*
OUTPUT:
Enter a array size:4
Enter a array elements:1 50 2 40
Total numbers grater than 5:2
*/