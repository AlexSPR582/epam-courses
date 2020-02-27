package epam.courses.module6.task1.users.user.userList;

import epam.courses.module6.task1.users.user.User;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class UserList {
    private static UserList userList;

    private ArrayList<User> users;

    private UserList() {
        users = new ArrayList<>();
    }

    public static UserList getInstance() {
        if (userList == null) {
            userList = new UserList();
            userList.getUsersFromFile();
        }
        return userList;
    }

    public ArrayList<User> getUsers() {
        return users;
    }

    public void setUsers(ArrayList<User> users) {
        this.users = users;
    }

    private void getUsersFromFile(){
        FileReader fr = null;
        Scanner sc = null;
        try {
            fr = new FileReader("Users.txt");
            sc = new Scanner(fr);
            Pattern pattern = Pattern.compile("^(\\w+)\\s(\\w+)");
            while (sc.hasNextLine()) {
                Matcher matcher = pattern.matcher(sc.nextLine());
                if (matcher.find()) {
                    users.add(User.getInstance(matcher.group(1), matcher.group(2)));
                }
            }
        } catch (FileNotFoundException e){
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
}
