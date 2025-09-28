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
		Student a = new Student("shubham");
		Student b = new Student("shubham");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

/*
OUTPUT:
798154996
681842940

public native int hashCode();
karan ethe aapan object class cha method la call jatoy karan student ha aapan lihilela class aahe
tya class ne hashCode method override keleli nahi tyamule te different address det karan object madhali hashCode method adress compare karte content nahi.
jr aaplyala vatat asel ki tyane same adress return karava tr aaplyala hashCode method aaplya class madhe override karav lagat.
*/