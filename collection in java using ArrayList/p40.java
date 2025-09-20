import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("sanket");
		al.add("ram");
		al.add("rohan");

		System.out.println(al.indexOf("ram"));
	}
}

/*
OUTPUT:
2

public int indexOf(Object o)
Returns the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element. More formally, returns the lowest index i such that Objects.equals(o, get(i)), or -1 if there is no such index.

Returns:
the index of the first occurrence of the specified element in this list, or -1 if this list does not contain the element
*/