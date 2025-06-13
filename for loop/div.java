class Demo{
	public static void main(String[]args){

	int count=0;

	for(int i=1; i<=100; i++){
		if(i%3==0 && i%5==0){
		System.out.println(i);
		count++;
			}
		}
		System.out.print("total ="+count);
	}
}

/*
OUTPUT:
15
30
45
60
75
90
total =6
*/