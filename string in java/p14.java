class Demo{
	public static void main(String[]args){
	
	String s = "aabbcc";
	char search = "a";
	int count = 0;

	for(int i=0; i<s.length(); i++){

		if(s.charAt(i)==search){
			count++;
		}

		}System.out.print(count);
	}
}

INCOMPLETE