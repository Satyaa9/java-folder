class Demo{
	public static void main(String [] args){
		int [] arr = {3,8,9,1,2,7};

		int firstMax = arr[0];
		int secondMax = arr[0];
		int firstMin = arr[0];
		int secondMin = arr[0];
		int thirdMin = arr[0];

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > firstMax){
				firstMax = arr[i];
			}
		}
		
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] > secondMax && arr[i] != firstMax){
				secondMax = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < firstMin){
				firstMin = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < secondMin && arr[i] != firstMin){
				secondMin = arr[i];
			}
		}

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] < thirdMin && arr[i] != firstMin && arr[i] != secondMin){

			}
		}

		System.out.println("First maximun in the array :"+firstMax);
		System.out.println("Second maximun in the array :"+secondMax);
		System.out.println("First minimun in the array :"+firstMin);
		System.out.println("Second minimun in the array :"+secondMin);
		System.out.println("Third minimum in the array :"+thirdMin);		
	}
}


/*

OUTPUT :

First maximun in the array :9
Second maximun in the array :8
First minimun in the array :1
Second minimun in the array :2
Third minimum in the array :3

Problem solved of the p64 and all bugs are removed successfully.

*/