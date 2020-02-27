package epam.courses.module6.task3.server;

public class Server {
    public static void main(String[] args) {
        ServerLogic slog = ServerLogic.getInstance();
        slog.start();
        slog.getRequests();
        slog.exit();
    }
}
