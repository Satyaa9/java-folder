interface parent{
	void fun();

	static void gun(){
		System.out.println("in parent gun");
	}
}
class child implements parent{
	public void fun(){
		System.out.println("in child fun");
	}
	public void gun(){
		System.out.println("in child gun");
	}
}
class Demo{
	public static void main(String[]args){
		child c = new child();
		c.fun();
		c.gun();
		parent.gun();
	}
}

/*
OUTPUT:
in child fun
in child gun
in parent gun

Interface madhe static method chaltat.
varchya code madhe aapan static method object banaun aani direct class name ne pn call ke aahe.-
*/