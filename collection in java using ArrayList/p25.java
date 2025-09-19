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

		for(Object a:al){
			System.out.println(al.getName());
		}
	}
}

/*
OUTPUT:
error: cannot find symbol
                        System.out.println(al.getName());

Karan aapan object cha reference dilay tya mule te object class madhe getName() method searh karaty pn tikde tyala ti method sapdat nahiye.
*/