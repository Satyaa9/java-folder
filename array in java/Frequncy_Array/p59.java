class Demo{
	public static void main(String [] args){
	
	int [] arr = {1, 2, 2, 3, 3, 3, 4, 4, 4, 4};

	int max = arr[0];
	int min = arr[0];

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max){
				max = arr[i];
			}
			if(arr[i] < min){
				min = arr[i];
			}
		}
		
		int [] freq = new int [max+1];

		for(int i = 0 ; i < arr.length ; i++){
			freq[arr[i]]++;
		}

		System.out.print("Maximum number in the array "+max+": Frequency Of maximun array "+ freq[max]);
		System.out.println();
		System.out.print("Minimun number in the array "+min+": Frequncy of minimum number "+ freq[min]);
	}
}

/*
OUTPUT:

Maximum number in the array 4: Frequency Of maximun array 4
Minimun number in the array 1: Frequncy of minimum number 1

*/