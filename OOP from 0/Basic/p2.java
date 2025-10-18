class Hospital{
	int a=10;

	void opd(){
		System.out.println("in H opd :"+ a);
	}

	void icu(){
		System.out.println("in H icu");
	}
}

class classRoom{
	void bench(){
		System.out.println("in class bench");
	}
}

class Demo{
	public static void main(String[]args){
		Hospital h = new Hospital();
		h.opd();

		classRoom c = new classRoom();
		c.bench();
	}
}

/*
OUTPUT:
in H opd :10
in class bench

C madhe veglya veglya veglya method madhe vegla vegla content liahava lagat hota java cha oop mule aapan aik class gheun tyacha aat tya main topic cya sub methods gheu shakato, aani tya aapan main method madhun pahije tas access karu shakato.
*/