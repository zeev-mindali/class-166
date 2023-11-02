package simple_jave.Clock.cls;

import simple_jave.cls.cls.SimpleClass;

public class Clock {
    public SimpleClass s1;
    private int hour;
    private int minutes;

    public final static int HOUR=24;
    public final static int MINUTUES=60;

    private static boolean is24=true;

    public Clock(int hour, int minutes) {
        this.hour = hour;
        this.minutes = minutes;
    }

    public Clock(Clock other){
        this.hour=other.hour;
        this.minutes=other.minutes;
    }

    public int getHour() {
        return hour;
    }

    public void setHour(int hour) {
        this.hour = hour;
    }

    public int getMinutes() {
        return minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public static boolean getIs24() {
        return is24;
    }

    public static void setIs24(boolean is24) {
        Clock.is24 = is24;
    }

    @Override
    public String toString() {
        return "simple_jave.Clock{" +
                "hour=" + (is24?hour:hour%12) +
                ", minutes=" + minutes +
                '}';
    }
}
