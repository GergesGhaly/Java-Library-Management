import java.util.ArrayList;

class Customer extends User implements Borrowable{
    
    public Customer(int id, String name, int contactInfo, UserType role){
        super( id,  name,  contactInfo,  role);
    }
    
    ArrayList<Book> borrowedBooks = new ArrayList<>();
    
    @Override
    public void borrowBook (Book book, Library library) throws Exception{
        
        if (borrowedBooks.contains(book)) {
            throw new Exception("You have already borrowed this book.");
        }

        if(book.getCopiesAvailable() <= 0){
             throw new Exception("Cannot borrow, no copies available now.");
        }
            
        
          borrowedBooks.add(book);
          library.addToBorrowRecords(book);
          System.out.println("You have borrowed the book: " + book.getTitle());
          book.setCopiesAvailable(book.getCopiesAvailable() - 1)  ;
        
        
        
         
    }

    @Override
    public void returnBook (Book book,Library library) throws Exception{
        
       
        if (!borrowedBooks.contains(book)) {
            throw new Exception("You have not borrowed this book.");
        }
            
        
          borrowedBooks.remove(book);
          System.out.println("You return a book: " + book.getTitle());
          book.setCopiesAvailable(book.getCopiesAvailable() + 1)  ;
      
              
    }

    
}
