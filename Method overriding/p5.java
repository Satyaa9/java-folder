class India{
	void cricketMatch(){
		System.out.println("agree to play");
	}
	void terrorisum(){
		System.out.println("End it");
	}
}
class Pakistan extends India{
	void cricketMatch(){
		System.out.println("agree to play");
	}
	void terrorisum(){
		System.out.println("Dont end spread it");
	}
}
class Demo{
	public static void main(String[]args){
		Pakistan obj = new Pakistan();
		obj.cricketMatch();
		obj.terrorisum();
	}
}
/*
OUTPUT:
agree to play
Dont end spread it

Aika method shi satisfy aahet ti aahe ashi ghetli.
Dusrya method shi safisfy nahit ti aahe ashi gheun tya madhe change kele mhanje method 
override keli.
*/