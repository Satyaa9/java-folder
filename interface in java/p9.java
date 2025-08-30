interface parent{
	void fun();

	default void gun(){
		System.out.println("in parent gun");
	}
}
class child implements parent{
	
}
class Demo{
	public static void main(String[]args){

	}
}
/*
OUTPUT:
error: child is not abstract and does not override abstract method fun() in parent
class child implements parent{

Mhanje jr aapan implement use karun parent chya method access kartoy jr parent ne jya incomplete method aahet tyanna body dyavi lagte.
*/