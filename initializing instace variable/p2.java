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

	ref.id=1234;
	ref.name="Satya";
	ref.display();

	}
}

/*
OUTPUT:
0
null
1234
Satya
*/