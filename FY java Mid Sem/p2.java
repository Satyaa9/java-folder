import java.lang.*;
class Codex{
		void fun(char b){
			System.out.println("in fun :"+ b);
		}
	
		void fun(int a){
			System.out.println("in para fun :"+a);	
		}
}
class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		obj.fun('A');
		obj.fun(10);
	}
}

/*
OUTPUT:
in fun :A
in para fun :10

Method overloading in java.
*/