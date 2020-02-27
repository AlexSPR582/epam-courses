package epam.courses.module4.simpleClasses.task4.train;

import java.time.LocalTime;

public class Train {
    private String destinationName;
    private int trainNumber;
    private LocalTime moveTime;

    public Train(String destination, int trainNumber, String moveTime){
        this.destinationName = destination;
        this.trainNumber = trainNumber;
        this.moveTime = LocalTime.parse(moveTime);
    }

    public String getDestinationName() {
        return destinationName;
    }

    public void setDestinationName(String destinationName) {
        this.destinationName = destinationName;
    }

    public int getTrainNumber() {
        return trainNumber;
    }

    public void setTrainNumber(int trainNumber) {
        this.trainNumber = trainNumber;
    }

    public LocalTime getMoveTime() {
        return moveTime;
    }

    public void setMoveTime(LocalTime moveTime) {
        this.moveTime = moveTime;
    }
}
