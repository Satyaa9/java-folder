class Parent{
	int a=10;
		void fun(){
		System.out.println("in parent fun");
	}

}
class Child{
	void display(){
		Sytem.out.println(a);
	}
}

class Demo{
	public static void main(String[]args){
		Child c = new Child();
		c.display();

		Parent p = new Parent();
		p.display();
	}
}
/*
OUTPUT:
 cannot find symbol
                Sytem.out.println(a);

BAP PORACH KAHIHI ACCESS KARU SHAKAT NAHI.
PORGA BAPACH SAGAL ACCESS KARU SHAKTO.

*/