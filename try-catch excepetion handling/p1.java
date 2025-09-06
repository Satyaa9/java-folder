class Demo{
	public static void main(String[]args){
		System.out.println("Hello World");

		try{
			System.out.println(10/0);
		}
		catch(Exception e){
			System.out.println("Ganish shik bhadya");
		}

		System.out.println("After try catch exception");
	}
}

/*
OUTPUT:
Hello World
Ganish shik bhadya
After try catch exception
*/