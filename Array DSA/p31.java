class Demo{
	public static void main(String [] args){
		int [] arr = {1, -2, 0, 4, -5, 0};

		int pos_count = 0;
		int neg_count = 0;
		int zero_count = 0;

		for(int i = 0 ; i < arr.length; i++){
			if(arr[i]<0){
				neg_count++;
			}
			if(arr[i]>0){
				pos_count++;
			}
			if(arr[i]==0){
				zero_count++;
			}
		}
		
		System.out.println("Total Positive Element :"+pos_count);
		System.out.println("Total Negative Element :"+neg_count);
		System.out.println("Total zero Element :"+zero_count);
	}
}

/*
OUTPUT:
Total Positive Element :2
Total Negative Element :2
Total zero Element :2
*/