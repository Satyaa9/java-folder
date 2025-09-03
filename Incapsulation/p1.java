class codex{
	private int a=10;

	int GetId(){
		return a;
	}
}
class Demo{
	public static void main(String[]args){
		codex c = new codex();

		System.out.println(c.GetId());
	}
}

/*
OUTPUT:10

*/