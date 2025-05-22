package Entities;

/*
This is the book class, contains information about the book.
*/
public class Book {
    private String title;
    private String author;
    private int publishYear;
    private long isbn;

    public Book() {
    }

    public Book(String title, String author, int publishYear, long isbn) {
        this.title = title;
        this.author = author;
        this.publishYear = publishYear;
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    public long getIsbn() {
        return isbn;
    }

    public void setIsbn(long isbn) {
        this.isbn = isbn;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", publishYear=" + publishYear +
                ", isbn=" + isbn +
                '}';
    }
}
