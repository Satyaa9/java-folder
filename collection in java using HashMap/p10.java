import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<Integer, String> hm = new HashMap();

		hm.put(18,"virat");
		hm.put(45,"rohit");
		hm.put(7,"dhoni");

		System.out.println("Gives the all keys :");
		for(Integer key : hm.keySet()){
			System.out.println(key);
		}		

		System.out.println("---------------------------------------");
		System.out.println("Gives the all values :");
		for(String value : hm.values()){
			System.out.println(value);
		}
	}
}

/*
OUTPUT:

Gives the all keys :
18
7
45
---------------------------------------
Gives the all values :
virat
dhoni
rohit

Problem: Ethe aaplyala key aani value separate call karava lagtoy.
*/