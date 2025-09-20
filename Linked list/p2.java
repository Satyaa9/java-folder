import java.util.*;
class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();

		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add("sanket");

		System.out.println(ls.getFirst());
		System.out.println("-----------------");
		System.out.println(ls);
	}
}

/*
OUTPUT:
10
-----------------
[10, 20, 30, sanket]

Returns:
the first element in this list
*/