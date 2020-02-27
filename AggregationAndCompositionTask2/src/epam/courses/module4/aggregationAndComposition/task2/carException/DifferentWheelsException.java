package epam.courses.module4.aggregationAndComposition.task2.carException;

public class DifferentWheelsException extends RuntimeException {
    public DifferentWheelsException() {}

    public DifferentWheelsException(String text) {
        super(text);
    }

    public DifferentWheelsException(Exception e) {
        super(e);
    }

    public DifferentWheelsException(String text, Exception e) {
        super(text, e);
    }
}
