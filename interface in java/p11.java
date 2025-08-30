interface parent{
	void fun();

      	default void gun(){
		System.out.println("in parent fun");
	}
}
class child implements parent{
		public void fun(){
			System.out.println("in child fun");
	}
		
		void gun(){
			System.out.println("in child gun");
		}
}
class Demo{
	public static void main(String[]args){

	}
}

/*
BYTECODE:
interface parent {
  public abstract void fun();

  public default void gun();

OUTPUT:
error: gun() in child cannot implement gun() in parent
                void gun(){

Karan interface madhe pratyek method by default public aste tyamule tila khali call kartana tyacha pudhe public lihavach lagat.

*/