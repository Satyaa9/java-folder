class Codex{
	void fun(char b){
		System.out.println("in void fun:"+b);
	}
	
	int fun(int a){
		System.out.println("in int fun:"+a);
		return a;
	}
}

class Demo{
	public static void main(String[]args){
	Codex c = new Codex();
	c.fun('A');
	c.fun(10);
	}
}
/*
OUTPUT:
in void fun:A
in int fun:10

Method overloading madhe aika class madhe same method asli tari chakate pn tyanch 
behaviour vegal pahijel or tyancha method signature different pahijet
*/