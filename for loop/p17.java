class Demo{
	public static void main(String[]args){
	
		for(int i = 1; i <= 4; i++){
			if(i % 2 == 0){
				System.out.print(1 );
			}
			else{
				System.out.print(0 );
			}
			if(i<=3){
				System.out.print("_");
			}
		}
	}
}

/*
OUTPUT:
0_1_0_1
*/