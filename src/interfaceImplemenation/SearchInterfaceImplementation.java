package interfaceImplemenation;
import Entities.Book;
import interfaces.SearchInterface;
import inventory.BookInventory;
import java.util.Map;

/*
This is the implementation class which is implementing the search
interface and providing utility to search by title, author and isbn
*/
public class SearchInterfaceImplementation implements SearchInterface {

    private BookInventory inventory;

    public SearchInterfaceImplementation(BookInventory bookInventory){
        this.inventory= bookInventory;
    }

    @Override
    public Book searchByTitle(String name) {
        Map<Book, Integer> books = inventory.getBooks();
        for(Map.Entry<Book,Integer> book: books.entrySet()){
            Book searchedBook= book.getKey();
            if(searchedBook.getTitle().equals(name)){
                return searchedBook;
            }
        }
        return null;
    }
    
    @Override
    public Book searchByAuthor(String author) {
        Map<Book, Integer> books = inventory.getBooks();
        for(Map.Entry<Book,Integer> book: books.entrySet()){
            Book searchedBook= book.getKey();
            if(searchedBook.getAuthor().equals(author)){
                return searchedBook;
            }
        }
        return null;
    }

    @Override
    public Book searchByIsbn(int isbn) {
        Map<Book, Integer> books = inventory.getBooks();
        for(Map.Entry<Book,Integer> book: books.entrySet()){
            Book searchedBook= book.getKey();
            if(searchedBook.getIsbn()==isbn){
                return searchedBook;
            }
        }
        return null;
    }
}
