import java.util.*;
class Demo{
	public static void main(String[]args){
	Scanner sc = new Scanner(System.in);

	System.out.print("Enter a number : ");
	int number = sc.nextInt();

	int reverse = 0;

	while(number != 0){
		int digit = number % 10;
		reverse = reverse*10+digit;
		number = number /10;
		}

	System.out.print("Reversed number is : "+reverse);
	}
}

/*

OUTPUT :

Enter a number : 1234
Reversed number is : 4321

*/