interface  Borrowable {
    void borrowBook(Book book, Library library) throws Exception;
    void returnBook(Book book,Library library) throws Exception;
 }