package epam.courses.module4.simpleClasse.task9.main;

import epam.courses.module4.simpleClasse.task9.book.Book;
import epam.courses.module4.simpleClasse.task9.bookArray.BookArray;
import epam.courses.module4.simpleClasse.task9.bookArray.BookArrayLogic;

public class Main {
    public static void main(String[] args) {
        Book book1 = new Book("Сияние", "Стивен Кинг", "АСТ", 2015);
        Book book2 = new Book("Чужак", "Стивен Кинг", "АСТ", 2019);
        Book book3 = new Book("Гарри Поттер и Тайная комната", "Джоан Роулинг",
                "Махаон", 2019);

        Book[] books = {book1, book2};
        BookArray bookArray = new BookArray(books);
        BookArrayLogic bal = BookArrayLogic.getInstance();

        bal.addBook(book3, bookArray);

        System.out.println("Вывод книг заданного автора:");
        bal.printBooksOfAuthor("Стивен Кинг", bookArray);

        System.out.println('\n' + "Вывод книг заданного издательства:");
        bal.printBooksOfPublishingHouse("Махаон", bookArray);

        System.out.println('\n' + "Вывод книг вышедших после указанного года");
        bal.printBooksAfterYear(2017, bookArray);
    }
}
