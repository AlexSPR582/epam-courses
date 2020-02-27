package epam.courses.module6.task4.ship;

public class Ship {
    private int capacity = 10;
    private volatile int containers = 5;
    private String name;

    public Ship(String name) {
        this.name = name;
    }

    public Ship(String name, int containers) {
        this.containers = containers;
        this.name = name;
    }

    public Ship(String name, int capacity, int containers) {
        this.name = name;
        this.capacity = capacity;
        this.containers = containers;
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

    public String getName() {
        return name;
    }
}
