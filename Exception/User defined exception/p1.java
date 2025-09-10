class MyException extends Exception{

}
class Demo{
	public static void main(String[]args){
		throw new MyException();
	}
}

/*
OUTPUT:
 error: unreported exception MyException; must be caught or declared to be thrown
                throw new MyException();
*/