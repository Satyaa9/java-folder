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

		ref.id=10;
		ref.name="Satyaa";

		Codex ref1 = new Codex();
		ref.display();
		ref1.display();
	}
}
/*
OUTPUT:
0
null
10
Satyaa
0
null
*/