import java.util.*;
class Codex{
	
	void test(int a, double b){
		System.out.println("in first:"+a);
		System.out.println("in first:"+b);
	}

	void test(double a, int b){
		System.out.println("in second:"+a);
		System.out.println("in second:"+b);
	}
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();

		obj.test(5,5);
		
	}
}

/*
OUTPUT:
error: reference to test is ambiguous
                obj.test(5,5);

Method overloading.
*/