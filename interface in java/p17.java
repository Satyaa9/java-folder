interface parent1{
	default void gun(){
		System.out.println("in parent1 gun");
	}
}
interface parent2{
	default void gun(){
		System.out.println("in parent 2 gun");
	}
}
class child implements parent1,parent2{
	public void gun(){
		parent1.super.gun();
		parent2.super.gun();
	}
}
class Demo{
	public static void main(String[]args){
		child c = new child();

		c.gun();
	}
}
/*
OUTPUT:
in parent1 gun
in parent 2 gun
*/