import java.util.*;
class Student{

	String name;
	int age;

	Student(String name, int age){
		this.name=name;
		this.age=age;
	}

	public String toString(){
		return name;
	}
}
class Demo{
	public static void main(String[]args){
		HashSet hs = new HashSet();
		hs.add(new Student("shubham",27));
		hs.add(new Student("sanket",28));
		hs.add(new Student("shubham",27));

		System.out.print(hs);
	
	}
}

/*
OUTPUT:
[shubham, sanket, shubham]

HashSet madhe duplicate chalat nahit pn ethe jr aapan parameter jevha pathavat aahe tevha te duplicate print krt aahe.
*/