class Codex{
	Codex(){
		System.out.println("in constructor");
	}
}
class Demo{
	public static void main(String [] args){
		Codex obj = new Codex(10);
	}
}

/*
OUTPUT:
error: constructor Codex in class Codex cannot be applied to given types;
                Codex obj = new Codex(10);
                            ^
  required: no arguments

jr aapan khalun aikhada argument send krt asel tr aaplyala varati tyala aikhadya variable madhe catch karav lagat.
*/