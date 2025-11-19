class Demo{
	public static void main(String[]args){

		int [] arr = {1,2,3,5,1,5,20,2,12,10};

		System.out.print("Unique values in array :");
		for(int i = 0 ; i < arr.length ; i++){
			int count = 0;

			for(int j = 0 ; j < arr.length ; j++){
				if(arr[i] == arr[j]){
					count++;
				}
			}
			if(count == 1){
				System.out.print(arr[i]+ " ");
			}
		}
	}
}

/*
OUTPUT:
Unique values in array :3 20 12 10
*/