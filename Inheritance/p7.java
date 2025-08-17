class Parent{
	int a=10;
	void fun(){
		System.out.println("in parent fun");
	}
}

class Child extends Parent{
	void display(){
		System.out.println(a);
	}
}




class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.display();
		System.out.println(c.a);

	}
}
/*
OUTPUT:
10
10

*/