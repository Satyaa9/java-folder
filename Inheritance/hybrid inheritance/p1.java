class Parent{
	void parent_property(){
		System.out.println("parent property");
	}
}
class child1 extends Parent{
	void child1_property(){
		System.out.println("child 1 property");
	}	
}
class child2 extends Parent{
	void child2_property(){
		System.out.println("child 2 property");
	}
}

class Demo{
	public static void main(String[]args){
		
	child1 c1 = new child1();
	c1.child1_property();
	c1.parent_property();

	System.out.println("--------------------------");

	child2 c2 =new child2();
	c2.child2_property();
	c2.parent_property();
	}
	
}