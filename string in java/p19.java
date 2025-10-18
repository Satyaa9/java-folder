class Demo{
	public static void main(String[]args){
	StringBuffer s = new StringBuffer("shubham");
	System.out.println(s);
	System.out.println(System.identityHashCode(s));

	s = s.insert(0,"rohan ");
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	}
}

/*
OUTPUT:
shubham
925858445
rohan shubham
925858445

stringbuffer madhe .insert method ne aapan kontya hi index la value add karu shakto.
*/