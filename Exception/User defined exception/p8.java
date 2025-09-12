import java.util.*;
class AgeNotValid extends Exception{
	AgeNotValid(String msg){
		super(msg);
	}
}
class Voting{
	
		 void checkAge(Scanner sc) throws AgeNotValid {
       			 System.out.print("Enter your age: ");
      			  int age = sc.nextInt();

       		 if (age < 18) {
           		 throw new AgeNotValid("Not eligible for voting. Age must be 18 or above.");
       		 } else {
           	 System.out.println("Eligible for voting.");
      	 	 }
   	 }
}

class Demo{
	 public static void main(String[] args) {
        	Scanner sc = new Scanner(System.in);
        	Voting obj = new Voting();

        	try {
          	  obj.checkAge(sc);
       		 	} catch (AgeNotValid e) {
          		  System.out.println("Exception: " + e.getMessage());
      		  }
    	}
}