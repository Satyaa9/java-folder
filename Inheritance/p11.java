class parent{
	int a=10;
}
class child{
	int a=20;
	void fun(){
		System.out.println("in child:"+a);
		System.out.println(System.identityHashCode(a));
	}
}
class Demo{
	public static void main(String[]args){
		child c = new child();
		System.out.println(System.identityHashCode(c));
		c.fun();
	}
}