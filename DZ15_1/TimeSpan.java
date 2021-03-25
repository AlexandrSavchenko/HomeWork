package com.company;

public class TimeSpan {

    private int hours;
    private int minutes;

    public TimeSpan(int hours, int minutes) {
        if (minutes > 59 || hours < 0 || minutes < 0) {
            throw new IllegalArgumentException("Некорректные значения");
        }
        this.hours = hours;
        this.minutes = minutes;
    }

    private void setTimeSpanFromMinutes(int minutes) {
        this.hours = minutes / 60;
        this.minutes = minutes % 60;
    }

    public void add(TimeSpan timeSpan) {
        setTimeSpanFromMinutes(convertTimeToMinutes() + timeSpan.convertTimeToMinutes());
    }

    public void sub(TimeSpan timeSpan) {
        if (convertTimeToMinutes() - timeSpan.convertTimeToMinutes() < 0) {
            throw new IllegalArgumentException("Некорректные значения");
        }

        setTimeSpanFromMinutes(convertTimeToMinutes() - timeSpan.convertTimeToMinutes());
    }

    public void mult(double times) {
        setTimeSpanFromMinutes(
                (int) Math.round(Integer.valueOf(convertTimeToMinutes()) * times));
    }

    @Override
    public String toString() {
        return "TimeSpan{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }

    private int convertTimeToMinutes() {
        int timeInMinutes = hours * 60 + minutes;
        return timeInMinutes;
    }
}

