import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("sanket");
		al.add("prem");
		al.add("shubham");
		al.add("ram");

		System.out.println(al.getFirst());
		System.out.println("---------------------");
		System.out.println(al);
	}
}

/*
OUTPUT:
sanket
---------------------
[sanket, prem, shubham, ram]

public E getFirst()
Gets the first element of this collection.

Returns:
the retrieved element
*/