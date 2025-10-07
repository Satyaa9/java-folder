import java.util.*;
class Demo{
	public static void main(String[]args){
		String s = "aabbccd";
		
		HashMap<Character, Integer> hm = new HashMap<>();

		for(char ch : s.toCharArray()){

		hm.put(ch, hm.getOrDefault(ch,0)+1);
		}

		for(char ch : hm.keySet()){
			System.out.println(ch+ ": :"+hm.get(ch));
		}
	}
}

/*
OUTPUT:
a: :2
b: :2
c: :2
d: :1
*/