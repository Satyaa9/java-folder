class Demo{
	public static void main(String[]args){

	int n=12345;
	int count=0;
	for(int i=n; n>0; ){
		int rem=n%10;
			count++;
		

			if(count>2){
			System.out.println("not prime");
			}
			else{
			System.out.println("odd number"+rem);
			}
		n=n/10;
		i++;
		}
	}
}