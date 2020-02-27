package epam.courses.module6.task1.users.admin;

import epam.courses.module6.task1.email.Email;

public class Admin {
    private static Admin admin;

    private Email email;

    private Admin(){
        email = new Email();
    }

    public static Admin getAdmin(){
        if (admin == null){
            admin = new Admin();
        }
        return admin;
    }

    public Email getEmail(){
        return email;
    }
}
