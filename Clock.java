public class Clock {
    protected int hours;
    protected int minutes;

    public Clock(int hours, int minutes){
        if (hours > 24 || hours < 0)
            hours=0;

        if (minutes>60 || minutes<0)
            minutes=0;

        this.hours=hours;
        this.minutes=minutes;
    }

    @Override
    public boolean equals(Object other) {
        if (other instanceof AccurateClock || other == null){ //////////////
            return false;
        }
        Clock otherClock = (Clock) other;
        return (this.hours == otherClock.hours && this.minutes== otherClock.minutes);
    }

    @Override
    public int hashCode() {
        return 60 * hours + minutes;
    }

    @Override
    public String toString() {
        boolean singleHours = false;
        boolean singleMinutes = false;
        if (hours < 10)
            singleHours = true;
        if (minutes<10)
            singleMinutes = true;

        if (singleHours && singleMinutes)
            return "0"+hours+":0"+minutes;

        if(singleHours && !singleMinutes)
            return "0"+hours+":"+minutes;

        if(!singleHours && singleMinutes)
            return hours+":0"+minutes;

        return hours + ":" + minutes;
    }
}

