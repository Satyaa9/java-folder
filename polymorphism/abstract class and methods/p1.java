class parent{
	void education(){
		System.out.println("engineering");
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
	}
}
/*
OUTPUT:BCA....

Asa code lihilya vr kahi error nahi yet pn parent ne lihilelya method cha kahihi use hoinay ti vaya jatey 
karan polimorphism madhe ti khali ghetlya vr change kartoy mg varati body lihun kahi upyog hot nahiye.
*/