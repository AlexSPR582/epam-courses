package epam.courses.module6.task4.main;

import epam.courses.module6.task4.ship.Ship;
import epam.courses.module6.task4.ship.ShipLogic;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Ship ship1 = new Ship("1");
        Ship ship2 = new Ship("2");
        Ship ship3 = new Ship("3");

        ShipLogic sL1 = new ShipLogic();

        sL1.uploading(ship1);
        Thread.sleep(3000);
        sL1.loading(ship3);
        sL1.loading(ship2);
    }
}
