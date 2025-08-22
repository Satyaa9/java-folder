class Parent{
	int a=10;
	void gun(){
		System.out.println("in parent gun");
	}
}
class Child extends Parent{
	int a=20;
	void fun(){
		System.out.println("var is:"+super.a);
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.fun();
		c.gun();
	}
}