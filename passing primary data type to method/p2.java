class A{
	int a=10;
}
class B{
	void fun(A obj){
		System.out.println(obj.a);
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
OUTPUT:10
*/