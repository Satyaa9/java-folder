import java.util.*;
class leader {
	String name;
	String party;

	leader(String name, String party){
		this.name=name;
		this.party=party;
	}

	String toString(){
		return "name is :"+name +"party is :"+party;
	}
}
class Demo{
	public static void main(String[]args){
		leader obj = new leader("shubham","bjp");
		leader obj1= new leader("sanket","mns");

		System.out.println(obj);
		System.out.println(obj1);
	}
}

/*
OUTPUT:
 error: toString() in leader cannot override toString() in Object
        String toString(){
               ^
  attempting to assign weaker access privileges; was public

Karan toString() method jikde kothe lihun thevli aahe ti public lihun thevli aahe tyamule tila access kartana aaplayala access specifier public dyava lagto.
By default access specefier default asto tymule te access hot nahi.
*/