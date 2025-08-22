class parent extends Object{
	void parentpro(){
		System.out.println("parent prope");
	}
}
class Demo{
	public static void main(String[]args){
		parent p = new parent();
		p.parentpro();
		String a = p.toString();
		System.out.println(a);        
	}
}
/*
OUTPUT:
parent prope
parent@2f92e0f4

He chalat karan pratyek child class cha parent class by default Object ch asto jr dusra
dila nasel tr.

Single inheritance madhe aik parent aani aik child asto aapan child nahi lihila tari chalto karan pratyek class cha parent by default object astoch
*/