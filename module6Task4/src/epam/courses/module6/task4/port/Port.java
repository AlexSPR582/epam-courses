package epam.courses.module6.task4.port;

public class Port {
    private static Port port;
    private int capacity = 100;
    private volatile int containers = 98;

    private Port(){

    }

    public static Port getInstance(){
        if (port == null) {
            port = new Port();
        }
        return port;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getContainers() {
        return containers;
    }

    public void setContainers(int containers) {
        this.containers = containers;
    }
}
