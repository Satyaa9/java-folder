class Codex{
	int id;
	String name;

		void display(){
			System.out.println(name);
			System.out.println(id);
	}
}
class Demo{
	public static void main(String[]args){
		Codex ref = new Codex();
			ref.display();
		
			ref.id=10;
			ref.name="Satyaa";

			ref.display();	
	}
}
/*
OUTPUT:
null
0
Satyaa
10
*/