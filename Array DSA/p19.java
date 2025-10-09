import java.util.*;
class Remove_duplicates_from_sorted_array{
	public static void main(String[]args){

		Scanner sc = new Scanner(System.in);
		System.out.print("Enter a array size :");
		int n=sc.nextInt();

		int [] arr=new int[n];
		System.out.print("Enter a array elements :");

		HashMap<Integer, Integer> hm = new HashMap();

		for(int i=0;i<arr.length;i++){
			arr[i]=sc.nextInt();
		}

		for(int dupl : arr){
			hm.put(dupl,1);
		}
		System.out.println("---------------------------");
		System.out.print("Array after removing duplicates :");
		for(int key : hm.keySet()){
			System.out.print(key + " ");
			
		}
		System.out.println();
		System.out.print("Array size after removing duplicates :");
		System.out.print(hm.size());
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array elements :1 2 2 4 5
---------------------------
Array after removing duplicates :1 2 4 5
Array size after removing duplicates :4
*/