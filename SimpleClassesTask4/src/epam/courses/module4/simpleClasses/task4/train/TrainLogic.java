package epam.courses.module4.simpleClasses.task4.train;

import java.util.Comparator;

public class TrainLogic implements Comparator<Train> {
    private static TrainLogic trainLogic;

    private TrainLogic() {}

    public static TrainLogic getInstance() {
        if (trainLogic == null) {
            trainLogic = new TrainLogic();
        }
        return trainLogic;
    }

    public void getInformation(Train train) {
        System.out.println(train.getDestinationName() +
                ", " + train.getTrainNumber() +
                ", " + train.getMoveTime());

    }

    @Override
    public int compare(Train train1, Train train2) {
        int result = train1.getDestinationName().compareTo(train2.getDestinationName());
        if (result == 0) {
            if (train1.getMoveTime().isBefore(train2.getMoveTime())) {
                return -1;
            }
            else if (train1.getMoveTime().isAfter(train2.getMoveTime())) {
                return 1;
            }
            else {
                return 0;
            }
        }
        else return result;
    }
}
