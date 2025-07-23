class Demo{
	public static void main(String[]args){

	int [] a= {-1, 0, 2, -3, 0, 4};
	int pos=0;
	int neg=0;
	int zero=0;
		for(int i : a){
			if(i>0){
			pos++;
			

			}
			if(i<0){
			neg++;
				

			}
			if(i==0){
				zero++;
				
			}

		}
			System.out.println("positive:"+ pos+ " negative:"+neg+ " zero:"+zero);

	}
}
/*
OUTPUT:positive:2 negative:2 zero:2
*/