class Demo{
	public static void main(String[]args){
		
		int a = 10 ; 
		int b = 20 ;

		System.out.print("Before Swap :");
		System.out.print(a+" ");
		System.out.print(b+" ");

		System.out.println();		

		a = a + b ;
		b = a - b ;
		a = a - b ;
		
		
		System.out.print("After Swap :");
		System.out.print(a +" ");
		System.out.print(b +" ");
	}
}