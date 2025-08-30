interface parent{
	void fun();
}
class child implements parent{
	 void fun(){
		System.out.println("in child fun");
	}
}
class Demo{
	public static void main(String[]args){
	child c = new child();
	c.fun();
	}
}

/*
OUTPUT:
interface parent {
  public abstract void fun();
}

He jr aapan varati dilya pramane child madhe access karayala baghitl tr te error denar ki
error: fun() in child cannot implement fun() in parent
         void fun(){

karan parent madhe ji fun navachi method aahe ticha pudhe by default public abstract ast aani aapan jr te public khali lihil nahi tr tyacha meaning as hot ki aapan tya method la barik karayach  try krt aahot aani he aapan karu shakat nahi tyamule compiler error deto.
*/