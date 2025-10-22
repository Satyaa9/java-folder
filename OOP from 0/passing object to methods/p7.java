class Company {
	String name;
	String owner;

	Company(String name , String owner){
		this.name = name;
		this.owner = owner;
	}

	void setName(String name){
		this.name = name;
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
	String empname;
	Company company;

	Employee(String empname , Company company){
		this.empname = empname;
		this.company = company;
	}

	void setName(String empname){
		this.empname = empname;
	}

	void setCompany(Company company){
		this.company = company;
	}

	String getempName(){
		return empname;
	}

	Company getCompany(){
		return company;
	}
}

class Demo{
	public static void main(String [] args){
		Company capg = new Company("Capgemini pvt.lmt","raghu");
		Company coditas = new Company("Coditas pvt.lmt","chaman");
		Company tcs = new Company("TCS pvt.lmt","Tata");

		Employee shubham = new Employee("shubham",capg);
		Employee ram = new Employee("ram",coditas);
		Employee sanket = new Employee("sanket",tcs);

		System.out.println("Employee name is :"+shubham.getempName());
		Company shubhamcomp = shubham.getCompany();
		System.out.println("Employee company name is :"+shubhamcomp.getName());
		System.out.println("Employee company owner is :"+shubhamcomp.getOwner());

		System.out.println("------------------------------------");

		System.out.println("Employee name is :"+ram.getempName());
		Company ramcomp = ram.getCompany();
		System.out.println("Employee company name is :"+ramcomp.getName());
		System.out.println("Employee company owner us :"+ramcomp.getOwner());

		System.out.println("---------------------------------------");
	
		System.out.println("Employee name is :"+sanket.getempName());
		Company sanketcomp = sanket.getCompany();
		System.out.println("Employee company name is :"+sanketcomp.getName());
		System.out.println("Employee company owner us :"+sanketcomp.getOwner());

		System.out.println("-----------------------"+"The End"+"-------------------------");	
	}
}

/*
OUTPUT:
Employee name is :shubham
Employee company name is :Capgemini pvt.lmt
Employee company owner is :raghu
------------------------------------
Employee name is :ram
Employee company name is :Coditas pvt.lmt
Employee company owner us :chaman
---------------------------------------
Employee name is :sanket
Employee company name is :TCS pvt.lmt
Employee company owner us :Tata
-----------------------The End-------------------------
*/














