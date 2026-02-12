import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);

		System.out.print("Min = ");
		int min = sc.nextInt();

		System.out.print("Max = ");
		int max = sc.nextInt();

		for(int i = min ; i <= max ; i++){
			if(i %2 == 0){
				System.out.print(i+" ");
			}
		}
	}
}

/*

OUTPUT :

Min = 4
Max = 60
4 6 8 10 12 14 16 18 20 22 24 26 28 30 32 34 36 38 40 42 44 46 48 50 52 54 56 58 60

*/