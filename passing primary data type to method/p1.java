class A{
	int a=10;
}
class B{
	void fun(int a){
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
		
	A obj = new A();
	B obj1 = new B();

	obj1.fun(obj);
	}
}
/*
OUTPUT:
error: incompatible types: A cannot be converted to int
        obj1.fun(obj);

*/