// Finding Largest And Second Largest Number In The Array

class Demo{
	public static void main(String [] args){
		int [] arr = {3,5,2,7,9,2,8};

		int largest = Integer.MIN_VALUE;
		int s_largest = Integer.MIN_VALUE;
		
		for(int i = 0 ; i < arr.length ; i ++){
			if(arr[i] > largest){
				largest = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > s_largest && arr[i] != largest){
				s_largest = arr[i];
			}
		}

		System.out.print("First Largest Number :"+largest);
		System.out.println();
		System.out.print("Second Largest Number :"+s_largest);
	}
}

// Smallest value of the integer is => -2147483648

/*
OUTPUT => First Largest Number :9
       => Second Largest Number :8
*/