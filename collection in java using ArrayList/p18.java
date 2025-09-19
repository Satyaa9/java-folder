import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();
		
		al.add(10);
	
		System.out.println(al.get(1));
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.IndexOutOfBoundsException: Index 1 out of bounds for length 1
*/