import java.util.*;
class Student{
	String name;

	Student(String name){
		this.name=name;
	}

	public int hashCode(){
		return name.hashCode();
	}
}
class Demo{
	public static void main(String[]args){
		Student a=new Student("shubham");
		Student b=new Student("shubham");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

/*
OUTPUT:
2072214450
2072214450

Karan ethe aapan hashCode method hi aaplya class madhe override keli aahe tyamule te aata adress compare krt aani tyacha nantr content check krtay.
*/
