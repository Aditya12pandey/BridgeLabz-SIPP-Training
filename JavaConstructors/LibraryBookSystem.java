public class LibraryBookSystem {
    // Instance variables
    private String title;
    private String author;
    private double price;
    private boolean isAvailable;

    // Constructor to initialize the book
    public LibraryBookSystem(String title, String author, double price, boolean isAvailable) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.isAvailable = isAvailable;
    }

    // Method to display book details
    public void displayBookDetails() {
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: ₹" + price);
        System.out.println("Available: " + (isAvailable ? "Yes" : "No"));
    }

    // Method to borrow the book
    public void borrowBook() {
        if (isAvailable) {
            isAvailable = false;
            System.out.println("You have successfully borrowed: " + title);
        } else {
            System.out.println("Sorry, the book \"" + title + "\" is currently not available.");
        }
    }

    // Main method to test
    public static void main(String[] args) {
        LibraryBookSystem b1 = new LibraryBookSystem("The Alchemist", "Paulo Coelho", 399.0, true);
        LibraryBookSystem b2 = new LibraryBookSystem("Rich Dad Poor Dad", "Robert Kiyosaki", 299.0, true);

        // Display books
        b1.displayBookDetails();
        System.out.println();
        b2.displayBookDetails();
        System.out.println();

        // Borrow books
        b1.borrowBook(); // Successful
        b1.borrowBook(); // Unavailable
        System.out.println();

        // Check status again
        b1.displayBookDetails();
    }
}
