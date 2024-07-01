package finalexam.task4;

import java.util.List;

public interface TravelOrganizer {
    void addTrip(Trip trip);
    boolean removeTrip(Trip trip);
    List<Trip> getTrips();
}
