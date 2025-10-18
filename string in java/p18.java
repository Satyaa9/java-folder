class Demo{
	public static void main(String[]args){
	StringBuffer s = new StringBuffer("shubham");

	System.out.println(s);
	System.out.println(System.identityHashCode(s));

	s = s.append(" rohan");
	System.out.println(s);
	System.out.println(System.identityHashCode(s));
	}
}

/*
OUTPUT:
shubham
925858445
shubham rohan
925858445

Only stringbuffer in java ae mutable ,
all other things are mutable.
*/