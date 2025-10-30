class Codex{
	static int a =10;

	static{
		a = 10;
	}
}
class Demo{
	public static void main(String [] args){

	}
}

/*
class Codex {
  static int a;

  Codex();
    Code:
       0: aload_0
       1: invokespecial #1                  // Method java/lang/Object."<init>":()V
       4: return

  static {};
    Code:
       0: bipush        10
       2: putstatic     #7                  // Field a:I
       5: bipush        10
       7: putstatic     #7                  // Field a:I
      10: return
}
*/