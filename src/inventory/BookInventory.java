package inventory;

import Entities.Book;

import java.util.*;

/*
This class is maintaining the inventory for all the books there in library
*/
public class BookInventory {

    private Map<Book,Integer> books = new HashMap<>();


    public BookInventory() {
    }

    public BookInventory(Map<Book, Integer> books) {
        this.books = books;
    }

    public Map<Book, Integer> getBooks() {
        return books;
    }

    public void addBook(Book addedBook){
       for(Map.Entry<Book,Integer> book: books.entrySet()){
           Book b= book.getKey();
           if(b.getIsbn()==addedBook.getIsbn()){
               books.put(addedBook,book.getValue()+1);
               System.out.println("Book is added "+addedBook.getTitle()+ " to the inventory");
               return;
           }
       }
        books.put(addedBook,1);
        System.out.println("Book is added "+addedBook);
    }

    public void removeBook(Book removeBook){
        for(Map.Entry<Book,Integer> book: books.entrySet()){
            Book b= book.getKey();
            if(b.getIsbn()==removeBook.getIsbn()){
                if(book.getValue()==1){
                    books.remove(removeBook);
                }else {
                    books.put(removeBook, book.getValue() - 1);
                }
                System.out.println("Book is removed "+removeBook.getTitle() +" from inventory");
                return;
            }
        }
    }

    public void updateBook(Book updateBook, int count){
        for(Map.Entry<Book,Integer> book: books.entrySet()){
            Book b= book.getKey();
            if(b.getIsbn()==updateBook.getIsbn()){
               books.put(updateBook,book.getValue()+count);
                System.out.println("Book is updated "+updateBook);
                return ;
            }
        }
        books.put(updateBook,count);
    }
}
