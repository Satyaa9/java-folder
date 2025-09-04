class Demo{
	public static void main(String[]args){
	int n=5;

	for(int i=1; i<=n;i++){
		for(int j=1; j<=n; j++){
			if(i==1 || i==n || j==1 || j==n){
				System.out.print("*");
				}
			else{
				System.out.print();
				}
			}
				System.out.println();
		}

	}
}

/*
OUTPUT:
error: no suitable method found for print(no arguments)
                                System.out.print();
                                          ^
    method PrintStream.print(boolean) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(int) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(long) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(float) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(double) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(char[]) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(String) is not applicable
      (actual and formal argument lists differ in length)
    method PrintStream.print(Object) is not applicable
      (actual and formal argument lists differ in length)

else madhe rikam print chi method chalat nahiye.
*/