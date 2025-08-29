abstract class parent{
	abstract void education();

	void property(){
		System.out.println("50 acre");
	}
}
class child extends parent{
	void education(){
		System.out.println("BCA....");
	}
}
class Demo{
	public static void main(String[]args){
	child c = new child();
	c.education();
	c.property();
	}
}
/*
OUTPUT:
BCA....
50 acre

1] Abstract class mhanje asa class jya madhe abstract method pn astat aani concreate method mhanje normal method pn astat.
2] Abstract method mhanje jya method chi body incomplete aste ti.
3] abstract class cha object banavata yet nahi.
4] Abstract class kahi method vr restriction pn lavat aani kahi method free pn sodat mhanje kahi specific method tula access karavya lagtilach aani kahi method jr tula access karayacha asel tr tu kr nahitr nako karus.
5] Abstract class madhe overriding aani overloading donhi pn chalat.

*/
