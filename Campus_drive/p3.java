class Demo{
	public static void main(String [] args){
	
	int [] arr = {1,2,3,5,3,1,5,20,12,10};

		System.out.print("All unique values in the given array:");

		for(int i = 0 ; i < arr.length ; i++){
			int count = 0 ;
			for(int j= 0; j < arr.length ; j++){
				if(arr[i]==arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.print(arr[i]+" ");
			}
		}
	}
}

/*
OUTPUT:

All unique values in the given array:2 20 12 10

*/