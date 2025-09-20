import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();
	
		al.add("sanket");
		al.add("shubham");
		al.add("prem");
		al.add("ram");

		Iterator itr = al.iterator();

		for(Object obj : itr){
			System.out.println(obj);
		}
	}
}

/*
OUTPUT:
error: for-each not applicable to expression type
                for(Object obj : itr){

Karan iterator vr for each chalat nahi aani aapan hya program vr iterator vr for each loop lavat aahe tyamule error yyet aahe.
*/