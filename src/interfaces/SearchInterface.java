package interfaces;
import Entities.Book;

/*
This is the interface which is depicting the behaviour of search utilities
*/
public interface SearchInterface {
    public Book searchByTitle(String name);

    public Book searchByAuthor(String author);

    public Book searchByIsbn(int isbn);

}

