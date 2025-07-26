class Goverment{
	String name;
	String language;
	int population;

		void display(){
		System.out.println("Name of state :"+name);
		System.out.println("Language of state :"+language);
		System.out.println("Population of state :"+population);
	}
}
class Demo{
	public static void main(String[]args){
	
	Goverment state1 = new Goverment();
		state1.name="Maharashtra";
		state1.language="Marathi";
		state1.population=10000000;

	Goverment state2 = new Goverment();
		state2.name="Tamilnadu";
		state2.language="Tamil";
		state2.population=8000000;

	Goverment state3 = new Goverment();
		state3.name="Delhi";
		state3.language="Hindi";
		state3.population=1000000;

			state1.display();
			System.out.println("---------------------------");
			state2.display();
			System.out.println("---------------------------");
			state3.display();
		
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