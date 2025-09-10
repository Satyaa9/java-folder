class Demo{
	public static void main(String[]args){

		try{
			//throw new ArithmeticException("/ by zero");
			System.out.println(10/0);		
		}catch(ArithmeticException e){
			System.out.println(e);
		}
	}
}

/*
OUTPUT:
java.lang.ArithmeticException: / by zero
*/