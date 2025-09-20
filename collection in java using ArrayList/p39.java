import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("sanket");
		al.add("satish");
		al.add("ankita");

		System.out.println(al.contains("ankita"));
	}
}

/*
OUTPUT:
true

public boolean contains(Object o)
Returns true if this list contains the specified element. More formally, returns true if and only if this list contains at least one element e such that Objects.equals(o, e).

Returns:
true if this list contains the specified element
*/