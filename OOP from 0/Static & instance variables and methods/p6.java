class student {
	static String college = "KBP College";
	String name;

	student(String name){
		this.name = name;
	}

	void show(){
		System.out.println(name + " studies in " + college);
	}
	
}

class Demo{
	public static void main(String [] args){

	student obj = new student("satish");
	student obj1 = new student("snehal");

	obj.show();
	obj1.show();

	}
}

/*
OUTPUT:
satish studies in KBP College
snehal studies in KBP College
*/