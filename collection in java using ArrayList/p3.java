import java.util.*;
class politics{
	String name;
	String party;

	politics(String name, String party){
		this.name=name;
		this.party=party;
		}
	void display(){
		System.out.println("Enter your name :"+name);
		System.out.println("Enter your name :"+party);
		
	}
}

class Demo{
	public static void main(String[]args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter leader name :");
		String name =sc.nextLine();

		System.out.print("Enter your party name :");
		String party = sc.nextLine();

		System.out.println("--------------------------------");

		politics obj = new politics(name,party);

		obj.display();


	}
}

/*
OUTPUT:
Enter leader name :satish
Enter your party name :bjp
--------------------------------
Enter your name :satish
Enter your name :bjp
*/