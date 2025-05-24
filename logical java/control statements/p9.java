class Demo{
	public static void main(String[]args){
		System.out.println("before if/else");
	
	if(false){
		System.out.println(" in if 1");
		}
	else{
		System.out.println("in else 1");
		}
	if(true){
		System.out.println("in if 2");
		}
	if(true){
		System.out.println("in if 2");
		}
		System.out.println("after if/else");
	}
}

/*
before if/else
in else 1
in if 2
in if 2
after if/else

*/