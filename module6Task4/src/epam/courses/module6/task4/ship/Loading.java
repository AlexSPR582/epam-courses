package epam.courses.module6.task4.ship;

import epam.courses.module6.task4.port.Port;

class Loading extends Thread {
    private Ship ship;
    private final Port port = Port.getInstance();

    Loading(Ship ship){
        this.ship = ship;
    }

    @Override
    public void run(){
        while (ship.getContainers() < ship.getCapacity()){
            synchronized (port) {
                if (port.getContainers() > 0) {
                    ship.setContainers(ship.getContainers() + 1);
                    port.setContainers(port.getContainers() - 1);
                    System.out.println("Контейнеров на борту корабля " + ship.getName()
                            + ": " + ship.getContainers());
                    System.out.println("Контейнеров в порту: " + port.getContainers());
                    port.notifyAll();
                }
                else {
                    System.out.println("В данный момент в порту нету контейнеров.");
                    try {
                        port.wait();
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
            try {
                Thread.sleep(10);
            } catch (InterruptedException e){
                e.printStackTrace();
            }
        }
        System.out.println("Корабль " + ship.getName() + " загружен");
    }
}
