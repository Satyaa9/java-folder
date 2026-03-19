import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = sc.nextInt();

	if(number >= 0 ){
		if(number == 0){
			System.out.print("Number is zero...");
			}
		else{
			System.out.print("Number is positive...");
			}
		}
	else{
			System.out.print("Number is Negative...");
		}
	}
}

/*

OUTPUT :

Enter a number : 15
Number is positive...

*/