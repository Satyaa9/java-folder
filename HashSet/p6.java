import java.util.*;
class Student{
	String name;

	Student(String name){
		this.name=name;
	}

	public String toString(){
		return name;
	}
	
	public boolean equals(object obj){
		Student s=(Student)obj;
		if(this.name==s.name){
			return true;
		}
		return false;
	}
}