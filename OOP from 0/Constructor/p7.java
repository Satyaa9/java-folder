class Codex{
	int num;

	Codex(int a){
		num=a;
		System.out.println("in paramaeterized constructor :"+num);
	}
	
	Codex(){
		System.out.println("in normal constructor :");
	}
}

class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);
		Codex obj1 = new Codex();
	}
}

/*
OUTPUT:
in paramaeterized constructor :10
in normal constructor :
*/