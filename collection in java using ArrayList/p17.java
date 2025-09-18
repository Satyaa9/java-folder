import java.util.*;

class Demo{
	public static void main(String[]args){
		
		ArrayList<Integer> al = new ArrayList<Integer>();
			al.add(10);
			al.add(20);
			al.add(30);
			al.add(40);
			al.add(50);
		int a = al.get(0);
		Object b = al.get(1);

		System.out.println(a);
		System.out.println(b);
	}
}

/*
OUTPUT:
10
20
*/