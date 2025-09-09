class Demo{
	public static void main(String[]args){
		try{
			throw new NullPointerException();
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("in arithmetic exception");
		}
		catch(Exception e){
			System.out.println("in exception that given");
		}
	}
}

/*
OUTPUT:
 error: unreachable statement
                        System.out.println(10/0);

Karan jevha jvm exception check krt ast tyala tr 1st exception sapdla ki tithun khalacha code currupt hoto.
*/