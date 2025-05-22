package service;

import Entities.Book;
import Entities.BookBorrowingHistory;
import Entities.Patron;
import interfaceImplemenation.SearchInterfaceImplementation;
import interfaces.SearchInterface;
import inventory.BookInventory;

import java.util.Date;
import java.util.List;


/*
This class is being used to borrow and return book to the patron
*/
public class LendingProcess {
    private BookInventory bookInventory;
    private SearchInterface srchimplObj;

    public LendingProcess(BookInventory bookInventory, SearchInterface srchinterfcae) {
        this.bookInventory = bookInventory;
        this.srchimplObj = srchinterfcae;
    }

    public void checkout(Book book, Patron patron){
        if(patron.getCurrentBookBorrow()<patron.getMaxBookAllowed()){
            Book searchedBook = srchimplObj.searchByTitle(book.getTitle());
            if(searchedBook==null){
                System.out.println("Book is not present in stock, cannot checkout");
                return ;
            }
            BookBorrowingHistory borrowHistory = new BookBorrowingHistory();
            borrowHistory.setBook(book);
            borrowHistory.setCheckoutDate(new Date());
            patron.getBooks().add(borrowHistory);
            patron.setCurrentBookBorrow(patron.getCurrentBookBorrow()+1);
            bookInventory.removeBook(book);
            System.out.println("Book count is updated in book inventory, current book count "+ bookInventory.getBooks().get(book));
            System.out.println("Book "+book.getTitle()+" is given to the patron "
                    +patron.getName()+" successfully");

            return ;

        }
        System.out.println("Book cannot given since he has already max book allocated");
    }

    public void returnBook(Book book,Patron patron){
        patron.setCurrentBookBorrow(patron.getCurrentBookBorrow()-1);
        List<BookBorrowingHistory> bookList = patron.getBooks();
        for(BookBorrowingHistory b: bookList) {
            if (b.getBook().getTitle().equals(book.getTitle())) {
                b.setReturnDate(new Date());
            }
        }
        bookInventory.addBook(book);
        System.out.println("Book "+ book.getTitle()+" is successfully returned from the patron "
                +patron.getName());
        return ;
    }
}
