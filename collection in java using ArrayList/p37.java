import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("sanket");
		al.add("ram");
		al.add("rohan");

		System.out.println(al.getLast());
		System.out.println("---------------");
		System.out.println(al);
	}
}

/*
OUTPUT:
rohan
---------------
[shubham, sanket, ram, rohan]

public E getLast()
Gets the last element of this collection.

Returns:
the retrieved element
*/