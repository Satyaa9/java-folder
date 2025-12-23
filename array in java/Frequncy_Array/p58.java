class Demo{
	public static void main(String [] args){

	int [] arr = {1, 2, 2, 3, 3, 3, 3, 3, 4, 4, 4, 4};

	int max = arr[0];

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > max){
			max = arr[i];
			}
		}

		int [] freq = new int [max+1];

		for(int i = 0 ; i < arr.length ; i++){
			freq[arr[i]]++;
		}

		int s_max= freq[0];
		int element = 0;
		for(int i = 0 ; i < freq.length ; i++){
			System.out.println(i + "-" + freq[i]);
			if(freq[i] > s_max){
				s_max = freq[i];
				element = i;
			}
		}
		System.out.println();
		System.out.print("Maximum number is "+element + ": Total occurance "+s_max);
	}
}

/*
OUTPUT:

0-0
1-1
2-2
3-5
4-4

Maximum number is 3: Total occurance 5

*/