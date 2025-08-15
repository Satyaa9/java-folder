class Company{
	String name ="TCS";
}
class Employee extends Company{
	void display(){
		System.out.println("Company name is:"+name);
	}
}
class Demo{
	public static void main(String[]args){

	Employee obj = new Employee();
	obj.display();
	}
}
/*
OUTPUT:
Company name is:TCS
*/