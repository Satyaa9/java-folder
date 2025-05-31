class Demo{
	public static void main(String[]args){
		
		if(false){
			System.out.println("in if 1");
		}else{
			System.out.println("in else 1");
		}System.out.println("in main");
		
		if(true){
			System.out.println("in if 2");
		}
		if(true){
			System.out.println("in if 3");
		}
	}
}

/*OUTPUT:
in else 1
in main
in if 2
in if 3

else la if lagat pn if la else dyav he mendatary nahiye
*/