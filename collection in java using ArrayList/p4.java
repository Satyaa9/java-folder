import java.util.*;
class Leader{
	String name;
	String party;

	Leader(String name, String party){
		this.name=name;
		this.party=party;
	}

	void display(){
		System.out.println("this is your name:"+name);
		System.out.println("This is your party:"+party);
	}
}

class Demo{
	public static void main(String[]args){
		Leader arr[] = new Leader[3];
		Scanner sc = new Scanner(System.in);

		for(int i=0; i<arr.length; i++){
			System.out.print("Enter your name :");
			String name=sc.nextLine();

		

			System.out.print("Enter your party :");
			String party=sc.nextLine();

								 			   			System.out.println("--------------------------------");

			arr[i] = new Leader(name,party);
		}

		System.out.println("========================================");
		
		for(int i=0; i<arr.length; i++){
			arr[i].display();
			System.out.println("---------------------------------");
		}
	}
}

/*
OUTPUT:
Enter your name :satish
Enter your party :bjp
--------------------------------
Enter your name :sanket
Enter your party :congress
--------------------------------
Enter your name :shubham
Enter your party :mns
--------------------------------
========================================
this is your name:satish
This is your party:bjp
---------------------------------
this is your name:sanket
This is your party:congress
---------------------------------
this is your name:shubham
This is your party:mns
---------------------------------

here in this code we stored a group of object into an array & retrive easily.
But there are also certain inconvinience in this mechanism.

1] We cannot store different class objcet into in the same array, the reason is that array can only store only one data type element.
1] Adding the object at the end of the array is easy, but inserting & deleting the elements in the middle of the array is diffiult.

In this case, we have to reaarange all the element of the array , due to this problem we need a better approach to store group of objects .

The alternative to store the group of object into a object. 
*/