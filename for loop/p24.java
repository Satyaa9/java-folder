class Demo {
	public static void main(String[]args){
		
		int sum = 0;
		int mul = 1;
		System.out.print("sum :");
		for(int i =1 ; i <=4; i++){
			if(i %2 == 0){
				System.out.print(i);
				sum = sum+i;
			if(i < 4 && i > 1){
				System.out.print("_");
				}
			}
		}
			System.out.print(" = "+sum);

			System.out.println();

			System.out.print("MUltiplication :");
		for(int i =1 ; i<= 4 ; i++){
			if(i % 2 != 0){
				System.out.print(i);
				mul = mul*i;
			if(i < 3 ){
				System.out.print("_");
				}
			}
		}
		
		System.out.print(" = "+mul);
	}
}

/*
OUTPUT:
sum :2_4 = 6
MUltiplication :1_3 = 3
*/