class Demo{
	public static void main(String[]args){
		
	System.out.println("Hello World");

		try{
			System.out.println("in try");
		
			int arr[] = {10,20};
			System.out.println(arr[3]);
		}
		catch(Exception e){
			System.out.println("Array Shika");
		}

		System.out.println("After try catch exception");
	}
}

/*
OUTPUT:
Hello World
in try
Array Shika
After try catch exception

Karan aapan array madhe fkt 0 and 1 index la value dili aahe aani access karayala baghatoy 3 no. chya index chi tyamule te catch madhe jat aani je expection aalay te changlya way ni handle karto.
*/