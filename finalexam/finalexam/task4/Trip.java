package finalexam.task4;

public class Trip {
    private String destination;
    private int duration; // duration in days

    public Trip(String destination, int duration) {
        this.destination = destination;
        this.duration = duration;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public int getDuration() {
        return duration;
    }

    public void setDuration(int duration) {
        this.duration = duration;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "destination='" + destination + '\'' +
                ", duration=" + duration +
                '}';
    }
}
