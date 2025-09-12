class Demo{
	public static void main(String[]args){
		throw new ArithmeticException();
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ArithmeticException
        at Demo.main(p6.java:3)

Jevha aapan ass ArithmeticException lihato tevha compiler la kalat ki kontya line la exception yenar aahe pn to mhanto ki he exception jr pudhe jaun jvm ne handle kel tr mhanun to compile time la exception nahi det to jvm kade dhakalto.
*/