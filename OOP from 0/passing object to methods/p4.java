class Company {
	String name = "shubham";

	String getName(){
		return name;
	}
}

class Employee {
	Company getCompany(){
		return new Company();
	}
}

class Demo{
	public static void main(String[]args){
		Employee e = new Employee();
		Company c = new Company();

		System.out.println(c.getName());
		System.out.println(e.getCompany().getName());
	}
}

/*
OUTPUT:
shubham
shubham
*/