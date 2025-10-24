class Codex{
	Codex(int a){
		System.out.println("in constructor :"+a);
	}
}
class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);
		Codex obj1 = new Codex(20);
	}
}

/*
OUTPUT:
in constructor :10
in constructor :20
*/