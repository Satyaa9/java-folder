class Demo{
	public static void main(String[]args){
		int a=5;
		int b=4;
		System.out.println("Before Swapping the value :"+a);
		System.out.println("Before Swapping the value :"+b);

		System.out.println("-----------------------------------------");

		a=a-b;
		b=b+a;
		a=b-a;

		System.out.println("After Swapping the value :"+a);
		System.out.println("After Swapping the value :"+b);
	}
}
/*
OUTPUT:
Before Swapping the value :5
Before Swapping the value :4
-----------------------------------------
After Swapping the value :4
After Swapping the value :5
*/
