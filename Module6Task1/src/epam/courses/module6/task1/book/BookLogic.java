package epam.courses.module6.task1.book;

public class BookLogic {
    public void printBook(Book book){
        System.out.println(book.getName());
        System.out.println(book.getAuthor());
        System.out.println(book.getPublishYear());
    }

    public String getBookDescription(Book book) {
        return book.getName() + ", "
                + book.getAuthor() + ", " + book.getPublishYear();
    }
}
