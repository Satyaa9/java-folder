import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();
		
		al.add(10);
		Integer a = al.get(0);
		System.out.println(a);
	}
}

/*
OUTPUT:
 error: incompatible types: Object cannot be converted to Integer

Karan ethe jr aapan specific generic dila tarach tyacha class chya name ne class karu shakto nahitr by default saglyancha parent class aahe.
*/
