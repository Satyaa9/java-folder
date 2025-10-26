class Example {
    static int number;

    static {
        System.out.println("Static block executed");
        number = 50;
    }

    public static void main(String[] args) {
        System.out.println("Main method executed");
        System.out.println("Number = " + number);
    }
}

/*
OUTPUT:

Static block executed
Main method executed
Number = 50
*/
