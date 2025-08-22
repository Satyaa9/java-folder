class Parent{
	int a=10;

	void fun(){
		System.out.println("in parent :"+a);
	}
}
class Child{
	int a=10;

	void gun(){
		System.out.println("in child :"+a);
	}
}
class Demo{
	public static void main(String[]args){
		Child c =new Child();
		c.gun();
	}
}