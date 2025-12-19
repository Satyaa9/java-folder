class Demo{
	public static void main(String [] args){

	int [] arr = {10,20,30,40};
	int target = 30;
		
		String s = "found";
		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] == target){
				s = "Found";
				break;
			}else{
				s = "Not Found";
			}
		}
		System.out.print(s);
	}
}

/*
OUTPUT:

Found
*/