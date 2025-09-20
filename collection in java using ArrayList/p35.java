import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("sanket");
		al.add("shubham");
		al.add("ram");
		al.add("prem");

		System.out.println(al.remove(2));
		System.out.println("-------------------------");
		System.out.println(al);
	}
}

/*
OUTPUT:
ram
-------------------------
[sanket, shubham, prem]

Returns:
the element that was removed from the list.

Throws:
IndexOutOfBoundsException - if the index is out of range (index < 0 || index >= size())

*/