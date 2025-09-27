import java.util.*;
class Demo{
	public static void main(String[]args){
		String s=new String("shubham");
		String s1=new String("shubham");

		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}

/*
OUTPUT:
true
false

Content same aahe pn tyacha address different aahe.
*/