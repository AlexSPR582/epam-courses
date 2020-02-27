package epam.courses.module6.task1.email.message;

import epam.courses.module6.task1.book.Book;

public class Message {
    private String text;
    private Book book;

    public Message(String text){
        this.text = text;
    }

    public Message(Book book){
        this.book = book;
    }

    public Message(String text, Book book) {
        this.text = text;
        this.book = book;
    }

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    public Book getBook() {
        return book;
    }

    public void setBook(Book book) {
        this.book = book;
    }
}
