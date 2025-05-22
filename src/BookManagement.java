import Entities.Book;
import Entities.BookBorrowingHistory;
import Entities.Patron;
import enums.PatronType;
import interfaceImplemenation.SearchInterfaceImplementation;
import interfaces.SearchInterface;
import inventory.BookInventory;
import service.LendingProcess;

import java.util.HashMap;
import java.util.Map;

/*
This is the main class which will handle all the object creation and lending process
*/
public class BookManagement {
    public static void main(String[] args) {
        Book physicsBook = new Book("Physics Book By Newton","Newton",1988,24008);
        Book chemistryBook = new Book("Chemistry Book by Bharat","Bharat",1999,23000);
        Book mathsBook= new Book("Aptitude book by RD Agarwal","RD Agarwal",1995,20000);


        Map<Book,Integer> allBooks= new HashMap<>();
        allBooks.put(physicsBook,10);
        allBooks.put(chemistryBook,10);
        allBooks.put(mathsBook,10);
        BookInventory bookInventory = new BookInventory(allBooks);
        Patron patronGaurav = new Patron(100,"Gaurav",5,0, PatronType.Student);
        Patron patronShubham = new Patron(101,"Shubham",5,0,PatronType.Student);
        Patron patronKapil = new Patron(105,"Kapil",10,0, PatronType.Teacher);
        Patron patronPrince = new Patron(110,"Prince",5,0,PatronType.Student);
        SearchInterface srchObj = new SearchInterfaceImplementation(bookInventory);
        LendingProcess lendingService = new LendingProcess(bookInventory,srchObj);
        lendingService.checkout(physicsBook,patronGaurav);
        lendingService.returnBook(physicsBook,patronGaurav);
        lendingService.checkout(mathsBook,patronGaurav);
        lendingService.checkout(physicsBook,patronGaurav);
        lendingService.returnBook(mathsBook,patronGaurav);








    }


}