package epam.courses.module6.task1.email;

import epam.courses.module6.task1.email.message.Message;
import epam.courses.module6.task1.email.message.MessageLogic;



public class EmailLogic {
    public void sendEmail(Email email, Message message){
        email.getMailBox().add(message);

    }

    public void printAllMessages(Email email) {
        MessageLogic ml = new MessageLogic();
        for (Message message: email.getMailBox()) {
            ml.printMessage(message);
        }
    }
}
