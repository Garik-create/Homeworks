package homework1_9;

public class Book {
    private final String bookName;
    private final Author authorName;
    private int publishYear;

    public Book(String book, Author author, int year) {
        bookName = book;
        authorName = author;
        publishYear = year;
    }

    public Author getAuthorName() {
        return authorName;
    }

    public String getBookName() {
        return bookName;
    }

    public int getPublishYear() {
        return publishYear;
    }

    public void setPublishYear(int publishYear) {
        this.publishYear = publishYear;
    }

    /*@Override
    public String toString() {
        return this.bookName;
    }*/


}
