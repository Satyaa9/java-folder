class Demo{
	public static void main(String[]args){
	
		String name = "Shubham";
		String surName = "Mane";
		
		System.out.println(System.identityHashCode(name));
		System.out.println(System.identityHashCode(surName));
		System.out.println(name);
		System.out.println(surName);
		
	}
}
/*
OUTPUT:
925858445
798154996
Shubham
Mane

*/