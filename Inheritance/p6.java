class Parent{
	String property = "5 acre";

	void show(){
		System.out.println("parent property:"+property);
	}
}
class Child extends Parent{
	void flat(){
		System.out.println("child flat");
	}
}
class Demo{
	public static void main(String[]args){
		Child c =new Child();
		c.show();
		c.flat();

		Parent p =new Parent();
		p.show();
		p.flat();
		
	}
}
/*
OUTPUT:
 cannot find symbol
                p.flat();
*/