import java.util.*;
class Demo{
	public static void main(String []args){
		ArrayList al = new ArrayList();

		al.add("rohan");
		al.add("shubham");
		al.add("ram");
		al.add("sanket");

		System.out.println(al.toArray());
		System.out.println(al);
	}
}

/*
OUTPUT:
[Ljava.lang.Object;@372f7a8d
[rohan, shubham, ram, sanket]

public Object[] toArray()
Returns an array containing all of the elements in this list in proper sequence (from first to last element).
The returned array will be "safe" in that no references to it are maintained by this list. (In other words, this method must allocate a new array). The caller is thus free to modify the returned array.

This method acts as bridge between array-based and collection-based APIs.


Returns:
an array containing all of the elements in this list in proper sequence.
*/