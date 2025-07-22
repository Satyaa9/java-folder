class Demo{
	public static void main(String[]args){
	
	int [] a = {2, 5 ,8, 9, 6};
	int even=0;
	int odd=0;

	for(int i=0; i<a.length; i++){
		if(a[i]%2==0){
			even++;
		

			}else{
			odd++;
		
			}

		}
		
		System.out.println("Even: " + even + ", Odd: " + odd);


	}
}
/*
OUTPUT:Even: 3, Odd: 2
*/