class Demo{
	public static void main(String[]args){
		String a=new String("shubham");
		String b=new String("shubham");

		System.out.println(a.hashCode());
		System.out.println(b.hashCode());
	}
}

/*
OUTPUT:
2072214450
2072214450

karan aapan hashCode method string class chi call keli aahe pn originaly ti method object class chi aahe aani object cha saglya child class ne ti ovverride keli aahe jr aapan object cha hashCode method la call kel ast tr tyane address check kela asta pn aapan string cha hashCode la call kelyamule tyane address check kela aani to same aahe mhanun mg tyane content check kela aani content same aahe mhanun tyane true return kel.
*/