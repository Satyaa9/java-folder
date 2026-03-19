import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = sc.nextInt();

	if(number > 0){
		System.out.print("Number is positive...");
		}
	else if(number < 0){
		System.out.print("Number is negative...");
		}
	else{
		System.out.print("Number is zero");
		}
	}
}

/*

OUTPUT :

Enter a number : -8
Number is negative...

*/