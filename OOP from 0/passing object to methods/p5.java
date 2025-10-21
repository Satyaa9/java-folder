class Company {
	String name = "capgemini";

	String getName(){
		return name;
	}
}
class Employee {
	String empName = "shubham";

	String getEmpName(){
		return empName;
	}

	Company getCompany(Company obj){
		return obj;
	}
}
class Demo{
	public static void main(String [] args){
		Company capg = new Company ();
		Employee shubham = new Employee();

		System.out.println("Employee name is :"+shubham.getEmpName());
		System.out.println("Employee's company name is :"+shubham.getCompany(capg).getName());
	}
}

/*
OUTPUT:
Employee name is :shubham
Employee's company name is :capgemini
*/