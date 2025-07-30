class Codex{
	Codex(){
		System.out.println("in constructor");
	}
}
class Demo{
	public static void main(String[]args){
		Codex ref = new Codex(10);
	}
}
/*
OUTPUT: ERROR karan aapan khalun value tr pathvat aahe pn varati catch nahi krt aahot
*/