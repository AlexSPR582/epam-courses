package epam.courses.module6.task1.email.message;

import epam.courses.module6.task1.book.BookLogic;

public class MessageLogic {
    public void printMessage(Message message){
        if (message.getBook() != null && message.getText() != null) {
            System.out.println(message.getText());
            BookLogic bl = new BookLogic();
            bl.printBook(message.getBook());
        }
        else if (message.getBook() != null && message.getText() == null){
            BookLogic bl = new BookLogic();
            bl.printBook(message.getBook());
        }
        else if (message.getBook() == null && message.getText() != null){
            System.out.println(message.getText());
        }
    }
}
