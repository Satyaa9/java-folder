import java.util.*;
class Demo{
	public static void main(String[]args){
		LinkedList ls = new LinkedList();

		ls.add(10);
		ls.add(20);
		ls.add(30);
		ls.add("shubham");

		System.out.println(ls.removeFirst());
		System.out.println("------------------");
		System.out.println(ls);
	}
}

/*
OUTPUT:
10
------------------
[20, 30, shubham]

public E removeFirst()
Removes and returns the first element from this list.

Returns:
the first element from this list
*/