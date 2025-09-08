class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException("/ by zero");
		}catch(ArithmeticException e){
			e.printStackTrace();
		}
	}
}

/*
OUTPUT:
java.lang.ArithmeticException: / by zero
        at Demo.main(p8.java:4)

e.printStackTrace- Exception kothe kothe aalay te trace kart line by line.

*/