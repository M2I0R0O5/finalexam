package finalexam.task4;

import java.util.ArrayList;
import java.util.List;

public class TravelAgency implements TravelOrganizer {
    private List<Trip> trips = new ArrayList<>();

    @Override
    public void addTrip(Trip trip) {
        trips.add(trip);
    }

    @Override
    public boolean removeTrip(Trip trip) {
        return trips.remove(trip);
    }

    @Override
    public List<Trip> getTrips() {
        return trips;
    }
}
