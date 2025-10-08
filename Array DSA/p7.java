import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter array size :");
		int n = sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter array elements :");
		
		int sum=0;

		for(int i=0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int i=0;i<arr.length;i++){
			sum+=arr[i];
		}

		double avg = sum/arr.length;

		System.out.println(avg);
	}
}

/*
OUTPUT:
Enter array size :5
Enter array elements :30 50 60 10 40
38.0
*/