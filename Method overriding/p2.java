class Parent{
	void fun(){
		System.out.println("in parent fun");
	}
}
class Child extends Parent{
	int fun(){
		System.out.println("in child fun");
		return 0;
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.fun();
	}
}
/*
OUTPUT:ERROR
fun() in Child cannot override fun() in Parent
        int fun(){
            ^
  return type int is not compatible with void

Karan method overriding mhanje jr parent child chya method shi satisfy nasel tr to to
method aahe ashi khali gheun tyat change karu shakto .
Pn to fkt tyacha aatlya content madhe chane karu shakto method ch name, behavoir madhe
to kahihi change karu shakat nahi.
*/