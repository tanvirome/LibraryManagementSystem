
package LibraryManagementSystem;

public class Book {
    //member variable
    private String bookName = "";
    private String bookAuthor = "";
    private String bookId = "";
    private String bookType = "";
    int bookCopy = 0;
    
    //constructor
    public Book(){}
    public Book(String bname, String bauthor, String bid, String btype, int bcopy)
    {
        this.bookName = bname;
        this.bookAuthor = bauthor;
        this.bookId = bid;
        this.bookType = btype;
        this.bookCopy = bcopy;
        //System.out.println("Data Entered Succesfully");
    }
    public void addBookCopy(int x)
    {
        this.bookCopy += x;
    }
    public void deleteBookcopy()
    {
        this.bookCopy = 0;
    }
    public void showInfo()
    {
        System.out.println("Book Name : " + this.bookName);
        System.out.println("Book Author : " + this.bookAuthor);
        System.out.println("Book ID : " + this.bookId);
        System.out.println("Book Type : " + this.bookType);
        System.out.println("Book Copy : " + this.bookCopy);
    }
}
