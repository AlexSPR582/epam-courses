package epam.courses.module4.simpleClasses.task1.incorrectMarkException;

public class IncorrectMarkException extends RuntimeException{
    public IncorrectMarkException(){}

    public IncorrectMarkException(String text) {
        super(text);
    }

    public IncorrectMarkException(Exception e) {
        super(e);
    }

    public IncorrectMarkException(String text, Exception e) {
        super(text, e);
    }
}
