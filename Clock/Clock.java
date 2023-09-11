package Clock;

public class Clock {
    private int minutes;
    private int hours;

    private int calc;
    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public void setHours(int hours) {
        this.hours = hours;
    }

    public void tick(){

        //hours
        calc = hours*60+minutes;

        this.calc-=1;

        if (calc==0){

            return;
        }

        this.hours=calc/60;
        this.minutes=calc%60;
    }
}
