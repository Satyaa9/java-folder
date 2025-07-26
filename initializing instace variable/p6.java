class Job{
	String name;
	String location;
	int employCount;

		void display(){
			System.out.println("Name of company is"+name);
			System.out.println("Location of company is :"+location);
			System.out.println("Total Emplyoees"+employCount);
	}
}
class Demo{
	public static void main(String[]args){
	
	Job comapany1 = new Job();
		company1.name="TCS";
		company1.location="Bandra West-Mumbai";
		company1.employCount=500;

	Job company2 = new Job();
		company2.name="Infosis";
		company2.location="New Mumbai East-Bandra";
		company2.employCount=400;
		
	Job company3 = new Job();
		company3.name="Vishal Mega Mart";
		company3.location="Sadar Bajar Pune-East";
		company3.employCount=1000;

			company1.display();
			System.out.println("-------------------------------");
			company2.display();
			System.out.println("-------------------------------");
			company3.display();
	 
	}
}
/*
OUTPUT:
Name of state :Maharashtra
Language of state :Marathi
Population of state :10000000
---------------------------
Name of state :Tamilnadu
Language of state :Tamil
Population of state :8000000
---------------------------
Name of state :Delhi
Language of state :Hindi
Population of state :1000000
*/