class Demo{
	public static void main(String[]args){
	
		int sum = 0;
	
		for(int i = 0; i <=4; i++){
			System.out.print(i);

		if(i < 4){	
			System.out.print(" + ");
			}
		sum = sum+i;

		}
		
		System.out.print(" = "+sum);
	}	
}

/*
OUTPUT:
0 + 1 + 2 + 3 + 4 = 10
*/