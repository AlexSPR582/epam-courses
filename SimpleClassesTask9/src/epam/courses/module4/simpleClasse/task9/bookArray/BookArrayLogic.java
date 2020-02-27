package epam.courses.module4.simpleClasse.task9.bookArray;

import epam.courses.module4.simpleClasse.task9.book.Book;
import epam.courses.module4.simpleClasse.task9.book.BookLogic;

import java.util.Arrays;

public class BookArrayLogic {
    private static BookArrayLogic bookArrayLogic;

    private BookArrayLogic() {}

    public static BookArrayLogic getInstance() {
        if (bookArrayLogic == null) {
            bookArrayLogic = new BookArrayLogic();
        }
        return bookArrayLogic;
    }

    public void printBooksOfAuthor(String author, BookArray books) {
        for (Book book: books.getBooks()) {
            if (book.getAuthors().equals(author)) {
                BookLogic.getInstance().printBook(book);
            }
        }
    }

    public void printBooksOfPublishingHouse(String publishingHouse, BookArray books) {
        for (Book book: books.getBooks()) {
            if (book.getPublishingHouse().equals(publishingHouse)) {
                BookLogic.getInstance().printBook(book);
            }
        }
    }

    public void printBooksAfterYear(int year, BookArray books) {
        for (Book book: books.getBooks()) {
            if (book.getPublishingYear() > year) {
                BookLogic.getInstance().printBook(book);
            }
        }
    }

    public void addBook(Book book, BookArray books) {
        Book[] newBookArray = Arrays.copyOf(books.getBooks(), books.getBooks().length + 1);
        newBookArray[newBookArray.length - 1] = book;
        books.setBooks(newBookArray);
    }
}
