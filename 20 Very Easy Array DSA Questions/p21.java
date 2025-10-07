import java.util.*;
class Demo{
	public static void main(String[]args){
		String s1="satish";
		String s2="snehal";

		HashMap <Character,Integer> hm = new HashMap<>();

		for(char ch : s1.toCharArray()){
			hm.put(ch, hm.getOrDefault(ch,0)+1);
			}

		for(char ch : s2.toCharArray()){
			hm.put(ch , hm.getOrDefault(ch,0)+1);
			}


		for(char ch : hm.keySet()){
			System.out.println(ch + ":"+hm.get(ch));
			}
		
	}
}

/*
OUTPUT:
a:2
s:3
t:1
e:1
h:2
i:1
l:1
n:1


how to find freq of 2 Strings using hashmap.
*/