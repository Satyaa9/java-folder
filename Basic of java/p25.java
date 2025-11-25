import java.util.*;
class Demo{
	public static void main(String[]args){
	
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter a array size :");
	int n = sc.nextInt();

	int [] arr = new int[n];
	System.out.print("Enter a array Elements :");

	int pos_num = 0;
	int neg_num = 0;
	int zero_num = 0;

	for(int i = 0 ; i < n ; i++){
		arr[i]=sc.nextInt();
		}

		for(int j = 0 ; j < n ; j++){
			if(arr[j] < 0){
				neg_num++;
			}
			if(arr[j] > 0){
				pos_num++;
			}
			if(arr[j]==0){
				zero_num++;
			}
		}

		System.out.println("postive numbers in the array :"+ pos_num);
		System.out.println("postive numbers in the array :"+ neg_num);
		System.out.println("postive numbers in the array :"+ zero_num);
	
	}
}

/*
OUTPUT:
Enter a array size :5
Enter a array Elements :1 2 0 -3 7
postive numbers in the array :3
postive numbers in the array :1
postive numbers in the array :1
*/