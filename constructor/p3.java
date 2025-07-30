class Codex{
	int id;
	String name;

	void display(){
		System.out.println(id);
		System.out.println(name);
	}
}

class Demo{
	public static void main(String[]args){
	Codex ref = new Codex();
		ref.display();
	}
}

/*
OUTPUT:
0
null
*/
