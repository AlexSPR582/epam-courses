package epam.courses.module6.task4.ship;

public class ShipLogic {

    public void loading(Ship ship) {
        Loading loading = new Loading(ship);
        loading.start();
    }

    public void uploading(Ship ship) {
        Unloading unloading = new Unloading(ship);
        unloading.start();
    }
}
