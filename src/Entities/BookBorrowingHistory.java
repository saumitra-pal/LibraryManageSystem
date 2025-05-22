package Entities;

import java.util.Date;

/*
This is the BookBorrowingHistoryClass , contains book and checkout date and return date information.
*/
public class BookBorrowingHistory {
    private Book book;
    private Date checkoutDate;
    private Date returnDate;

    public BookBorrowingHistory() {
    }

    public BookBorrowingHistory(Book book, Date checkoutDate, Date returnDate) {
        this.book = book;
        this.checkoutDate = checkoutDate;
        this.returnDate = returnDate;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }

    public Date getCheckoutDate() {
        return checkoutDate;
    }

    public void setCheckoutDate(Date checkoutDate) {
        this.checkoutDate = checkoutDate;
    }

    public Date getReturnDate() {
        return returnDate;
    }

    public void setReturnDate(Date returnDate) {
        this.returnDate = returnDate;
    }

    @Override
    public String toString() {
        return "BookBorrowingHistory{" +
                "book=" + book +
                ", checkoutDate=" + checkoutDate +
                ", returnDate=" + returnDate +
                '}';
    }
}
