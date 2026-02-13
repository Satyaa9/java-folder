class Demo{
	public static void main(String [] args){

		for(int i = 1 ; i <= 10 ; i++){
			if(i % 2 != 0){
				System.out.print("Square of "+i+":"+i*i + " " + "and cube of "+i+":"+i*i*i);
				
			}
			System.out.println();
		}
	}
}

/*

OUTPUT :

Square of 1:1 and cube of 1:1

Square of 3:9 and cube of 3:27

Square of 5:25 and cube of 5:125

Square of 7:49 and cube of 7:343

Square of 9:81 and cube of 9:729

*/