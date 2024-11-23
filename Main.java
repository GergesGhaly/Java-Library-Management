class Main {
    public static void main(String[] args) throws Exception {
        // Create a new library instance
        Library library1 = new Library();

        // Create some book instances
        Book book1 = new Book("book1", "author1", 2000,1);
        Book book2 = new Book("book2", "author2", 2001,1);
        Book book3 = new Book("book3", "author3", 2002,1);
        Customer customer1 = new Customer(0,"user1",012111,UserType.CLIENT);
        // Add books to the library
        library1.addBook(book1);
        System.out.println(book2.getCopiesAvailable());
        library1.addBook(book2);
        customer1.borrowBook(book2,library1);
        System.out.println(book2.getCopiesAvailable());
        customer1.borrowBook(book1,library1);
        customer1.returnBook(book2, library1);
        System.out.println(book2.getCopiesAvailable());
        customer1.borrowBook(book2,library1);
        System.out.println(book2.getCopiesAvailable());
        customer1.returnBook(book2, library1);
        library1.displayBorrowRecords();
        // Search for a book by title
        library1.searchBookByTitle("book2");
        Librarian librarian1 = new Librarian(0,"gerges",012111,UserType.LIBRARIAN);
        librarian1.addBook(book3,library1);
    }
}