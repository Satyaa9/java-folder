import java.util.*;
class Demo{
	public static void main(String [] args){

		int distance = 100;
		int time = 20;

		int velocity = distance / time ;

		System.out.print("Velocity = "+velocity+" m/s");
	}
}

/*

OUTPUT :
Velocity = 5 m/s

*/

class Solution {
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the Distance : ");
		int d = sc.nextInt();

		System.out.print("Enter the time : ");
		int t = sc.nextInt();

		int v = d / t;

		System.out.print("Velocity = "+v+" m/s");
	}
}

/*

OUTPUT :

Enter the Distance : 60
Enter the time : 12
Velocity = 5 m/s

*/


















