package homeworks.hw1.scooter;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

/**
 * Represents a rental company that manages scooters.
 */
public class RentalCompany {
    public static void main(String[] args) {

    }

    private int uid = 0;
    private List<Scooter> scooters = new ArrayList<>();

    /**
     * Returns a list of available scooters.
     * @return List of available scooters.
     */
    public List<Scooter> availableScooters() {
        List<Scooter> result = new ArrayList<>();
        for (Scooter scooter : scooters) {
            if (scooter.isAvailable()) {
                result.add(scooter);
            }
        }
        return result;
    }

    /**
     * Adds a new scooter to the rental company.
     * @param scooter The scooter to be added.
     */
    public void addScooter(Scooter scooter) {
        scooter.setId(uid++);
        scooters.add(scooter);
    }

    /**
     * Removes a scooter from the rental company.
     * @param id The ID of the scooter to be removed.
     * @return True if the scooter was successfully removed, false otherwise.
     */
    public boolean removeScooter(int id) {
        Iterator<Scooter> iterator = scooters.iterator();
        while (iterator.hasNext()) {
            Scooter scooter = iterator.next();
            if (scooter.getId() == id) {
                iterator.remove();
                return true;
            }
        }
        return false;
    }

    /**
     * Rents a scooter with the specified ID.
     * @param id The ID of the scooter to be rented.
     */
    public void rentScooter(int id) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id && scooter.isAvailable()) {
                scooter.setAvailable(false);
                System.out.println("Scooter with ID " + id + " has been rented.");
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " is not available for rent.");
    }

    /**
     * Returns a rented scooter with the specified ID and updates its position.
     * @param id The ID of the scooter to be returned.
     * @param x The new X coordinate of the scooter's position.
     * @param y The new Y coordinate of the scooter's position.
     */
    public void returnScooter(int id, double x, double y) {
        for (Scooter scooter : scooters) {
            if (scooter.getId() == id) {
                scooter.setAvailable(true);
                scooter.setX(x);
                scooter.setY(y);
                System.out.println("Scooter with ID " + id + " has been returned.");
                return;
            }
        }
        System.out.println("Scooter with ID " + id + " cannot be returned.");
    }

    /**
     * Displays information about all scooters in the rental company.
     */
    public void displayAllScooters() {
        for (Scooter scooter : scooters) {
            System.out.println(scooter);
        }
    }
}

