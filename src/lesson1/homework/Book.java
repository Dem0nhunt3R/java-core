package lesson1.homework;

import java.util.Calendar;

public class Book {
    private String  title;
    private int pagesNumber;
    private String  genre;
    private String date;

    public Book() {
    }

    public Book(String title, int pagesNumber, String genre, String date) {
        this.title = title;
        this.pagesNumber = pagesNumber;
        this.genre = genre;
        this.date = date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPagesNumber() {
        return pagesNumber;
    }

    public void setPagesNumber(int pagesNumber) {
        this.pagesNumber = pagesNumber;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", pagesNumber=" + pagesNumber +
                ", genre='" + genre + '\'' +
                ", date='" + date + '\'' +
                '}';
    }
}
