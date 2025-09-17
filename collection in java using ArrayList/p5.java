import java.util.*;

class politics{
	String name;
	String party;

	politics(String name,String party){
		this.name=name;
		this.party=party;
	}

	void display(){
		System.out.println("This is your name :"+name);
		System.out.println("This is your party :"+party);
	}
}

class Demo{
	public static void main(String[]args){
		ArrayList al = new ArrayList();
	
		al.add(new Leader("shubham","bjp"));
		al.add(new Leader("sanket","mns"));

		System.out.println(al);
	}
}

/*
OUTPUT:
[Leader@2f92e0f4, Leader@28a418fc]

Adress print honar karan aapan object print kela aani tithe by default toString() navachi methis aste ti address print karayach kam krt aste object la jr print kela tr.
*/