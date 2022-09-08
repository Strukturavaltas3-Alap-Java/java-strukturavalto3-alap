package week07.day04.constoverload;

public class SimpleTime {

    private int hours;
    private int minutes;

    public SimpleTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    public SimpleTime(int hours) {
        this(hours,0);
    }

    public SimpleTime(SimpleTime simpleTime){
       this(simpleTime.getHours(),simpleTime.getMinutes());
    }

    public int getDifference(SimpleTime other){
        int thisInMinutes = this.convertSimpleTimeToMinutes();
        int otherInMinutes = other.convertSimpleTimeToMinutes();
        return thisInMinutes-otherInMinutes;
    }

    public int convertSimpleTimeToMinutes(){
        return  60*hours+minutes;
    }

    public int getHours() {
        return hours;
    }

    public int getMinutes() {
        return minutes;
    }

    @Override
    public String toString() {
        return "SimpleTime{" +
                "hours=" + hours +
                ", minutes=" + minutes +
                '}';
    }


}
