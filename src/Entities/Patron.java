package Entities;

import enums.PatronType;

import java.util.ArrayList;
import java.util.List;

/*
This is the patron class.
*/
public class Patron {
    private int id;
    private String name;
    private int maxBookAllowed;
    private int currentBookBorrow;
    private PatronType patronType;
    private List<BookBorrowingHistory> books= new ArrayList<>();

    public Patron(int id, String name, int maxBookAllowed, int currentBookBorrow,PatronType type) {
        this.id = id;
        this.name = name;
        this.maxBookAllowed = maxBookAllowed;
        this.currentBookBorrow = currentBookBorrow;
        this.patronType =  type;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMaxBookAllowed() {
        return maxBookAllowed;
    }

    public void setMaxBookAllowed(int maxBookAllowed) {
        this.maxBookAllowed = maxBookAllowed;
    }

    public int getCurrentBookBorrow() {
        return currentBookBorrow;
    }

    public void setCurrentBookBorrow(int currentBookBorrow) {
        this.currentBookBorrow = currentBookBorrow;
    }

    public List<BookBorrowingHistory> getBooks() {
        return books;
    }

    public void setBooks(List<BookBorrowingHistory> books) {
        this.books = books;
    }

}
