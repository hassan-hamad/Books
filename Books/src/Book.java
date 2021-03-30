public class Book {
	
    public String bookName;           
    public String bookAuthor;          
    public int    pageNumbers;        
    
    private static int bookCounter;
    
    public Book(String bookName, String bookAuthor, int pageNumbers) {
        this.bookName = bookName;
        this.bookAuthor = bookAuthor;
        this.pageNumbers = pageNumbers;
 
        bookCounter++;    
    }
    
    public void printBookInfo() {
        System.out.println("Book: " +bookName);
    
    System.out.println("Author: " +bookAuthor);
    System.out.println("Number of pages: " +pageNumbers);
    System.out.println("------------------------------");
}


public static void printTotalNumberOfBooks() {
    System.out.println("The total number of books is: " +bookCounter);
}




	public static void main(String[] args) {
		
		 
        Book b1 = new Book("java", "Mhamad Harmush", 500);
        Book b2 = new Book("HTML", "Hala Harmush"  , 320);
        Book b3 = new Book("C++" , "Omar El Koussa", 210);
 
        b1.printBookInfo();
        b2.printBookInfo();
        b3.printBookInfo();
 
        Book.printTotalNumberOfBooks();
        
    }
 


	}

