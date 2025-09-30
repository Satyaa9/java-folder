import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm =new HashMap();
		hm.put(45,"rohit");
		hm.put(18,"virat");
		hm.put(18,1000);

		int s = (int)hm.get(18);
		System.out.println(s);
	}
}

/*
OUTPUT:
1000

Type cast.
*/