public class Clock {
    protected int hours;
    protected int minutes;

    public Clock(int hours, int minutes){
        this.hours=hours;
        this.minutes=minutes;
    }

    @Override
    public boolean equals(Object other) {
        Clock otherClock = (Clock) other;
        if (other instanceof AccurateClock){ //////////////
            return false;
        }
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

