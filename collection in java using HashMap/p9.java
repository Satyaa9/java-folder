import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap hm = new HashMap();

		hm.put(18,"virat");
		hm.put(45,"rohit");
		hm.put(7,"dhoni");

		System.out.println(hm);
		System.out.println(hm.get(18));
		System.out.println(hm.keySet());
		System.out.println(hm.values());
		System.out.println(hm.containsKey(7));
		System.out.println(hm.getOrDefault(45,0));
		System.out.println(hm.entrySet());
		System.out.println(hm.remove(7));
	}
}

/*
OUTPUT:
{18=virat, 7=dhoni, 45=rohit}
virat
[18, 7, 45]
[virat, dhoni, rohit]
true
rohit
[18=virat, 7=dhoni, 45=rohit]
dhoni

---------------------------------------------------------------------------------------------

hm = gives a map.
hm.get() = value on the key.
hm.keySet() = Gives all keys.
hm.values() = Gives all values.
hm.containsKey() = Check the presence of that key.
hm.getOrDefault(45,0) = Get or default.
hm.entrySet() = Gives all data set.
hm.remove(7) = Removes key from set.
*/