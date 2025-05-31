class Demo{
	public static void main(String[]args){
		if(true){
			System.out.println("in if");
		}
		System.out.println("after if");
		else(){
		}
	}
}

/*
OUTPUT: error: 'else' without 'if'
                else(){
		else la lagech varati if hava asto tyacha shivay work hot nahi
*/