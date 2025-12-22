class Demo{
	public static void main(String [] args){

		int sum = 0;
		for(int i = 0 ; i <= 5 ; i++){
			for(int j = 0 ; j <=i ; j++){

				sum = i+j;
				if(sum % 2 == 0){
					System.out.print("1");
				}else{
					System.out.print("0");
				}
			}
			System.out.println();
		}
	}
}

/*
OUTPUT:

1
01
101
0101
10101
010101

*/