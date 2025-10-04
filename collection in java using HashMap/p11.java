import java.util.*;
class Demo{
	public static void main(String[]args){
		HashMap<Integer , String> hm = new HashMap();

		hm.put(18,"virat");
		hm.put(45,"rohit");
		hm.put(7,"dhoni");

		for(Map.Entry<Integer,String>entry : hm.entrySet()){
			System.out.println("key :"+entry.getKey()+": values :"+entry.getValue());
		}
	}
}

/*
OUTPUT:
key :18: values :virat
key :7: values :dhoni
key :45: values :rohit

Key aani Value aik sobat baher call karayala.
*/