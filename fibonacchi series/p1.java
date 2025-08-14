class Demo{
	public static void main(String[]args){
		int a=0;
		int b=1;

		System.out.print(a+"_");
		System.out.print(b);

		for(int i=1; i<4; i++){
			if(i<4){
				System.out.print("_");
			}
		int c =a+b;
		System.out.print(c);
		a=b;
		b=c;
		}
	}
}
/*
OUTPUT:0_1_1_2_3
*/