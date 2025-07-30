class Codex{
	int a;
	String name;
	
	Codex(){
		a=10;
		name="Satyaa";
	}
	void display(){
		System.out.println("id is :"+ a	);
		System.out.println("name is :"+name);
	}
}
class Demo{
	public static void main(String[]args){
		Codex obj1 = new Codex();
		Codex obj2 = new Codex();

		obj1.a=20;
		obj1.name="Satish";
		obj1.display();

		obj2.display();
		
		obj2.a=30;
		obj2.name="shubham";
		obj2.display();

	}
}
/*
OUTPUT:
id is :20
name is :Satish
id is :10
name is :Satyaa
id is :30
name is :shubham
*/