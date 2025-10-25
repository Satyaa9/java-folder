class Codex{
	int a;

	Codex(int a){
		this.a = a;
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
10
20

this ha java madhla aik keyword aahe jo instance variable initialize karayala madat krt.
this keyword constructor madhe use hot tyanch confusion avoid karnya sathi.
*/