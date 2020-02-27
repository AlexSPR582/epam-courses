package epam.courses.module6.task3.client;

public class Client {
    public static void main(String[] args) {
        User user1 = new User(1234);
        UserLogic uLog = new UserLogic(user1);
        uLog.connect();
        uLog.createFile("567", "Alex", "Ivanov", "Programming");
        System.out.println();
        uLog.watchArchive("567");
        uLog.changeArchive("567", "name", "Vadik");
        System.out.println();
        uLog.watchArchive("567");
        uLog.closeConnection();

    }
}
