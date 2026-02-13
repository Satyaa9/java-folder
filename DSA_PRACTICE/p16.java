class Demo{
	public static void main(String[]args){

		for(int i = 1 ; i <= 5 ; i++){
			 int fact = 1;
			
			for(int j = 1 ; j <= i ; j++){
				fact *= j;
			}
			System.out.println(i+"! = "+fact);
		}
	
	}
}

/*

OUTPUT :

1! = 1
2! = 2
3! = 6
4! = 24
5! = 120

*/