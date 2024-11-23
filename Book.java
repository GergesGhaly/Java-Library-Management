class Book {

    // Attributes of the Book class
    private String title;
    private String author;
    private int year;
    private int copiesAvailable;
    // Default constructor for the Book class
    public Book() {
    }

    // Constructor with parameters to initialize a book
    public Book(String title, String author, int year,int copiesAvailable) {
        this.title = title;
        this.author = author;
        this.year = year;
        this.copiesAvailable = copiesAvailable;
    }

    // Getter for the title attribute
    public String getTitle() {
        return title;
    }

    // Method to display all information about the book
    public void getAllInfo() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Year: " + getYear());
        System.out.println("copiesAvailable: " + getCopiesAvailable());
    }

    // Setter for the title attribute
    public void setTitle(String title) {
        this.title = title;
    }

    // Getter for the author attribute
    public String getAuthor() {
        return author;
    }

     public int getCopiesAvailable () {
        return copiesAvailable  ;
    }
    // Setter for the author attribute
    public void setAuthor(String author) {
        this.author = author;
    }

    // Getter for the year attribute
    public int getYear() {
        return year;
    }

    // Setter for the year attribute
    public void setYear(int year) {
        this.year = year;
    }
     public void setCopiesAvailable (int copiesAvailable) {
        this.copiesAvailable = copiesAvailable ;
    }
}
