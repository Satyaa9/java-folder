class Company{
	String comname;
	String owner;

	Company(String comname,String owner){
		this.comname=comname;
		this.owner=owner;
	}
	void setComName(String comname){
		this.comname=comname;
	}

	void setComOwner(String owner){
		this.owner=owner;
	}

	String getComName(){
		return comname;
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

	String EmpData(Company obj){
		return obj.getComName();
	}
	String getOwner(Company obj){
		return obj.getOwner();

	}
}

class Demo{
	public static void main(String[]args){
		Company coditas = new Company("Coditas","chaman");
		System.out.println("company name :"+coditas.getComName());
		System.out.println("company owner :"+coditas.getOwner());
		coditas.setComOwner("rajat");
		System.out.println("company owner after one year:"+coditas.getOwner());

		System.out.println("------------------------------------------------------");

		Company capg = new Company("capgemini","ramu");
		System.out.println("company name is:"+capg.getComName());
		System.out.println("company owner:"+capg.getOwner());
		System.out.println("company owner after one year:"+capg.getOwner());

		System.out.println("------------------------------------------------------");

		Employee shubham = new Employee("shubham");
		System.out.println(shubham.getEmpName());
		System.out.println(shubham.EmpData(capg));
		System.out.println(shubham.getOwner(capg));


		

	}
}

/*
OUTPUT;
company name :Coditas
company owner :chaman
company owner after one year:rajat
------------------------------------------------------
company name is:capgemini
company owner:ramu
company owner after one year:ramu
------------------------------------------------------
shubham
capgemini
ramu
*/















