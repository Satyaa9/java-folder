import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter min Number :");
		int min = sc.nextInt();

		System.out.print("Enter max Number :");
		int max = sc.nextInt();

		System.out.print("Output :");
		for(int i = min ; i <= max ; i++){
			if(i % 2 != 0){
				System.out.print(i +" ");
			}
		}
	}
}

/*

OUTPUT :

Enter min Number :4
Enter max Number :60
Output :5 7 9 11 13 15 17 19 21 23 25 27 29 31 33 35 37 39 41 43 45 47 49 51 53 55 57 59

*/