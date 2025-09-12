class Demo{
	public static void main(String[]args){
		throw new Exception();
	}
}

/*
OUTPUT:
error: unreported exception Exception; must be caught or declared to be thrown
                throw new Exception();
jya veles aapan direct heirachy break karun top cha parent la ch call karto tevha compiler la samjat nahi ki kontya line la exception yenar aahe tyaamule compiler error deto.
*/