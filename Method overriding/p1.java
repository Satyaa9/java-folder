class Parent{
	void fun(){
		System.out.println("in parent fun:");
	}
}
class Child extends Parent{
	void fun(){
		System.out.println("in child fun");
	}
}
class Demo{
	public static void main(String[]args){
	Child obj = new Child();
	obj.fun();
		
	}
}
/*
OUTPUT:
	in child fun
*/