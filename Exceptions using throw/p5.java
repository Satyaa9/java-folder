class Demo{
		
	static void gun(){
		throw new ArithmeticException("/ by zero");
	}

	static void fun(){
		gun();
	}
	
	public static void main(String[]args){
		fun();
	}
}

/*
OUTPUT:
Exception in thread "main" java.lang.ArithmeticException: / by zero
        at Demo.gun(p5.java:4)
        at Demo.fun(p5.java:8)
        at Demo.main(p5.java:12)

Karan 1st exception he aal te throw mule 
2nd exception aal te aapan throw jya method chya aat madhe lihilay tya method la call kel.
3rd exception aapan jya method madhe throw la call kelay tila main method madhe call kel.


aaplyala je kahi exception yetat tya exception class che object banaun aaplayala exception sangnya sathi throw use kartat.

aapan nahi lihal tari te by default astach.
*/