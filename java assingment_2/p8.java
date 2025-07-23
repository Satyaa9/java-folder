class Demo{
	public static void main(String[]args){

	int a=28;
	int sum=0;
		for(int i=1; i<a; i++){
			if(a%i==0){
				sum+=i;
			}
		
		}
			if(sum==a){
				System.out.println(a+" :is a perfect number");
			}else{
				System.out.println(a+" :is not a perfect");
			}

	}
}