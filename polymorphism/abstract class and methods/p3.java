abstract class parent{
	abstract void property();
}
class child extends parent{
	void property(){
		System.out.println("BCA....");
	}
}
class Demo{
	public static void main(String[]args){
		child c =new child();
		c.property();
	}
}
/*
OUTPUT:BCA....

*/