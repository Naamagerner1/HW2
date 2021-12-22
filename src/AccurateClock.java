public class AccurateClock extends Clock{
    private int seconds;


    public AccurateClock(int hours, int minutes, int seconds){
        super(hours,minutes);
        this.seconds=seconds;
    }

    @Override
    public boolean equals(Object other) {
        AccurateClock otherClock = (AccurateClock) other;
        if (other instanceof Clock)
            return false;
        return (this.hours == otherClock.hours && this.minutes== otherClock.minutes
                && this.seconds== otherClock.seconds);
    }

    @Override
    public int hashCode() {
        return 60 * hours + 60 * minutes + seconds;
    }

    @Override
    public String toString() {
        String fromClock = super.toString();
        if (seconds<10)
            return fromClock + ":0" + seconds;

        return fromClock + ":" + seconds;
    }
}
