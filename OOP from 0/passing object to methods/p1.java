class Company{
	String cmpName;
	String ownerName;

	Company(String cmpName, String ownerName){
		this.cmpName = cmpName;
		this.ownerName = ownerName;
		
	}

	String getcmpName(){
		return cmpName;
	}
	
	String getownerName(){
		return ownerName;
	}

}

class Employess {
	String empName;
	String company;

	Employess(String empName, Company company){
		this.empName = empName;
		this.company = Company;
	}

	String getempName(){
		return empName;
	}

	void setcompany (Company company){
		this.company = Company;
	}

	Company getcompany(){
		return Company;
	}
}

class Demo{
	public static void main(String[]args){
		Company capg = new Company("capg", "shubham");
	}
}