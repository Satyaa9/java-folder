import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList<String> al = new ArrayList<String>();
	
		al.add("shubham");
		al.add("sanket");
		al.add("rohit");
		al.add("satish");

		String a = al.get(0);
		Object b = al.get(1);

		System.out.println(a);
		System.out.println(b);
		
	}
}

/*
OUTPUT:
shubham
sanket

Object ha saglya class cha parent aahe tyamule tyacha reference gheun object banavala tr chalatoch 
ArrayList madhe indexing work kartech karte fkt .get() method use karavi lagte.
*/