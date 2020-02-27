package epam.courses.module6.task1.users.user;

import epam.courses.module6.task1.book.Book;
import epam.courses.module6.task1.email.Email;
import epam.courses.module6.task1.email.EmailLogic;
import epam.courses.module6.task1.email.message.Message;
import epam.courses.module6.task1.users.admin.Admin;
import epam.courses.module6.task1.users.user.userException.UserNotFoundException;
import epam.courses.module6.task1.users.user.userList.UserList;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserLogic{
    public void checkEmail(User user) {
        EmailLogic el = new EmailLogic();
        el.printAllMessages(user.getEmail());
    }

    public User findUser(String id, String password) {
        for (User user: UserList.getInstance().getUsers()) {
            if (id.equals(user.getId())
                    && password.equals(user.getPassword())) {
                return user;
            }
        }
        return null;
    }


    public void findBook(User user, String information){
        if (user.isSingIn()){
            FileReader fr = null;
            Scanner sc = null;
            try {
                fr = new FileReader("Catalog.txt");
                sc = new Scanner(fr);
                Pattern pattern = Pattern.compile(information);
                while (sc.hasNextLine()){
                    String str = sc.nextLine();
                    Matcher matcher = pattern.matcher(str);
                    if (matcher.find()){
                        System.out.println(str);
                    }
                }
            } catch (IOException e){
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                    sc.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void viewAllBooks(User user){
        if (user.isSingIn()){
            FileReader fr = null;
            Scanner sc = null;
            try {
                fr = new FileReader("Catalog.txt");
                sc = new Scanner(fr);
                while (sc.hasNextLine()) {
                    System.out.println(sc.nextLine());
                }
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fr.close();
                    sc.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void sendRecommendation(User user, Book book){
        if (user.isSingIn()){
            EmailLogic el = new EmailLogic();
            el.sendEmail(Admin.getAdmin().getEmail(), new Message(book));
        }
        else {
            System.out.println("Пользователь не вошёл в систему");
        }
    }

    public void singIn(User user){
        if (!user.isSingIn() && isUserAlreadyExist(user)){
            user.setSingIn();
        }
        else if (user.isSingIn() && isUserAlreadyExist(user)){
            System.out.println("Пользователь уже вошёл в систему");
        }
        else {
            throw new UserNotFoundException("Пользователь не найден в системе");
        }
    }

    public void addUser(User user){
        if (!isUserAlreadyExist(user)){
            FileWriter fw = null;
            try {
                UserList.getInstance().getUsers().add(user);
                fw = new FileWriter("Users.txt", true);
                fw.append(user.getId() + " " + user.getPassword() + '\n');
            } catch (IOException e) {
                e.printStackTrace();
            } finally {
                try {
                    fw.close();
                } catch (IOException e){
                    e.printStackTrace();
                }
            }
        }
        else {
            System.out.println("Пользователь " + user.getId() + " уже зарегестрирован в системе");
        }
    }

    public boolean isUserAlreadyExist(User user){
        FileReader reader = null;
        Scanner sc = null;
        try {
            reader = new FileReader("Users.txt");
            sc = new Scanner(reader);
            Pattern pattern = Pattern.compile("^" + user.getId()
                    + " " + user.getPassword() + "$");
            while (sc.hasNextLine()){
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()){
                    return true;
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
                sc.close();

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return false;
    }
}
