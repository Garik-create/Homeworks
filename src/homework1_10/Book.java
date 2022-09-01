package homework1_10;

//import homework1_9.Author;

import java.util.Objects;

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

    @Override
    public String toString() {
        return "'"+bookName + "' " + authorName.toString() + " " + publishYear;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return publishYear == book.publishYear && bookName.equals(book.bookName) && authorName.equals(book.authorName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookName, authorName, publishYear);
    }
}
