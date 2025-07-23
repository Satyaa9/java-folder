class Demo{
	public static void main(String[]args){

	int a=7;
	int count=0;

		for(int i=1; i<=a; i++){

			if(a%i==0 && a%a==0){
				count++;
			}
		
		}
			if(count>2){
				System.out.println("is not a prime:"+a);
			}else{
				System.out.println("is a prime:"+a);
			}

	}
}