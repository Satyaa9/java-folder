class Company {
	String cmpName;
	int empCount;

	Company(String cmpName, int empCount){
		this.cmpName = cmpName;
		this.empCount = empCount;
	}

	void setcmpName(){
		this.cmpName = cmpName;
	}
	void setempCount(){
		this.empCount = empCount;
	}

	String getcmpName(){
		return cmpName;
	}
	int getempCount(){
		return empCount;
	}
}

class Demo{
	public static void main(String[]args){
		Company coditas = new Company("coditas",500);

		System.out.println("Company name :"+coditas.getcmpName());
		System.out.println("Total no of employees :"+coditas.getempCount());

		System.out.println("------------------------------------");
		Company capg = new Company("capg",200);
		System.out.println("Company name :"+capg.getcmpName());
		System.out.println("Total no of employees :"+capg.getempCount());

		System.out.println("-----------------------------------");
		Company codex = new Company("Codex",1000);
		System.out.println("Company name :"+codex.getcmpName());
		System.out.println("Total no of employees :"+codex.getempCount());
	}
}

/*
OUTPUT:
Company name :coditas
Total no of employees :500
------------------------------------
Company name :capg
Total no of employees :200
-----------------------------------
Company name :Codex
Total no of employees :1000
*/