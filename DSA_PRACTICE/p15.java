import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number : ");
		int a = sc.nextInt() ;
		int sum = 0 ;

		for(int i = 1 ; i <= a/2 ; i++){
			if(a % i == 0){
				sum += i ;
			}
		}
		if(sum == a){
			System.out.print("Perfect Number : "+a);
		}else{
			System.out.print("Not Perfect Number : "+a);
		}
	}
}

/*

OUTPUT :

Enter Number : 6
Perfect Number : 6

*/