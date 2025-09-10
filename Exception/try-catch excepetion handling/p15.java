class Demo{
	public static void main(String[]args){
		try{
			System.out.println("in fun");
			System.out.println(10/0);
		}catch(ArithmeticException e){
			System.out.println("in arithmetic exception");
		}catch(Exception e){
			System.out.println("in exception");
		}
	}
}

/*
OUTPUT:
in fun
in arithmetic exception

In fun la kahihi exception nahiye te execute zal aani mg 2nd sop la exception hot tr te catch madhe execute zal aani exception chnaglya way ni handle kel.
*/