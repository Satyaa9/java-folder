class Codex{
	int a;

	void fun(int a){
		this.a = a;
		System.out.println(a);
	}
}
class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		Codex obj1 = new Codex();

		obj.fun(10);
		obj1.fun(20);

		System.out.println(obj.a);
		System.out.println(obj1.a);
	}
}

/*
OUTPUT:
10
20
10
20
*/