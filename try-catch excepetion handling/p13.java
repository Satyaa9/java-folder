class Demo{
	public static void main(String[]args){
		try{
			throw new NullPointerException();
			
		}catch(ArithmeticException e){
			System.out.println("in arithmetic exception");
		}
		catch(Exception e){
			System.out.println("in null exception");
		}
	}
}
/*
OUTPUT:
in null exception

Aika try madhe multiple catch chaltat pn tyachi heiarachy correct asli pahijel.
*/