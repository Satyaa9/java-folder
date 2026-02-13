import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter first Number : ");
		int a = sc.nextInt();

		System.out.print("Enter second Number : ");
		int b = sc.nextInt();

		System.out.print("Enter third Number : ");
		int c = sc.nextInt();

		int max = a;

		if(b > max){
			max = b;
		}
		if(c > max){
			max = c;
		}

		System.out.print("Maximum : "+max);
	}
}

/*

OUTPUT :

Enter first Number : 10
Enter second Number : 20
Enter third Number : 40
Maximum : 40

*/