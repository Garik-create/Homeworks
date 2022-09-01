package homework1_10;

public class HomeworkOneTen {
    public static void main(String[] args) {

        Author author1 = new Author("Ден", "Браун");
        Author author2 = new Author("Ден", "Браун");
        Book book1 = new Book("Точка возврата",author1, 1999);
        Book book2 = new Book("Код Давинчи", author2, 1999);

        System.out.println(author1);
        System.out.println(author2);
        System.out.println(book1);
        System.out.println(book2);

        System.out.println(author1.equals(author2));
        System.out.println(book1.equals(book2));

        System.out.println(author1.hashCode());
        System.out.println(author2.hashCode());
        System.out.println(book1.hashCode());
        System.out.println(book2.hashCode());


    }
}
