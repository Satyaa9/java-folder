class Demo{
	public static void main(String[]args){
	
		for(int i = 1; i <= 9; i++){
			if(i % 2 != 0){
				System.out.print(i);
			}
			if(i % 2 != 0 && i < 9){
				System.out.print("_");
			}
		}
	}
}

/*
OUTPUT:
1_3_5_7_9
*/