class Codex{
	void fun(int a){
	System.out.println("in void int:"+a);
		
	}
	int fun(int b){
		System.out.println("in void int:"+b);
		return b;
	}
}

class Demo{
	public static void main(String[]args){
		Codex obj = new Codex();
		obj.fun(20);
		obj.fun(10);

	}
}
/*
OUTPUT:
error: method fun(int) is already defined in class Codex
        int fun(int b){

Karan method same aslya pahijet tyacha property different lagtat.
*/