import java.util.*;
class Demo{
	public static void main(String[]args){
		String s = "satish";
		String g = "dadas";

		HashMap<Character,Integer>hm = new HashMap<>();

		for(char ch : s.toCharArray()){
		
			hm.put(ch,hm.getOrDefault(ch,0)+1);
		}

		for(char ch : hm.keySet()){
			System.out.println(ch+": :"+hm.get(ch));
		}

		for(char gs : g.toCharArray()){
		
			hm.put(gs,hm.getOrDefault(gs,0)+1);
		}

		for(char gs : hm.keySet()){
			System.out.println(gs+": :"+hm.get(gs));
		}
	}
}

/*
OUTPUT:
a: :1
s: :2
t: :1
h: :1
i: :1
a: :1
r: :1
s: :2
t: :1
u: :1
g: :1
h: :1
i: :2
o: :1
*/