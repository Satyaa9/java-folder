class Demo{
	public static void main(String[]args){
		
	int a = 1;

	for(int i = 1 ; i <= 4 ; i++){
		for(int j = 1 ; j<= i ; j++){
			System.out.print(a*a*a +" ");
			a++;
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

1
8 27
64 125 216
343 512 729 1000

*/