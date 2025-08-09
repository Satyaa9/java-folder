class Adress{
	String city;
	Adress(String city){
		this.city=city;
	}
	void displayCity(){
		System.out.println("name of city : "+city);
	}
}
class Student{
	String name;
	Student(String name){
		this.name=name;
	}
	void displayName(Adress obj){
		System.out.println("Name of student :"+name);
		obj.displayCity();
	}
}
class Demo{
	public static void main(String[]args){
		Adress obj = new Adress("Satara");
		Student obj1 = new Student("Shubham");
		Student obj2 = new Student("Sanket");

		obj1.displayName(obj);
		obj2.displayName(obj);
	}
}
/*
OUTPUT:
Name of student :Shubham
name of city : Satara
Name of student :Sanket
name of city : Satara
*/