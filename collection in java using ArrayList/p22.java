import java.util.*;
class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();

		al.add(10);
		al.add(20);
		al.add(30);
		al.add(40);

		for(int a:al){
			System.out.println(a);
		}
	}
}

/*
OUTPUT:
error: incompatible types: Object cannot be converted to int
                for(int a:al){
*/