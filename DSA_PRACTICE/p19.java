import java.util.*;
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);
	
		System.out.print("Enter first Number : ");
		int a = sc.nextInt();

		System.out.print("Enter second Number : ");
		int b = sc.nextInt();

		System.out.print("Enter third Number : ");
		int c = sc.nextInt();

		int min = a ;

		if(b < min){
			min = b;
		}
		if(c < min){
			min = c ;
		}

		System.out.print("Minimum : "+min);
	}
}

/*

OUTPUT :

Enter first Number : 40
Enter second Number : 45
Enter third Number : 50
Minimum : 40

*/