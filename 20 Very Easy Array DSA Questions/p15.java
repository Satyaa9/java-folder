import java.util.*;
class Even_Numbers{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array Elements :");
		int count =0;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]%2==0){
				count++;
			}
		}
		System.out.print("Total even numbers in array :"+count);
	}
}

/*
OUTPUT:
Enter a array size :4
Enter a array Elements :1 2 3 4
Total even numbers in array :2

Test Cases:
Enter a array size :2
Enter a array Elements :1 3
Total even numbers in array :0
*/