class Codex{
	static int a = 10;

	static{
		System.out.println("in static block");
	}

	static void fun(){
		System.out.println("in static fun");
	}
}
class Demo{
	public static void main(String [] args){
		System.out.println("in main");
		Codex.fun();
	}
}

/*
OUTPUT:
in main
in static block
in static fun
*/