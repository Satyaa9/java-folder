import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner (System.in);
		System.out.print("Enter a array size:");

		int n = sc.nextInt();
		int [] arr = new int[n];
		System.out.print("Enter a array elements :");

		for(int i = 0 ; i < arr.length ; i++){
			arr[i]=sc.nextInt();
		}

		System.out.print("Enter a number to be a sum:");
		int num = sc.nextInt();

		boolean found = false;

		System.out.println("--------------------------");
		for(int i = 0 ; i< arr.length ; i++){
			for(int j = i+1 ; j < arr.length ; j++){
				if(arr[i]+arr[j]==num){
					System.out.println("pairs of index : ("+ i +" "+ j + ")" );
					found = true;
				}
			}
		}
		
		if(!found){
			System.out.print("Numbers are not present for addtion :");
		}
	}
}

/*
OUTPUT:
Enter a array size:5
Enter a array elements :1 2 3 4 5
Enter a number to be a sum:5
--------------------------
pairs of index : (0 3)
pairs of index : (1 2)
*/