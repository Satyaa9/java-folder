class Demo {
	public static void main(String[]args){

	int mul = 1;
	for(int i = 1 ; i <= 4; i++){
		System.out.print(i);

		if(i < 4){
			System.out.print(" * ");
			}
		mul = mul*i;
		}

		System.out.print(" = "+mul);
	}
}

/*
OUTPUT:
1 * 2 * 3 * 4 = 24
*/