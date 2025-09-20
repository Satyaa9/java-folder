import java.util.*;
class teacher {
	String name;

	teacher(String name){
		this.name=name;
	}

	String getName(){
		return name;
	}
}

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add(new teacher("shubham"));
		al.add(new teacher("sanket"));
		al.add("prem");

		for(Object obj:al){
			teacher t = (teacher)obj;
			System.out.println(t.getName());
		}
	}
}

/*
OUTPUT:
shubham
sanket
Exception in thread "main" java.lang.ClassCastException: class java.lang.String cannot be cast to class teacher.

ArrayList madhe aapan different type cha data store karu shakato pn jr koni dusryanni to data retrieve karayala baghitla tr tyanna khup problem yetat mhanun aapan arrayList cha data generic use karun aikach type cha dyayacha asto. 
*/