package homeworks.hw1.scooter;

/**
 * Represents a scooter.
 */
public class Scooter {
    public static void main(String[] args) {

    }

    private int id;
    private String model;
    private int batteryLevel;
    private double x, y;
    private boolean available;

    /**
     * Gets the unique identifier of the scooter.
     * @return The ID of the scooter.
     */
    public int getId() {
        return id;
    }

    /**
     * Sets the unique identifier of the scooter.
     * @param id The ID of the scooter.
     */
    public void setId(int id) {
        this.id = id;
    }

    // Other getter and setter methods omitted for brevity...

    @Override
    public String toString() {
        return "Scooter{" +
                "id=" + id +
                ", model='" + model + '\'' +
                ", batteryLevel=" + batteryLevel +
                ", x=" + x +
                ", y=" + y +
                ", available=" + available +
                '}';
    }
}
