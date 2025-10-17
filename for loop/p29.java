class Demo{
	public static void main(String[]args){
	
		char ch = 'A';

		for(int i =1; i<=3; i++){
			for(int j =1; j<=3; j++){
				ch+=2;
				System.out.print(ch);

			if(j < 3){
				System.out.print("_");
				}
			}
			System.out.println();
			ch='A';
		}
	}
}

/*
OUTPUT:
C_E_G
C_E_G
C_E_G
*/