
package LibraryManagementSystem;

public class Library {
    //member variables 
    private String libName = "";
    private String libAddress = "";
    public Book listOfBook[];
    private int totalBook= 0;
    
    //constructor
    public Library() { }
    public Library(String name, String add)
    {
        this.libName =name;
        this.libAddress =add;
        listOfBook= new Book[1000];
    }
    public int gettotal(){return totalBook;}
    public void showLibInfo()
    {
        System.out.println("Library Name : " + this.libName);
        System.out.println("Library Address : " + this.libAddress);
        System.out.println("Total Number Of Book : " + this.totalBook);
        System.out.println("List Of Books : ");
        for(int i=0;i<totalBook;i++)
        {
           System.out.println((i+1) + ".");
           listOfBook[i].showInfo();
        }
    }
    public void addNewBook(Book book)
    {
        listOfBook[totalBook] = book;
        totalBook++;
    }
    
    public void deleteBook(Book book)
    {
        book.deleteBookcopy();
        for(int i = 0; i < totalBook; i++)
        {
            if(listOfBook[i].bookCopy == 0)
            {
                for(int j = i; j <= totalBook; j++)
                {
                    listOfBook[j] = listOfBook[j+1];
                }
                totalBook--;
            }
        }
        
    }
    
    public void addNewBookCopy(Book book, int copy)
    {
        book.addBookCopy(copy);
    }
}
