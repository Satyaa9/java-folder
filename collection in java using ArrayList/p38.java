import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("sanket");
		al.add("sanket");
		al.add("ram");

		System.out.println(al.set(1,"sham"));
		System.out.println("-----------------");
		System.out.println(al);
	}
}

/*
OUTPUT:
sanket
-----------------
[shubham, sham, sanket, ram]

public E set(int index,
 E element)
Replaces the element at the specified position in this list with the specified element.

Returns:
the element previously at the specified position
*/