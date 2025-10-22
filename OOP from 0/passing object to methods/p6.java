class Company {
	String name;

	Company(String name){
		this.name = name;
	}

	void setName(){
		this.name = name;
	}

	String getName(){
		return name;
	}
}
class Employee {
	String empName;

	Employee(String empName){
		this.empName = empName;
	}

	void setempName(String empName){
		this.empName = empName;
	}

	String getempName(){
		return empName;
	}

	Company getCompany(Company obj){
		return obj;
	}
}

class Demo{
	public static void main(String [] args){
		Employee shubham = new Employee("shubham");
		Employee ram = new Employee("ram");

		Company capg = new Company("Capgemini");
		Company coditas = new Company("coditas");

		System.out.println("Employee name is :"+shubham.getempName());
		Company shubhamComp = shubham.getCompany(coditas);
		System.out.println("Employee company name is :"+shubhamComp.getName());

		System.out.println("----------------------------");
		System.out.println("Empoyee name is :"+ram.getempName());
		Company ramComp = ram.getCompany(capg);
		System.out.println("Employee company name is :"+ramComp.getName());
	}
}

/*
OUTPUT:
Employee name is :shubham
Employee company name is :coditas
----------------------------
Empoyee name is :ram
Employee company name is :Capgemini
*/