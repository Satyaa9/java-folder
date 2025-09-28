import java.util.*;
class Student{
	String name;

	Student(String name){
		this.name=name;
	}
	public String toString(){
		return name;
	}

	public boolean equals(Object obj){
		System.out.println("in equals");
		Student s = (Student)obj;
		return this.name==s.name;

	}

	public int hashCode(){
		System.out.println("in hashCode");
		return name.hashCode();
	}
}
class Demo{
	public static void main(String[]args){
		HashSet hs = new HashSet();
		Student a = new Student("shubham");
		Student b = new Student("sanket");
		Student c = new Student("sanket");
		Student d = new Student("shubham");

		hs.add(a);
		hs.add(b);
		hs.add(c);
		hs.add(d);

		System.out.println(hs);
		
	}
}

/*
OUTPUT:
in hashCode
in hashCode
in hashCode
in equals
in hashCode
in equals
[shubham, sanket]
*/