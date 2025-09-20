import java.util.*;
class Teacher{
	String name;

	Teacher(String name){
		this.name=name;
	}

	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String[]args){
		ArrayList<Teacher> al = new ArrayList<Teacher>();

		al.add(new Teacher("shubham"));
		al.add(new Teacher("sanket"));
		al.add(new Teacher("prem"));

		Iterator<Teacher> itr = al.iterator();
		while(itr.hasNext()){
			System.out.println(itr.next());
		}


	}
}

/*
OUTPUT:
Teacher@2f92e0f4
Teacher@28a418fc
Teacher@5305068a
*/