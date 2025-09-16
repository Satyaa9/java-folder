import java.util.*;
class politics{
	String name;
	String party;

	politics(String name,String party){
		this.name=name;
		this.party=party;
	} 

	void display(){
		System.out.println("Your name is:"+name);
		System.out.println("Your party is:"+party);
	}
}
class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter name :");
		String name = sc.nextLine();

		System.out.print("Enter party :");
		String party = sc.nextLine();

		System.out.println("--------------------------------");
		politics obj = new politics(name,party);
		obj.display();
	}
}

/*
OUTPUT:
Enter name :satish
Enter party :bjp
--------------------------------
Your name is:satish
Your party is :bjp
*/