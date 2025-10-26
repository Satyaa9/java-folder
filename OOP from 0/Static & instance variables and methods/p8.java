class Codex{
	static int add(int a , int b){
		return a+b;
	}
}
class Demo{
	public static void main(String [] args){
	
	int sum = Codex.add(10,20);
	System.out.println("sum :"+sum);
	}
}

/*
OUTPUT:

sum :30

static variable la class chya name ne call karata yeto without object create karta.
*/