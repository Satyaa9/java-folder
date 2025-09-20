import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("sanket");
		al.add("shubham");
		al.add("ram");
		al.add("rohan");
		
		Iterator itr = al.iterator();

		while(itr.hasNext()){
			String s = itr.next();
			System.out.println(s);
		}
	}
}

/*
OUTPUT:
 error: incompatible types: Object cannot be converted to String
                        String s = itr.next();

Karan next cha return type by default Object asto ani jr aapan code madhe specifically generic lihil asel tarach te as a veriable act krt mhanun ha error aahe. jr ha error solve karayacha asel tr aapalyala generic ghyav lagel.
*/