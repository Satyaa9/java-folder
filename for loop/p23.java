class Demo{
	public static void main(String[]args){
		
		for(int i = 1; i <=4 ; i++){
			if(i % 2 == 0){
				System.out.print(i*i);
			}
			if(i % 2 != 0){
				System.out.print(i*i*i);
			}
			if(i < 4){
				System.out.print("_");
			}
		}
	}
}

/*
OUTPUT:
1_4_27_16

Jevha number odd asel tevha tyacha square .
Jevha number even asel tevha tyacha cube.
*/