package epam.courses.module4.aggregationAndComposition.task2.carException;

public class NotEnoughWheelsException extends RuntimeException {
    public NotEnoughWheelsException() {}

    public NotEnoughWheelsException(String text) {
        super(text);
    }

    public NotEnoughWheelsException(Exception e) {
        super(e);
    }

    public NotEnoughWheelsException(String text, Exception e) {
        super(text, e);
    }
}
