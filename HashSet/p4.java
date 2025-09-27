import java.util.*;
class Demo{
	public static void main(String[]args){
		String s="shubham";
		String s1="shubham";
		System.out.println(s.equals(s1));
		System.out.println(s==s1);
	}
}
/*
OUTPUT:
true
true

.equals hya method ne address check kela jato jr same asel tr tyacha aatla data check karnar aani jr data same asel tr true nahitr false return karnar.

== hi method direct address compare karnar same address nasel tr false reurn karnar.
*/