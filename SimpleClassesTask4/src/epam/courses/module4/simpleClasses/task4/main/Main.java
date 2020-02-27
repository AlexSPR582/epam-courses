package epam.courses.module4.simpleClasses.task4.main;

import epam.courses.module4.simpleClasses.task4.train.Train;
import epam.courses.module4.simpleClasses.task4.trainArray.TrainArrayLogic;

public class Main {
    public static void main(String[] args) {
        Train train1 = new Train("Харьков", 56, "23:56");
        Train train2 = new Train("Орша", 23, "14:52");
        Train train3 = new Train("Минск", 78, "06:00");
        Train train4 = new Train("Минск", 45, "01:02");
        Train train5 = new Train("Витебск", 92, "18:42");

        Train[] trains = {train1, train2, train3, train4, train5};

        TrainArrayLogic tal = TrainArrayLogic.getInstance();
        tal.printTrainArray(trains);

        System.out.println('\n' + "Сортировка по номеру поезда");
        tal.sortTrainsByTrainNumber(trains);
        tal.printTrainArray(trains);

        System.out.println('\n' + "Сортировка поездов по пункту назначения");
        tal.sortTrainsByDestination(trains);
        tal.printTrainArray(trains);

        System.out.println('\n' + "Поиск поеда по номеру");
        tal.findTrain(78, trains);
    }
}
