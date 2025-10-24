class Codex{
	Codex(int a){		//parameterized constructor.
		System.out.println("in parameterized constructor :");
	}
	
	Codex(){		//normal constructor.
		System.out.println("in normal constructor : ");
	}
}
class Demo{
	public static void main(String [] args){
	
	Codex obj = new Codex(10);
	Codex obj1 = new Codex();
	}
}

/*
OUTPUT:
in parameterized constructor :
in normal constructor :

aika class madhe 2 constructor chaltat pn tyacha madhala aik normal constructor aani aik parameterized constructor pahije.

te nasel tr aika class madhe fkt aikach constructor chalto.
*/