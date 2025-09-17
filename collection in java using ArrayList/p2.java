import java.util.*;
class parent{
	String name;
	String party;

	parent(String name,String party){
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
		int arr[] = new int[3];

		Scanner sc = new Scanner(System.in);

		for(int i=0; i<arr.length;i++){
			arr[i] = sc.nextInt();
		}

		System.out.println("---------------------------");

		for(int i=0; i<arr.length;i++){
			System.out.println(arr[i]);
		}
	}
}

/*
OUTPUT:
1
1
1
---------------------------
1
1
1
*/