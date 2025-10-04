import java.util.*;
class Codex{
	
	void test(int a, double b){
		System.out.println("in first:"+a);
		System.out.println("in first:"+b);
	}
	void test(double a, int b){
		System.out.println("in first:"+b);
		System.out.println("in first:"+a);
	}
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		obj.test(10,10.1);
		obj.test(20.1,20);
	}
}

/*
OUTPUT:
in first:10
in first:10.1
in first:20
in first:20.1
*/