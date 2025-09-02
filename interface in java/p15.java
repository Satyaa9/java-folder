interface parent1{
	default void education(){
		System.out.println("in parent 1 engineering");
	}
}
interface parent2{
	default void education(){
		System.out.println("in parent 2 BCA");
	}
}
class child implements parent1,parent2{
	public void education(){
		parent1.super.education();
		parent2.super.education();
	}
}
class Demo{
	public static void main(String[]args){

		child c = new child();
		c.education();
	}
}

/*
OUTPUT:
in parent 1 engineering
in parent 2 BCA
*/