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

	Company getCompany(Company obj){
		return obj;
	}
	
}

class Demo{
	public static void main(String[]args){
		Company coditas = new Company("Coditas","chaman");
		Company capg = new Company("Capgemini","surge");

		
		Employee shubham = new Employee("shubham");
		Employee ram = new Employee("ram");

		System.out.println("Employe name is:"+shubham.getEmpName());
		Company shubhamcomp = shubham.getCompany(capg);
		System.out.println("name of the company:"+shubhamcomp.getComName());
		System.out.println("Owner of the company:"+shubhamcomp.getOwner());

		System.out.println("------------------------------------------------");

		Company ramcomp = ram.getCompany(coditas);
		System.out.println("Employe name is:"+ram.getEmpName());
		System.out.println("name of the company:"+ramcomp.getComName());
		System.out.println("Owner of the company:"+ramcomp.getOwner());




	
		

	}
}



