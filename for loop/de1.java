class Demo{
	public static void main(String[]args){

	int n=12345;
	for(int i=n; n>0; ){
		int rem=n%10;
		System.out.print(rem);
		n=n/10;
		i++;
		}
	}
}

/*
54321
*/