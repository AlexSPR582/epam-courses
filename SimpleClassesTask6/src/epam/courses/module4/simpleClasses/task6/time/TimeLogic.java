package epam.courses.module4.simpleClasses.task6.time;

public class TimeLogic {
    private static TimeLogic timeLogic;

    private TimeLogic() {}

    public static TimeLogic getInstance() {
        if (timeLogic == null) {
            timeLogic = new TimeLogic();
        }
        return timeLogic;
    }

    public void increaseHours(int hours, Time time) {
        time.setHours(time.getHours() + hours);
    }

    public void reduceHours(int hours, Time time) {
        if (time.getHours() - hours >= 0) {
            time.setHours(time.getHours() - hours);
        }
        else {
            zeroing(time);
        }
    }

    public void increaseMinutes(int minutes, Time time) {
        int allMinutes = minutes + time.getMinutes();
        increaseHours(allMinutes / 60, time);
        time.setMinutes(allMinutes % 60);
    }

    public void reduceMinutes(int minutes, Time time) {
        int allMinutes = time.getHours() * 60 + time.getMinutes() - minutes;
        if (allMinutes >= 0) {
            time.setHours(allMinutes / 60);
            time.setMinutes(allMinutes % 60);
        }
        else {
            zeroing(time);
        }
    }

    public void increaseSeconds(int seconds, Time time) {
        int allSeconds = time.getHours() * 3600 + time.getMinutes() * 60
                + time.getSeconds() + seconds;
        int newHours = allSeconds / 3600;
        int newMinutes = (allSeconds - newHours * 3600) / 60;
        int newSeconds = (allSeconds - newHours * 3600) % 60;
        time.setHours(newHours);
        time.setMinutes(newMinutes);
        time.setSeconds(newSeconds);
    }

    public void reduceSeconds(int seconds, Time time) {
        int allSeconds = time.getHours() * 3600 + time.getMinutes() * 60
                + time.getSeconds() - seconds;
        int newHours = allSeconds / 3600;
        int newMinutes = (allSeconds - newHours * 3600) / 60;
        int newSeconds = (allSeconds - newHours * 3600) % 60;
        time.setHours(newHours);
        time.setMinutes(newMinutes);
        time.setSeconds(newSeconds);
    }

    public void zeroing(Time time) {
        time.setHours(0);
        time.setMinutes(0);
        time.setSeconds(0);
    }

    public void printTime(Time time) {
        System.out.println(time.getHours() + " ч. "
                + time.getMinutes() + " мин. "
                + time.getSeconds() + " сек. ");
    }
}
