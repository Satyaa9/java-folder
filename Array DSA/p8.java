import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter the array size :");
	int n=sc.nextInt();

	int [] arr=new int[n];
	System.out.print("Enter a array elements :");

	int x=30;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			if(arr[i]==x){
				System.out.println("Element on the index :"+i);
			}
		}
	}
}

/*
OUTPUT:
Enter the array size :4
Enter a array elements :10 20 30 40
Element on the index :2
*/