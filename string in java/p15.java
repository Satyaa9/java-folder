class Demo {
    public static void main(String[] args) {

        String input = "hello world";
	String output = "";


        for(int i=0; i<input.length; i++){
		if(i == 0 || input.charAt(i - 1) == ' '){
	
		output += Character.toUpperCase(input.charAt(i));
		}else{
			 output += input.charAt(i);
		}
		
	}
	  System.out.println(output);

    }
}
