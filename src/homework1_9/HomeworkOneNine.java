package homework1_9;

public class HomeworkOneNine {
    public static void main(String[] args) {

        String author1FirstName = "Mark";
        String author1LastName = "Twen";
        String author2FirstName = "Dan";
        String author2LastName = "Brown";

        String book1Name = "Приключения Тома Сойера";
        int book1PublishingYear = 1980;
        String book2Name = "Точка разрыва";
        int book2PublishingYear = 2020;

        Author author1 = new Author(author1FirstName,author1LastName);
        Author author2 = new Author(author2FirstName,author2LastName);

        Book book1 = new Book(book1Name, author1, book1PublishingYear);
        Book book2 = new Book(book2Name, author2, book2PublishingYear);

        System.out.printf("%s, %s, %d\n", book1.getAuthorName(), book1.getBookName(), book1.getPublishYear());
        System.out.printf("%s, %s, %d\n", book2.getAuthorName(), book2.getBookName(), book2.getPublishYear());

        book1.setPublishYear(1888);
        System.out.printf("%s, %s, %d\n", book1.getAuthorName(), book1.getBookName(), book1.getPublishYear());

    }



}
