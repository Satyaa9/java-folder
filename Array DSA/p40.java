class Demo{
	public static void main(String[]args){
		int [] arr = {0,3,4,0,1,0,6,7,0};

		int [] result = new int[arr.length];

		int index = 0;

		for(int i = 0 ; i < arr.length ; i++){
			if(arr[i] != 0){
				result[index] = arr[i];
				index++;
			}
		}
		System.out.print("{");
		for(int i = 0 ; i < arr.length; i++){
			System.out.print(result[i]+",");
		}
		System.out.print("}");
	}
}

/*
OUTPUT:
{3,4,1,6,7,0,0,0,0,}
*/