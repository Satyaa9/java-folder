class MyException extends Exception{

}

class Demo{
	public static void main(String[]args)
		throws MyException{
			throw new MyException();
		}
	
}

/*
OUTPUT:
Exception in thread "main" MyException
        at Demo.main(p2.java:8)
*/