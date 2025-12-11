class Demo{
	public static void main(String [] args){
	
	int num = 10;
	double avg = 0;
	int sum = 0;

	for(int i = 1; i<=num; i++){
		sum+=i;
		avg = sum/10.0;
		}

		System.out.println(sum);
		System.out.println(avg);
	}
}