interface parent{
	void fun();

	void gun(){
		System.out.println("in fun");
	}
}
class Demo{
	public static void main(String[]args){

	}
}
/*
OUTPUT:
error: parent is abstract; cannot be instantiated
                parent p = new parent();

Appan interface madhe asha padhatine normal method nahi lihu shakat tya sathi vegla syntax aahe.
*/