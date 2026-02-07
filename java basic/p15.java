import java.util.*;
class Demo{
	public static void main(String [] args){
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter marks of student :");
		int marks = sc.nextInt();

		if(marks >= 90){
			System.out.print("Grade of studet : A");
		}
		else if(marks >= 75){
			System.out.print("Grade of studet :B");
		}
		else if(marks >=50){
			System.out.print("Grade of studet :C");
		}
	}
}