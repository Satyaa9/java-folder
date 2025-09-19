import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList<Integer> al = new ArrayList<Integer>();
	
		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		for(Integer a:al){
			System.out.println(a);
		}
	}
}

/*
OUTPUT:
10
20
30
40

Retriving elements usign for each loop.

jr generic use kala asel tarch aapan tyacha refference gheu shakto.
*/