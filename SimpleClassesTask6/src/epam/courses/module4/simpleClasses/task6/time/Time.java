package epam.courses.module4.simpleClasses.task6.time;

public class Time {
    private int hours = 0;
    private int minutes = 0;
    private int seconds = 0;

    public  Time(){}

    public Time(int hours, int minutes, int seconds) {
        setHours(hours);
        setMinutes(minutes);
        setSeconds(seconds);
    }

    public void setHours(int hours) {
        if (hours >= 0){
            this.hours = hours;
        }
        else {
            this.hours = 0;
        }
    }

    public void setMinutes(int minutes) {
        if (minutes >= 0 && minutes < 60){
            this.minutes = minutes;
        }
        else {
            this.minutes = 0;
        }
    }

    public void setSeconds(int seconds) {
        if (seconds >= 0 && seconds < 60){
            this.seconds = seconds;
        }
        else {
            this.seconds = 0;
        }
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    public int getSeconds() {
        return seconds;
    }
}
