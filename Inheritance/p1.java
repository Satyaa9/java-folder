class Company{
	String name="tcs";
}

class Employee{
	void display(){
		System.out.println(name);
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
cannot find symbol
                System.out.println(name);
*/