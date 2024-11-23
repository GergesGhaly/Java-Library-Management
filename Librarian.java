class Librarian extends User {
    public Librarian(int id, String name, int contactInfo, UserType role) {
        super(id, name, contactInfo, role);
    }

    public void addBook(Book book, Library library) {
        library.addBook(book);
        System.out.println("Book added successfully by " + getName());
    }

    public void removeBook(Book book, Library library) {
        library.removeBook(book);
        System.out.println("Book removed successfully by " + getName());
    }
}
