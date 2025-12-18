class Demo{
	public static void main(String [] args){
		
	int n = 13 ;
	int num [] = {10,30,50,70};
	int index = 0;

		for(int i = 0 ; i < n ; i++){
			for(int j = 0 ; j < n ; j++){
				if(i==j || i+j == n-1 ){
					System.out.print(num[index]+" ");
					index = (index+1)%num.length;
				}else{
					System.out.print(" ");
				}
				
			}
			System.out.println();

			
		}
	}
}