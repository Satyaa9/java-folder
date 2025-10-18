class Demo{
	public static void main(String[]args){

	StringBuffer s = new StringBuffer("satish");
	System.out.println(s);
	System.out.println(System.identityHashCode(s));

	s.append(" rohan");
	s = s.insert(0, "virat ");
	System.out.println(s);
	System.out.println(System.identityHashCode(s));

	System.out.println("------------------------------");
	String s1 = new String("shubham");
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));

	s1.concat("sanket");
	System.out.println(s1);
	System.out.println(System.identityHashCode(s1));
	}
}

/*
OUTPUT:

satish
925858445
virat satish rohan
925858445
------------------------------
shubham
798154996
shubham
798154996
*/