class Demo{
	public static void main(String[]args){
		try{
			throw new ArithmeticException();
		}catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
OUTPUT:
java.lang.ArithmeticException
        at Demo.main(p12.java:4)
*/