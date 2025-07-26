class Department{
	String name;
	int intake;
	String hod;

	void display(){

	System.out.println("Department Name :"+ name);
	System.out.println("Department intake :"+ intake);
	System.out.println("Department HOD :"+ hod);
	}
}
class Demo{
	public static void main(String[]args){
	
	Department dep1 = new Department();
		dep1.name="CSE";
		dep1.intake=180;
		dep1.hod="pappu";
	

	Department dep2 = new Department();
		dep2.name="E&TC";
		dep2.intake=100;
		dep2.hod="sanku";
		

	Department dep3 = new Department();
		dep3.name="Civil";
		dep3.intake=70;
		dep3.hod="chaman";

		dep1.display();
		System.out.println("-----------------------");
		dep2.display();
		System.out.println("-----------------------");
		dep3.display();

	

	}
}
/*
OUTPUT:
Department Name :CSE
Department intake :180
Department HOD :pappu
-----------------------
Department Name :E&TC
Department intake :100
Department HOD :sanku
-----------------------
Department Name :Civil
Department intake :70
Department HOD :chaman
*/