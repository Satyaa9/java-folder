import java.util.*;

class AgeNotValid extends Exception {
    AgeNotValid(String msg) {
        super(msg);
    }
}

class Demo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter a valid age : ");
            int age = sc.nextInt();

            if (age < 18) {
                throw new AgeNotValid("Not eligible for voting!");
            } else {
                System.out.println("You are eligible for voting!");
            }
        } 
        catch (AgeNotValid e) {
            System.out.println("Exception: " + e.getMessage());
        }
    }
}
