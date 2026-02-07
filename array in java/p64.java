class Demo{
	public static void main(String [] args){
		int [] arr = {3,8,9,1,2,7};

		int firstMax = 0;
		int secondMax = 0;
		int firstMin = 0;
		int secondMin = 0;
		int thirdMin = 0;

		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] > arr[j]){
					firstMax = arr[i];
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] > arr[j] && arr[i] != firstMax){
					secondMax = arr[i];
				}
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] < arr[j]){
					firstMin = arr[i];
				}
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] < arr[j] && arr[i] != firstMin){
					secondMin = arr[i];
				}
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			for(int j = i + 1 ; j < arr.length ; j++){
				if(arr[i] < arr[j] && arr[i] != firstMin && arr[i] != secondMin){
					thirdMin = arr[i];
				}
			}
		}


		System.out.println("First Maximun number in the array :"+firstMax);
		System.out.println("Second Maximun in the array :"+secondMax);
		System.out.println("First Minimun in the array :"+firstMin);
		System.out.println("Second Minimun in the array :"+secondMin);
		System.out.println("Third Minimun in the array :"+thirdMin);
	}
}

/*
OUTPUT :
First Maximun number in the array :9
Second Maximun in the array :8
First Minimun in the array :2
Second Minimun in the array :1
Third Minimun in the array :8

Small bugs are present in this code.
we will solve this bugs in p65
*/