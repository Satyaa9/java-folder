import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter Number :");
		int x = sc.nextInt();
		
		System.out.print("Enter name :");
		String n = sc.next();

		sc.nextLine();
		System.out.print("Enter full name :");
		String m = sc.nextLine();

		System.out.println("----------------------------------------------");

		System.out.print("This is the number entered by user :"+x);
		System.out.println();
		System.out.print("This is the name entered by user :"+n);
		System.out.println();
		System.out.print("This is the full name entered by user :"+m);

		
	}
}