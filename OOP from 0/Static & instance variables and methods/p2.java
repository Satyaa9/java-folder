class Codex{
	int a;

	static void gun(Codex obj){
		System.out.println("in static method :"+obj.a);
	}

	void fun(){
		System.out.println("in normal method :"+a);
	}
}
class Demo{
	public static void main(String [] args){
		
	Codex obj = new Codex();
	obj.a = 40;
	obj.fun();
	obj.a = 20;
	obj.gun(obj);
	}
}

/*
OUTPUT:
in normal method :40
in static method :20

aapan static method madhe variable direct access nahi karu shakat aaplyala tya method la class cha object send karava lagto.
aani khalun method call kartana pn object send karava lagto aani varati class chya name ne object catch karava lagto.
*/