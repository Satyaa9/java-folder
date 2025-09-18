import java.util.*;

class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<Integer>();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);
		al.add(50);
		al.add(50.50);

		System.out.println(al);
	}
}

/*
OUTPUT:
 error: incompatible types: double cannot be converted to Integer
                al.add(50.50);

Aapn jevha specific data type ghenya sathi generic cha use karto tevha fkt tyach type cha data den he required ast dusrya type cha data chalat nahi. <Integer> he generic aahe.
*/