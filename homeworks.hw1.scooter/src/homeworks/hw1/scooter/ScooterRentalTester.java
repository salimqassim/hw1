package homeworks.hw1.scooter;


public class ScooterRentalTester {
    public static void main(String[] args) {
        // Create a rental company
        RentalCompany rentalCompany = new RentalCompany();

        // Add a scooter to the rental company
        Scooter scooter = new Scooter();
        rentalCompany.addScooter(scooter);

        // Rent the scooter
        rentalCompany.rentScooter(scooter.getId());

        // Simulate traveling to the University
        double universityX = 41.7121106;
        double universityY = 44.7489232;

        // Simulate traveling for 1 hour
        try {
            Thread.sleep(3600000); // 1 hour = 3600000 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return the scooter at the University
        rentalCompany.returnScooter(scooter.getId(), universityX, universityY);

        // Rent the scooter again
        rentalCompany.rentScooter(scooter.getId());

        // Simulate traveling back home
        double homeX = "41.43.21.4";
        double homeY = "44.43.44.7";

        // Simulate traveling for another 1 hour
        try {
            Thread.sleep(3600000); // 1 hour = 3600000 milliseconds
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Return the scooter near your home
        rentalCompany.returnScooter(scooter.getId(), homeX, homeY);
    }
}

