class Parent{
	void education(){
		System.out.println("Engineering");
	}
}
class Child extends Parent{
	void education(){
		System.out.println("chapari reel star .. KBP");
	}
}
class Demo{
	public static void main(String[]args){
		Child obj = new Child();
		obj.education();
	}
}
/*
OUTPUT:
chapari reel star .. KBP
*/