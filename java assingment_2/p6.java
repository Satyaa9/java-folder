class Demo{
	public static void main(String[]args){

	int [] a={1, 2, 2, 3, 4, 4};
	
		for(int i=0; i<a.length; i++){
			for(int j=0; j<i; j++){
				if(a[i]==a[j]){
				
				break;
				}
				if(a[i]!=a[j]){
				System.out.println(a[i]);

			}

			}
			

		}
	}
}