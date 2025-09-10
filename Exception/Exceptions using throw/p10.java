class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException("/ by zero");
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
OUTPUT:
java.lang.ArithmeticException: / by zero
        at Demo.main(p10.java:4)
*/