class Demo{
	public static void main(String[]args){

	int a;
	for(a=1; a<=9; a++){
		if(a%2 !=0){
			System.out.print(a);
			}
		if(a%2 !=0 && a<9){
			System.out.print("_");
			}
		}
	}
}
/*
OUTPUT:1_3_5_7_9
*/