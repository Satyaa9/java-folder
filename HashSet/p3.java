import java.util.*;
class Student{
	String name;
	
	Student(String name){
		this.name=name;
	}

	public String toString(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
		HashSet hs = new HashSet();
		hs.add(new Student("shubham"));
		hs.add(new Student("sanket"));
		hs.add(new Student("shubham"));

		System.out.print(hs);
	}
}