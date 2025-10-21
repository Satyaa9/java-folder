class Company {
	String name;
	String owner;

	Company(String name, String owner){
		this.name = name;
		this.owner = owner;
	}

	void setName(String name){
		this.name =name;
	}
	void setOwner(String owner){
		this.owner = owner;
	}

	String getName(){
		return name;
	}
	String getOwner(){
		return owner;
	}
}

class Employee{
	String empName;

	Employee(String empName){
		this.empName = empName;
	}

	void setEmpName(String empName){
		this.empName = empName;
	}

	String getEmpName(){
		return empName;
	}

	String empData(Company obj){
		return obj.getName();
	}

	String getOwner(Company obj){
		return obj.getOwner();
	}
}

class Demo{
	public static void main(String [] args){
		Company coditas = new Company("coditas","shubham");
		System.out.println("company name is :"+ coditas.getName());
		System.out.println("company owner name is :"+ coditas.getOwner());

		System.out.println("--------------------------------------");

		Company capg = new Company ("capgemini", "satish");
		System.out.println("company name is :"+ capg.getName());
		System.out.println("company owner name is :"+ capg.getOwner());

		System.out.println("------------------------------------");

		Company codex = new Company ("codex","vaibhav");
		System.out.println("company name is :"+ codex.getName());
		System.out.println("company owner name is :"+ codex.getOwner());

		System.out.println("--------------------------------");

		Employee sanket = new Employee("sanket");
		System.out.println("Employee name :"+sanket.getEmpName());
		System.out.println("Employee company name :"+sanket.empData(capg));
		System.out.println("Employee company owner :"+sanket.getOwner(capg));

		System.out.println("---------------------------------------------");

		Employee ram = new Employee("ram");
		System.out.println("Employee name :"+ram.getEmpName());
		System.out.println("Employee company name :"+ram.empData(codex));
		System.out.println("Employee company owner :"+ram.getOwner(codex));

	}
}

/*
OUTPUT:
company name is :coditas
company owner name is :shubham
--------------------------------------
company name is :capgemini
company owner name is :satish
------------------------------------
company name is :codex
company owner name is :vaibhav
--------------------------------
Employee name :sanket
Employee company name :capgemini
Employee company owner :satish
---------------------------------------------
Employee name :ram
Employee company name :codex
Employee company owner :vaibhav
*/






















