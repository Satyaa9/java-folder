class Parent{
	Parent(){
		System.out.println("parent constr");
	}
}
class Child extends Parent{
	Child(){
		System.out.println("child constr");
	}
}
class Demo{
	public static void main(String[]args){
		Child c = new Child();

		Parent p = new Parent();
		
	}
}
/*
OUTPUT:
parent constr
child constr
parent constr
*/