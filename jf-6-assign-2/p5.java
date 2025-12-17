class Demo{
	public static void main(String [] args){
		
		int num = 24;
	
		for(int i = 2 ; i <= num ; i++){
			if(num % i == 0){
				if( i < num){
				System.out.print(i +" ");
				}
			}
		}
	}

}

/*
OUTPUT:
2 3 4 6 8 12
*/