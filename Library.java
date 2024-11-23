import java.util.ArrayList;

class Library {

    // List to store all books in the library
    ArrayList<Book> allBooks = new ArrayList<>();
    ArrayList<Book> borrowRecords = new ArrayList<>();

    // Default constructor for the Library class
    public Library() {
    }

    // Method to add a book to the library
    public void addBook(Book book) {
        allBooks.add(book);
        System.out.println("Book added successfully");
    }

    public void removeBook(Book book) {
        allBooks.remove(book);
        System.out.println("Book removed successfully");
    }
    // Method to display all books in the library
    public void displayAllBooks() {
        for (Book book : allBooks) {
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("Copies Available: " + book.getCopiesAvailable());
            System.out.println("-----------------------------");
        }
    }

    // Method to search for a book by title
    public Book searchBookByTitle(String title) {
        if (title == null || title.isEmpty()) {
            System.out.println("Enter title please");
        }

        for (Book book : allBooks) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                book.getAllInfo();
                // Return the book if found
                return book;
            }
        }

        // If the book is not found
        System.out.println("Book not found.");
        return null;
    }

    // Method to add a book to borrowRecords
    public void addToBorrowRecords(Book book) {
        borrowRecords.add(book);
        System.out.println("Book added to borrow records: " + book.getTitle());
    }

    public void removeFromBorrowRecords(Book book) {
        borrowRecords.remove(book);
        System.out.println("Book removed from borrow records: ");
    }

    public void displayBorrowRecords() {
        if (borrowRecords.isEmpty()) {
            System.out.println("No books have been borrowed.");
            return;
        }
    
        System.out.println("Borrowed Books:");
        for (Book book : borrowRecords) {
            System.out.println("-----------------------------");
            System.out.println("Title: " + book.getTitle());
            System.out.println("Author: " + book.getAuthor());
            System.out.println("Year: " + book.getYear());
            System.out.println("Copies Available: " + book.getCopiesAvailable());
        }
    }
}