import java.util.Scanner;

class Demo{
	public static void main(String[]args){
		System.out.println("Hello World");

		try{
			System.out.println("in try");

			int arr[] = {10,20};
			Scanner sc = new Scanner(System.in);
			int index = sc.nextInt();
			System.out.println("Give the Number= "+arr[index]);
		}
		catch(Exception e){
			System.out.println("Array shika re nit");
		}

		System.out.println("After try catch exception");
	}
}

/*
OUTPUT:
Hello World
in try
0
Give the Number= 10
After try catch exception
*/