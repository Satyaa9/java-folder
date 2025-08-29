abstract class parent{
	abstract void education();

	void marry(){
		System.out.println("katrina.....");
	}

	void property(){
		System.out.println("50 acre");
	}
}
class child extends parent{
	void education(){
		System.out.println("BCA......");
	}

	void marry(){
		System.out.println("You");
	}
	
	void job(){
		System.out.println("TCS: 10,00,000");
	}

}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.education();
		c.marry();
		c.property();
		c.job();
	}
}

/*
OUTPUT:
BCA......
You
50 acre
TCS: 10,00,000

HYA CODE MADHE KAY KAY ZAL.

1] Parent chi abstract method la body dili.
2] Parent chi normal method override pn keli.
3] Parent chi method aahe ashi use pn keli.
4] Swatachi method pn lihili.
*/