class Codex{
	int a;
	String name;

	Codex(){
		a=10;
		name="shubham";
	}
	void display(){
		System.out.println("ID :"+ a);
		System.out.println("Name :"+ name);
	}
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		Codex obj1 = new Codex();

		obj.a = 11;
		obj.name = "sanket";
		obj.display();

		System.out.println("---------------");
		obj1.a = 12;
		obj1.name = "satish";
		obj1.display();
	}
}

/*
OUTPUT:
ID :11
Name :sanket
---------------
ID :12
Name :satish

ethe aik problem aahe aaplayala varchya class madhe variable aadhich initialize karun thevav lagtay mhanje value set karun thevavi lagtiye.
*/