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
		ArrayList al = new ArrayList();

		al.add(new student("shubham"));
		al.add(new student("sanket"));

		student s = (student)al.get(0);
		System.out.println(s.getName());
	}
}

/*
OUTPUT:
shubham
*/