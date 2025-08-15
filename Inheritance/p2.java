class Company{
	String name = "tcs";
}
class Employee{
	Company obj = new Company();
	void display(){
	System.out.println("Comapany name is:"+obj.name);
	}
}
class Demo{
	public static void main(String[]args){
		Employee e = new Employee();
		e.display();
	}
}
/*
OUTPUT:
Comapany name is:tcs
*/