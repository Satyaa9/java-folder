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
		hs.add(new String("shubham"));
		hs.add(new String("sanket"));
		hs.add(new String("shubham"));

		System.out.print(hs);
	}
}

/*
OUTPUT:
[shubham, sanket]

Jevha aapan String la call karto tevha hash set duplicate print krt nahi karan aapan aapaplya class cha nahi tyancha class cha object pathavat aahe.
*/