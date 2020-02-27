package epam.courses.module6.task1.users.user;

import epam.courses.module6.task1.email.Email;

public class User {
    private Email email;
    private String password;
    private String id;
    private boolean singIn = false;

    private User(String id, String password) {
        this.email = new Email();
        this.id = id;
        this.password = password;
    }

    public static User getInstance(String id, String password) {
        UserLogic ul = new UserLogic();
        User user = ul.findUser(id, password);
        if (user == null) {
            return new User(id, password);
        }
        else {
            return user;
        }
    }

    String getPassword() {
        return password;
    }

    String getId(){
        return id;
    }

    boolean isSingIn() {
        return singIn;
    }

    void setSingIn() {
        this.singIn = true;
    }

    public Email getEmail(){
        return email;
    }
}
