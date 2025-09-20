import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("sanket");
		al.add("shubham");
		al.add("ram");
		al.add("rohan");

		System.out.println(al.lastIndexOf("chaman"));
	}
}

/*
OUTPUT:
-1

public int lastIndexOf(Object o)
Returns the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element. More formally, returns the highest index i such that Objects.equals(o, get(i)), or -1 if there is no such index

Returns:
the index of the last occurrence of the specified element in this list, or -1 if this list does not contain the element
*/