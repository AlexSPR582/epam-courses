package epam.courses.module6.task1.library;

import epam.courses.module6.task1.book.Book;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private static Library library;

    private List<Book> digitalBooks = new ArrayList<>();
    private List<Book> paperBooks = new ArrayList<>();

    private Library(){}

    public static Library getLibrary(){
        if (library == null){
            library = new Library();
        }
        return library;
    }

    public List<Book> getDigitalBooks() {
        return digitalBooks;
    }

    public List<Book> getPaperBooks() {
        return paperBooks;
    }
}
