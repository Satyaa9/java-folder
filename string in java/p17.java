class Demo{
	public static void main(String[]args){
		String s = new String("prem");
		System.out.println(s);

		String s1 = s.concat(" loyalty + paise");
		System.out.println(s1);

		System.out.println(System.identityHashCode(s));
		System.out.println(System.identityHashCode(s1));
	}
}

/*
OUTPUT:

prem
prem loyalty + paise
925858445
798154996
*/