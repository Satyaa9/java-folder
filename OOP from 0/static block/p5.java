class Codex{
	static int a = 10;
	
	static{
		System.out.println("in static block");
	}
}
class Demo{
	public static void main(String [] args){
		System.out.println("in main");
		System.out.println(Codex.a);
	}
}

/*
OUTPUT:
in main
in static block
10

2 class ch connection banavun dilay Codex.a hya line ne tyamule te varachya class madhal pn execution kart.
*/