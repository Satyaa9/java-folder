class Demo{
	public static void main(String[]args){
		int []arr={10,20,30,40,50,60,70,80};

		int n= arr.length;

		System.out.println(n);

		System.out.println("----------------------");

		for(int i=0;i<n;i++){
			System.out.print(arr[i]+" ");
		}
	}
}

/*
OUTPUT:
8
----------------------
10 20 30 40 50 60 70 80
*/