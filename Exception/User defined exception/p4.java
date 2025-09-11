class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Demo{
	public static void main(String[]args){
		try{
			throw new MyException("age is not valid");
		}
		catch(Exception e){
			e.printStackTrace();
		}
	}
}

/*
OUTPUT:
MyException: age is not valid
        at Demo.main(p4.java:9)
*/