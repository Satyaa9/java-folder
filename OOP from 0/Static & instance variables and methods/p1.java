class Codex{
	int a;

	static void gun(){
		System.out.println("in static gun method :");
	}

	void fun(){
		System.out.println("in normal fun method :"+a);
	}
}
class Demo{
	public static void main(String [] args){
		Codex obj = new Codex();
		obj.a = 40;
		obj.fun();
		
	}
}

/*
OUTPUT:
in normal fun method :40

*/