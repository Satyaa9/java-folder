class Demo{
	public static void main(String[]args){
		String s = "abc";

		System.out.println(s.charAt(3));
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.StringIndexOutOfBoundsException: Index 3 out of bounds for length 3
        at java.base/jdk.internal.util.Preconditions$1.apply(Preconditions.java:55)

String index out of bound cha error aahe.
*/