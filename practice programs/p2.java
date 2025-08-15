class Code{
	int id;
	String name;

	void display(){
		System.out.println("This is the id:"+id);
		System.out.println("This is the name:"+name);
	}
}
class Demo{
	public static void main(String[] args){
	
	Codex obj = new Code();
		obj.display();

		obj.id=10;
		obj.name="Satyaa";
		obj.display();

	Codex obj1 = new Code();
		obj1.display();
	}
}
/*
OUTPUT:
This is the id:0
This is the name:null
This is the id:10
This is the name:Satyaa
This is the id:0
This is the name:null
*/