abstract class parent{
	abstract void property();
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

karan abstract class cha kadhihi object banat nahi aapan banavayacha try kela tr compiler error det.
*/