class love{
	static String couple = "loves";
	String name;

	love(String name){
		this.name = name;
	}

	void show(){
		System.out.println(name + " "+couple +" each other ");
	}
}

class Demo{
	public static void main(String [] args){
		love obj = new love("satyaa & sneha");
		love obj1 = new love("sneha & satyaa");

		obj.show();
		obj1.show();
	}
}

/*
OUTPUT:
satyaa & sneha loves each other
sneha & satyaa loves each other
*/