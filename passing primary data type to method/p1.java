class Company{
	String cmpName;
	int empCount;
	Company(String cmpName,int empCount){
		this.cmpName = cmpName;
		this.empCount = empCount;
	}
	void setCmpName(String cmpName){
		this.cmpName = cmpName;
	}
	void setEmpCount(int empCount){
		this.empCount = empCount;
	}

	String getCmpName(){
		return cmpName;
	}

	int getEmpCount(){
		return empCount;
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

}

class Demo{
	public static void main(String[]args){
		Company coditas = new Company("coditas",500);	
		System.out.println("Copmany name is : "+coditas.getCmpName()+" Emp Count "+coditas.getEmpCount());
		coditas.setEmpCount(1000);
		System.out.println("coditas Emp Count after one year "+coditas.getEmpCount());

		System.out.println("-----------------------------------------------------------------");

		Company capg = new Company("Capgemini",2000);	
		System.out.println("Copmany name is : "+capg.getCmpName()+" Emp Count "+capg.getEmpCount());
		System.out.println("Capg Emp Count after one year "+capg.getEmpCount());
	}
	
}







