interface parent{
	void fun();
}
class Demo{
	public static void main(String[]args){
		parent p = new parent();
	}
}
/*
OUTPUT:
error: parent is abstract; cannot be instantiated
                parent p = new parent();

Karan interface cha object kadhihi banat nahi
*/