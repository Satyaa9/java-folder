class Demo{
	public static void main(String[]rgs){
	
		System.out.println("Hello World");
		System.out.println(10/0);
		System.out.println("Hello Java");
	}
}

/*
OUTPUT:
Hello World
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.main(p2.java:5)

Pahil je correct statement aahe te print honar pn jithe error tithun khalach sagla code corrupt honar karan ha run-time la error aalay compile time la nahi
*/