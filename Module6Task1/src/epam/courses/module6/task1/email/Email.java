package epam.courses.module6.task1.email;

import epam.courses.module6.task1.email.message.Message;

import java.util.ArrayList;

public class Email {
    private ArrayList<Message> mailBox;

    public Email(){
        mailBox = new ArrayList<>();
    }

    public ArrayList<Message> getMailBox(){
        return mailBox;
    }
}
