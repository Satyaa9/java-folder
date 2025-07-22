class Demo{
	public static void main(String[]args){

	int [] a = {1, 2, 3, 2, 5};

	for(int i=0; i<a.length; i++){
		for(int j=0; j<a.length; j++){
			if(a[i]==a[j]){
				System.out.println( "duplicate found :"+ a[j]);
				j=a.length;
				i=a.length;

				}

			}

		}

		
	}
}