package packB;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class LibraryBook extends Book implements BorrowAble {
    private int id;
    private PrintType type; 
    boolean availForBorrow;
    private LocalDate dateBorrow;
    public LibraryBook(int id, String title, String author, String publisher, int year, int numberOfPages, PrintType t) {
        // next version --> isbn
        this.id = id;
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.numberOfPages = numberOfPages;
        this.type = t;
        this.availForBorrow = true;
    } 
    public void setBookAvailableFalse() {
        availForBorrow = false;
    }
    public void setBookAvailableTrue() {
        availForBorrow = true;
    }
    public boolean isAvailable() {
        return availForBorrow;
    }
    @Override
    public String toString() {
        return "LibraryBook [id=" + id + ", title=" + title + ", type=" + type + ", avail=" + availForBorrow + "]";
    }
    public boolean checkoutItem(int yy, int mm, int dd) { 
        if (type == PrintType.PRINT && isAvailable() == true) {
            availForBorrow = false;
            dateBorrow = LocalDate.of(yy,mm,dd);
            return true;
        }   
        return false;
    }
    public int returnItem(int yy, int mm, int dd) {
        if (isAvailable() == false) {
            LocalDate today = LocalDate.of(yy,mm,dd);
            long daysBetween = ChronoUnit.DAYS.between(dateBorrow, today);
            return (int)(daysBetween);
        }
        return 0;
    }
}
