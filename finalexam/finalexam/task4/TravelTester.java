package finalexam.task4;

import java.util.List;

public class TravelTester {
    public static void main(String[] args) {
        // Create an instance of TravelAgency
        TravelAgency travelAgency = new TravelAgency();

        // Create some Trip instances
        Trip trip1 = new Trip("Paris", 5);
        Trip trip2 = new Trip("Tokyo", 7);
        Trip trip3 = new Trip("New York", 4);

        // Add trips to the travel agency
        travelAgency.addTrip(trip1);
        travelAgency.addTrip(trip2);
        travelAgency.addTrip(trip3);

        // Print all trips
        System.out.println("All Trips:");
        printTrips(travelAgency.getTrips());

        // Remove trip2
        travelAgency.removeTrip(trip2);

        // Print updated trips
        System.out.println("\nAfter removing trip2:");
        printTrips(travelAgency.getTrips());
    }

    private static void printTrips(List<Trip> trips) {
        for (Trip trip : trips) {
            System.out.println(trip);
        }
    }
}
