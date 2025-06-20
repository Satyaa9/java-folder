class Demo{
	public static void main(String[]args){

		for(int i=4; i>=1; i--){
		for(int j=i; j>=1; j--){
			
			if( j==1 || j==i || i==4){
				System.out.print("*");
				}
			else{
				System.out.print("_");
				}
			}System.out.println();

		}
	}
}