import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter size :");
		int n = sc.nextInt();

		int [] arr = new int[n];
		System.out.print("Enter the elements :");

		HashMap <Integer, Integer> hm = new HashMap();

		for(int i =0; i<arr.length;i++){
			arr[i]=sc.nextInt();
		}
		for(int num : arr){
			hm.put(num,hm.getOrDefault(num,0)+1);
		}
		for(Map.Entry<Integer,Integer> entry : hm.entrySet()){
			 System.out.println( entry.getKey() + ":Frequiency :" + entry.getValue());
		}
	}
}

/*
OUTPUT:
1:Frequiency :2
2:Frequiency :2
3:Frequiency :1
*/