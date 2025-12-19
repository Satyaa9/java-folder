class Demo{
	public static void main(String [] args){

	int [] arr = {1,2,3,4,5};

	int even = 0 ; 
	int odd = 0 ;

		for(int i = 0 ; i< arr.length ; i++){
			if(arr[i] % 2 == 0){
				odd ++;
			}
			else{
				even++;
			}
		}

		System.out.print("Even Number in array :"+even);
		System.out.println();
		System.out.print("Odd Number in array :"+odd);
	}
}

/*
OUTPUT:

Even Number in array :3
Odd Number in array :2

*/