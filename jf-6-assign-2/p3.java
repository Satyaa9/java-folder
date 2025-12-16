class Demo{
	public static void main(String [] args){

		int square = 0;
		int cube = 0;
		int num =1 ;

		for(int i = num ; i<=10 ; i++){
			if(i % 2 != 0){
				square = i*i;
				cube = i*i*i;
				num++;
				//square++;
				System.out.println("Square of "+i +":"+square+" "+"and "+"cube of "+i+":"+cube);
		
			}
		}
		
	}
}

/*
OUTPUT:
Square of 1:1 and cube of 1:1
Square of 3:9 and cube of 3:27
Square of 5:25 and cube of 5:125
Square of 7:49 and cube of 7:343
Square of 9:81 and cube of 9:729
*/