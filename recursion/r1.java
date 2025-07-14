class Demo{
	public static void main(String[]args){
		
		int a=1;
		fun(a);
		System.out.println("in main");

	}

	static void fun(int a){
		System.out.println("in fun");
		if(a==5){
			return;
		}
		a++;
		fun(a);
	}
}