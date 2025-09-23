import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a sixe of array:");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements:");

		int max=arr[0];
		int maxIndex=0;

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int i=0;i<arr.length;i++){
			if(arr[i]>max){
				max=arr[i];
				maxIndex=i;
			}
		}
		System.out.println("----------------------------------");
		System.out.println("This is maximum element :"+max);
		System.out.println("This is index of max element:"+maxIndex);
	}
}

/*
OUTPUT:
Enter a sixe of array:4
Enter a array elements:1 2 3 4
----------------------------------
This is maximum element :4
This is index of max element:3SS
*/