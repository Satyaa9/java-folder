class Demo{
	public static void main(String[]args){
		
			char ch = 'A';
		for(int i=1; i <=3; i++){
			for(int j = 1; j <=3 ; j++){
				
				System.out.print(ch);
				if(j < 3){
					System.out.print("_");
				}
				
			}
			ch++;
			System.out.println();
		}
	}
}

/*
OUTPUT:
A_A_A
B_B_B
C_C_C
*/