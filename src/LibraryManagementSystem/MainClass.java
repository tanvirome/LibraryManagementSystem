
package LibraryManagementSystem;

public class MainClass {

    public static void main(String[] args) {
        // TODO code application logic here
        Library Lib = new Library("Hotashar Rajjo", "Hotashabagan");
        
        Book b1 = new Book("JAVA", "Writer", "154-45", "Engineering", 15);
        
        Book b2 = new Book("DATA2", "Writer", "154-50", "Engineering", 20);
        
        Book b3 = new Book("DATA3", "Writer", "154-50", "Engineering", 20);
        
        Book b4 = new Book("DATA4", "Writer", "154-50", "Engineering", 20);
        
        Book b5 = new Book("DATA5", "Writer", "154-50", "Engineering", 20);
        
        Lib.addNewBook(b1);
        
        Lib.addNewBook(b2);
        
        Lib.addNewBook(b3);
        
        Lib.addNewBook(b4);
        
        Lib.addNewBook(b5);
        
        //Lib.addNewBookCopy(b2, 5);
        
        //Lib.deleteBook(b2);
        
        //Lib.deleteBook(b4);
        
        //Lib.showLibInfo();
        
        
        for(int i = 0;i<Lib.gettotal();i++ )
        {
            System.out.println();
            Lib.listOfBook[i].showInfo();
        }
        
        for(int i = 0;i<Lib.gettotal();i++ )
        {
            //System.out.println();
            if(Lib.listOfBook[i] == b2)
            {
                b2.addBookCopy(5);
            }
        }
    }
    
}
