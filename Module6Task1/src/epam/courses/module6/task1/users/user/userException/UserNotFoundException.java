package epam.courses.module6.task1.users.user.userException;

public class UserNotFoundException extends RuntimeException {
    public UserNotFoundException(){
        super();
    }

    public UserNotFoundException(String message){
        super(message);
    }

    public UserNotFoundException(Exception e){
        super(e);
    }

    public UserNotFoundException(String message, Exception e){
        super(message, e);
    }
}
