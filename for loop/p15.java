class Demo{
	public static void main(String[]args){
	
	int sum=0;
	for(int a=1; a<=4; a++){
	
		System.out.print(a);
		if(a<4){
		System.out.print("_");
			}
		sum = sum+a;
		}
		System.out.print(" = "+sum);
	}	

}

/*
OUTPUT:1_2_3_4 = 10
*/