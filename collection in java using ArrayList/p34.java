import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<String> al = new ArrayList<String>();

		al.add("shubham");
		al.add("sanket");
		al.add("rohan");
		al.add("ram");

		Iterator itr = al.iterator();

		while(itr.hasNext()){
			String s = (String)itr.next();

			System.out.println(s);
		}
	}
}

/*
OUTPUT:
shubham
sanket
rohan
ram
*/