interface parent{
	private void fun(){
		System.out.println("in private fun");
	}

	default void display(){
		fun();
	}
}
class child implements parent{

}
class Demo{
	public static void main(String[]args){
		child c= new child();
		c.display();
	}
}


/*
OUTPUT:in private fun

pn aapan private madhlya goshti asha fkt java-8 nantr chya version nantrach karu shakato
karan java-7 parent cha version madhe private method fkt tya class madhech access karu shakat hoto.
*/