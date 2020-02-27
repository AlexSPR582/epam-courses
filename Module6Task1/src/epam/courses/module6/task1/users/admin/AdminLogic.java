package epam.courses.module6.task1.users.admin;

import epam.courses.module6.task1.book.Book;
import epam.courses.module6.task1.book.BookLogic;
import epam.courses.module6.task1.email.EmailLogic;
import epam.courses.module6.task1.email.message.Message;
import epam.courses.module6.task1.email.message.MessageLogic;
import epam.courses.module6.task1.library.Library;
import epam.courses.module6.task1.users.user.User;
import epam.courses.module6.task1.users.user.userList.UserList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class AdminLogic {
    public void checkEmail(){
        for (Message message: Admin.getAdmin().getEmail().getMailBox()) {
            if (message.getBook() != null) {
                Scanner sc = new Scanner(System.in);
                BookLogic bl = new BookLogic();
                System.out.println("Если хотите добавить книгу"
                        + bl.getBookDescription(message.getBook())
                        + " в библиотеку нажмите 1, если нет - любую другую цифру");
                if (sc.nextInt() == 1) {
                    addBook(message.getBook(), true, true);
                }
            }
            else {
                MessageLogic ml = new MessageLogic();
                ml.printMessage(message);
            }
        }
    }

    public void addBook(Book book, boolean isPaper, boolean isDigital){
        if (isPaper && isDigital){
            Library.getLibrary().getDigitalBooks().add(book);
            Library.getLibrary().getPaperBooks().add(book);
        }
        else if (isDigital){
            Library.getLibrary().getDigitalBooks().add(book);
        }
        else if (isPaper){
            Library.getLibrary().getPaperBooks().add(book);
        }
        if (!isBookAlreadyExist(book)) {
            modifyCatalog(book);
            sendNotificationToAllUsers(book);
        }
    }

    private void modifyCatalog(Book book){
        FileWriter fw = null;
        try {
            fw = new FileWriter("Catalog.txt", true);
            fw.append(book.getName() + ", " + book.getAuthor()
                    + ", " + book.getPublishYear() + '\n');
        } catch (IOException e){
            e.printStackTrace();
        } finally {
            try {
                fw.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }

    private void sendNotificationToAllUsers(Book book){
        BookLogic bl = new BookLogic();
        String notification = "В каталоге появилась новая книга: " + bl.getBookDescription(book);
        EmailLogic el = new EmailLogic();
        for (User user: UserList.getInstance().getUsers()){
            el.sendEmail(user.getEmail(), new Message(notification));
        }
    }

    private boolean isBookAlreadyExist(Book book){
        FileReader fr = null;
        Scanner sc = null;
        try {
            fr = new FileReader("Catalog.txt");
            sc = new Scanner(fr);
            Pattern pattern = Pattern.compile(book.getName() + ", "
                    + book.getAuthor() + ", " + book.getPublishYear());
            while (sc.hasNextLine()) {
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()){
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                fr.close();
                sc.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
