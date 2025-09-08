class Demo{
	public static void main(String[]args){
		try{
			throw ArithmeticException("/ by zero");
		}
	}
}

/*
OUTPUT:
error: 'try' without 'catch', 'finally' or resource declarations

Try without catch chalat nahi.
*/