import java.util.*;
class Demo{
	public static void main(String [] args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a array size :");
	int n = sc.nextInt();

	int [] arr = new int[n];

	System.out.print("Enter a array elements :");

	for(int i = 0 ; i<arr.length; i++){
		arr[i] = sc.nextInt();
		}
		
	System.out.print("Enter a number to be sum :");
	int num = sc.nextInt();
	

		System.out.println("-----------------------");

		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i] + arr[j] == num){
					
					System.out.println("pair of that index ("+i+ " "+ j+")");
					
				}
			}
		}

	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :10 50 100 60 70
Enter a number to be sum :150
-----------------------
index of numbers that added:1 2
Numbers of that index :50 100
*/