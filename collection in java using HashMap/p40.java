import java.util.*;

class Book {
    String title;
    String author;
    boolean isIssued;

    Book(String title, String author) {
        this.title = title;
        this.author = author;
        this.isIssued = false;
    }

    @Override
    public String toString() {
        return title + " by " + author + (isIssued ? " [Issued]" : " [Available]");
    }
}

class LibrarySystem {
    static List<Book> books = new ArrayList<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        while (true) {
            System.out.println("\n📚 Library Menu:");
            System.out.println("1. Add Book");
            System.out.println("2. View All Books");
            System.out.println("3. Issue Book");
            System.out.println("4. Return Book");
            System.out.println("5. Exit");
            System.out.print("Choose an option: ");

            int choice;
            try {
                choice = sc.nextInt();
            } catch (InputMismatchException e) {
                System.out.println("❌ Please enter a valid number.");
                sc.nextLine(); // clear invalid input
                continue;
            }
            sc.nextLine(); // consume newline

            switch (choice) {
                case 1 -> addBook();
                case 2 -> viewBooks();
                case 3 -> issueBook();
                case 4 -> returnBook();
                case 5 -> {
                    System.out.println("✅ Exiting...");
                    return;
                }
                default -> System.out.println("❌ Invalid choice.");
            }
        }
    }

    static void addBook() {
        System.out.print("Enter book title: ");
        String title = sc.nextLine();
        System.out.print("Enter author name: ");
        String author = sc.nextLine();
        books.add(new Book(title, author));
        System.out.println("✅ Book added.");
    }

    static void viewBooks() {
        if (books.isEmpty()) {
            System.out.println("No books in library.");
            return;
        }
        System.out.println("\n📖 Book List:");
        for (Book b : books) {
            System.out.println(b);
        }
    }

    static void issueBook() {
        System.out.print("Enter book title to issue: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && !b.isIssued) {
                b.isIssued = true;
                System.out.println("✅ Book issued.");
                return;
            }
        }
        System.out.println("❌ Book not available or already issued.");
    }

    static void returnBook() {
        System.out.print("Enter book title to return: ");
        String title = sc.nextLine();
        for (Book b : books) {
            if (b.title.equalsIgnoreCase(title) && b.isIssued) {
                b.isIssued = false;
                System.out.println("✅ Book returned.");
                return;
            }
        }
        System.out.println("❌ Book not found or not issued.");
    }
}
