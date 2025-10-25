class Codex{
	int a;

	Codex(int a){
		a = a;
	}
}
class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);
		Codex obj1 = new Codex(20);

		System.out.println(obj.a);
		System.out.println(obj1.a);
	}
}

/*
OUTPUT:
0
0

karan ethe constructor la samjnar nahi ki value kontya variable madhe catch karayach aani kontya madhe initialize karayach .
aapan nehami instance variable aani parameterized constructor aika navane lihito karan lagech samjun jav ki kontya method sathi variable initialize karayach te.
*/