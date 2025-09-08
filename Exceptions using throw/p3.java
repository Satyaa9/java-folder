class Demo{
	public static void main(String[]args){
		
		throw new ArithmeticException("/ by zero");
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ArithmeticException: / by zero
*/