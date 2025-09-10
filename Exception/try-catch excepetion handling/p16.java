class Demo{
	public static void main(String[]args){
		try{
			int a=10;
			Demo d = null;
			System.out.println(d.a);
		}catch(ArithmeticException e){
			System.out.println("in arithmetic exception");
		}catch(Exception e){
			System.out.println("in all exception");
		}
	}
}