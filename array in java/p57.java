import java.util.*;
class Demo{
	public static void main(String [] args){
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter array size :");
	int n = sc.nextInt();

	int [] arr = new int[n];
	System.out.print("Enter array Elements :");
		
	int count_even = 0;
	int count_odd = 0;
	
		for(int i = 0 ; i < arr.length ; i++){
			arr[i] = sc.nextInt();
		}

		for(int i = 0 ; i < arr.length; i++){
			if(i % 2 == 0){
				count_even++;
			}else{
				count_odd++;
			}
		}

	System.out.println("Even count in array :"+count_even);
	System.out.println("Odd count in array :"+count_odd);
	
	}
}

/*
OUTPUT:

Enter array size :4
Enter array Elements :1 2 3 4
Even count in array :2
Odd count in array :2

*/