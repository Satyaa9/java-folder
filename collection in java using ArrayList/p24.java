import java.util.*;
class student{
	String name;
	student(String name){
		this.name=name;
	}

	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String[]args){
		ArrayList<student> al = new ArrayList<student>();

		al.add(new student("shubham"));
		al.add(new student("sanket"));

		for(student a:al){
			System.out.println(a.getName());
		}

	}
}

/*
OUTPUT:
shubham
sanket
*/