import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();

		hm.put(45,"rohit");
		hm.put(18,"virat");
		hm.put(18,1000);

		for(Object obj : hm.keySet()){
			String s = (String)hm.get(obj);
			System.out.println(s);
		}
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ClassCastException: class java.lang.Integer cannot be cast to class java.lang.String 
*/