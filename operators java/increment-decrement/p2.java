class Demo{
	public static void main(String[]args){
		int a=7;
		int b=5;
		int c= ++a - b--;
		System.out.println(a);
		System.out.println(b);
		System.out.println(c);
	}
}

/*
8
4
3
*/