package epam.courses.module4.simpleClasse.task9.book;

public class BookLogic {
    private static BookLogic bookLogic;

    private BookLogic() {}

    public static BookLogic getInstance() {
        if (bookLogic == null) {
            bookLogic = new BookLogic();
        }
        return bookLogic;
    }

    public void printBook(Book book) {
        System.out.println("название: " + book.getName());
        System.out.println("авторы: " + book.getAuthors());
        System.out.println("издательство: " + book.getPublishingHouse());
        System.out.println("год издания: " + book.getPublishingYear());
    }
}
