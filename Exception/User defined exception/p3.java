class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Demo{
	public static void main(String[]args)
	
	throws MyException{
		throw new MyException("age is not valid");
	}
}

/*
OUTPUT:
Exception in thread "main" MyException: age is not valid
        at Demo.main(p3.java:10)
*/