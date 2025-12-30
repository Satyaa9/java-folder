package String_In_Java;
import java.util.*;

public class ScannerClass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter name :");

        //sc.next() method jr madhe space asla tr tyacha pudhche words ghet nahi.
//        String s = sc.next();

        //he akhi line ch ghet space shi frk nahi pdt. sc.nextLine()
        String s = sc.nextLine();
        System.out.print(s);
    }
}
