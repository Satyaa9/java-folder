class Parent{
	String property = "5 acre";
	void show(){
		System.out.println("parent property:"+property);
	}
}
class Child extends Parent{
	void display(){
		System.out.println("child property:"+property);
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.display();
		obj.show();
	}
}
/*
OUTPUT:
child property:5 acre
parent property:5 acre
*/