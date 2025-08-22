class A{
	void A(){
		System.out.println("in parent A");
	}
}
class B extends A{
	void B(){
		System.out.println("in parent B");
	}
}
class C extends B{
	void C(){
		System.out.println("in parent C");
	}
}
class D extends C{
	void D(){
		System.out.println("in parent D");
	}
}
class Demo{
	public static void main(String[]args){
		D j = new D();
		j.D();
		j.C();
		j.B();
		j.A();
		
		System.out.println(j);

		String s = j.toString();
		System.out.println(s);
		

	}
}
/*
OUTPUT:
in parent D
in parent C
in parent B
in parent A
D@1f32e575
D@1f32e575

Multilevel inheritance madhe aik parent class tyacha child banatat.
Mhanje :
       parent class A=>Child class B.
       Parent class B=>Child class C.
       Parent class C=>Child class D.
*/