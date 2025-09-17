import java.util.*;

class leader{

	String name;
	String party;

	leader(String name, String party){
		this.name=name;
		this.party=party;
	}

	public String toString(){
		return "name is :"+ name+": party is :"+party;
	}
}
class Demo{
	public static void main(String[]args){
		leader obj = new leader("shubham","bjp");
		leader obj1 = new leader("sanket","mns");

		ArrayList al = new ArrayList();
		al.add(obj);
		al.add(obj1);

		System.out.println(al);
	}
}

/*
OUTPUT:
[name is :shubham: party is :bjp, name is :sanket: party is :mns]
*/