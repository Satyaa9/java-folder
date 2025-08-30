class parent{
	abstract void property();
}
class child extends parent{
	void property(){

	}
}
class Demo{
	public static void main(String[]args);
	child c = new child();
}

/*
OUTPUT:
 error: parent is not abstract and does not override abstract method property() in parent
class parent{

Karan jr eka class madhe abstract method asatil tr to class pn as abstract class declare karava lagto.
*/