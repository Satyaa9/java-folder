class Parent{
	String property="5 acre";

}
class Child extends Parent{
	String name="shubham";
	void display(){
		System.out.println("property:"+property);
		System.out.println(name);
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.display();
	}
}
/*
OUTPUT:
property:5 acre
shubham
*/
