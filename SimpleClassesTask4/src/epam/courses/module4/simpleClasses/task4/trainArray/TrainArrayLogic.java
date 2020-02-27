package epam.courses.module4.simpleClasses.task4.trainArray;

import epam.courses.module4.simpleClasses.task4.train.Train;
import epam.courses.module4.simpleClasses.task4.train.TrainLogic;

import java.util.Arrays;

public class TrainArrayLogic {
    private static TrainArrayLogic trainArrayLogic;

    private TrainArrayLogic() {}

    public static TrainArrayLogic getInstance() {
        if (trainArrayLogic == null) {
            trainArrayLogic = new TrainArrayLogic();
        }
        return  trainArrayLogic;
    }

    public void sortTrainsByTrainNumber(Train[] trains) {
        for (int i = 1; i < trains.length; i++) {
            int j = i - 1;
            Train train = trains[i];
            while (j >= 0 && trains[j].getTrainNumber() > train.getTrainNumber()){
                trains[j + 1] = trains[j];
                j = j - 1;
            }
            trains[j + 1] = train;
        }
    }

    public void findTrain(int trainNumber, Train[] trains) {
        TrainLogic tl = TrainLogic.getInstance();
        for (int i = 0; i < trains.length; i++) {
            if (trains[i].getTrainNumber() == trainNumber) {
                tl.getInformation(trains[i]);
            }
        }
    }

    public void sortTrainsByDestination(Train[] trains) {
        Arrays.sort(trains, TrainLogic.getInstance());
    }

    public void printTrainArray(Train[] trains) {
        TrainLogic tl = TrainLogic.getInstance();
        for (Train train: trains) {
            tl.getInformation(train);
        }
    }
}
