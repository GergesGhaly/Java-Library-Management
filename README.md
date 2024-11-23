Java Library Management System
Overview
This is a simple library management system project developed using Java. The system allows managing books and users (customers) who can borrow and return books from the library. It has different roles for users, such as customers and librarians.

Key Features
Add Books: Librarians can add books to the library.
Remove Books: Librarians can remove books from the library.
Search Books: Users can search for books by their title.
Borrow Books: Customers can borrow books from the library, provided copies are available.
Return Books: Customers can return borrowed books.
Components
1. Class: Book
Represents a book in the library.
Contains information such as title, author, publication year, and available copies.
Books can be added or updated with new information.
2. Class: Library
Represents the library itself.
Contains lists of books and provides methods for adding, removing, and displaying books.
It also tracks borrowed books in the borrowing records.
3. Interface: Borrowable
Interface with methods for borrowing and returning books.
Implemented by the Customer class.
4. Class: Customer
Represents the customer (user) of the library system.
Customers can borrow and return books.
Borrowed books are stored in a list specific to the customer.
5. Class: Librarian
Represents the librarian who manages the library.
Librarians can add and remove books from the library.
They can also view all books in the library or delete books.
6. Class: User
Represents a user (either a customer or a librarian).
Contains personal information like name, contact number, and user role (customer or librarian).
7. Enum: UserType
Defines the type of user (Customer or Librarian).
Example Usage
Adding a Book to the Library:

java
Copy code
Librarian librarian = new Librarian(1, "Ahmed", 123456789, UserType.LIBRARIAN);
Book newBook = new Book("Java Programming", "John Doe", 2024, 5);
librarian.addBook(newBook, library);
Borrowing a Book:

java
Copy code
Customer customer = new Customer(2, "Ali", 987654321, UserType.CLIENT);
Book bookToBorrow = library.searchBookByTitle("Java Programming");
customer.borrowBook(bookToBorrow, library);
Returning a Book:

java
Copy code
customer.returnBook(bookToBorrow, library);
Technologies Used
Java
OOP (Object-Oriented Programming)
Arrays and ArrayLists for data storage
Setup Instructions
Clone or download the project from GitHub.
Open the project in any Java development environment like IntelliJ or Eclipse.
You can run any of the main classes like Library or User to test the system.
