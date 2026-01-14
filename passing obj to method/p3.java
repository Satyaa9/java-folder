class parent{
	static void study(){
		System.out.println("Engineering");
	}
}
class student extends parent{
	static void study(){
		System.out.println("gamer");
	}
}
class Demo{
	public static void main(String [] args){
		parent p = new student();
		p.study();
	}
}
