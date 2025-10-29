class Demo{
	public static void main(String [] args){
		int [] arr = {1,2,3,4,5,6,7};

		int odd_sum = 0;
		int even_sum =0;

		for(int i=0; i < arr.length ; i++){
			if(arr[i] % 2 ==0){
				even_sum += arr[i];
			}
			if(arr[i] % 2 != 0){
				odd_sum +=arr[i];
			}
		}
		System.out.println("Even numbers sum :"+even_sum);
		System.out.println("Odd numbers sum :"+odd_sum);
	}
}

/*
OUTPUT:
Even numbers sum :12
Odd numbers sum :16
*/