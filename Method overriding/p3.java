class Parent{
	void flat(){
		System.out.println("Satara");
	}
}
class Child extends Parent{
	void flat(){
		System.out.println("pune");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();

		obj.flat();
	}	
}
/*
OUTPUT:pune
Method aahe ashi thevli fkt aatala content change zala.
*/