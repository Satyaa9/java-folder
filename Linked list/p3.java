import java.util.*;
class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();

		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add("shubham");

		System.out.println(ls.getLast());
		System.out.println("------------------------");
		System.out.println(ls);
	}
}

/*
OUTPUT:
shubham
------------------------
[10, 20, 30, shubham]

Returns:
the last element in this list
*/