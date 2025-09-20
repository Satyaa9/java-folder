import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add("shubham");
		al.add("rohan");
		al.add("sanket");
		al.add("ram");

		System.out.println(al.clone());
		
	}
}

/*
OUTPUT:
[shubham, rohan, sanket, ram]

public Object clone()
Returns a shallow copy of this ArrayList instance. (The elements themselves are not copied.)


Returns:
a clone of this ArrayList instance
*/