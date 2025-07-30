class Codex{
	int a;
	Codex(){
		a=10;
		int a=20;
		a=20;
		System.out.println(a);
	}
}
class Demo{
	public static void main(String[]args){
	Codex obj = new Codex();
	System.out.println(obj.a);
	}
}