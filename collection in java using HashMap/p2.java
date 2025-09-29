import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();
		hm.put(18,"virat");
		hm.put(45,"rohit");
		hm.put(18,"bumrah");

		System.out.println(hm);
	}
}

/*
OUTPUT:
{18=bumrah, 45=rohit}

Key same asli tr duplicate value hashmap madhe chalat nahi. 
yachi indexing unordered aahe.
*/