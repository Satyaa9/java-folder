import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();

		hm.put(45,"rohit");
		hm.put(18,"virat");
		hm.put(45,1000);

		String s =(String)hm.get(45);
		System.out.println(s);
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String 

Karan aapan int chi value chi key call kartoy aani type cast kartana aapan string type krt aahe tyamule run-time exception yet aahe.
*/