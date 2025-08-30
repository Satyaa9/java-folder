interface parent{
	void fun();

	default void gun(){
		System.out.println("in parent gun");
	}
}
class child implements parent{
	public void fun(){
		System.out.println("in child fun");
	}

	public void gun(){
		System.out.println("in parent gun");
	}



	
}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.fun();
		c.gun();
		
		
		
	}
}

/*
OUTPUT:
in child fun
in parent gun
*/