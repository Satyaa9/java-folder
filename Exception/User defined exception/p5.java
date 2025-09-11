class MyException extends Exception{
	MyException(String msg){
		super(msg);
	}
}
class Demo{
	public static void main(String[]args){

		int age = 18;
		try{
			if(age>=18){
				System.out.println("eligible for voting");
			}
			else{
				System.out.println("not eligible for voting");
			}
		}
		catch(Exception e){
				e.printStackTrace();
		}
	}
}

/*
OUTPUT:
eligible for voting

*/