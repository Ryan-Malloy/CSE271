/**
 * This class is a Unit testing class in which tests are to be added as features
 * are added to the Car class.
 */
public class CarTester {
    /**
     * The main method that is used to test the operations of the Car class.
     * 
     * @param args The arguments are currently not used.
     */
    public static void main(String[] args) {
        // AFTER writing your constructors...
        // Create a car using the two-parameter constructor
        // (make it a Toyota-Corolla with 10000 miles)
        Car toyota = new Car("Toyota-Corrolla", 10000);
        // Create a car using the one-parameter constructor
        // (make it a Ford)
        Car ford = new Car("Ford");
        // ------------------------------------------------
        // AFTER writing your getter methods ...
        // Print the make and mileage for each car:
        toyota.getMake();
        toyota.getMileage();
        ford.getMake();
        ford.getMileage();
        // ------------------------------------------------
        // AFTER writing the drive method ...
        // drive the first car FORWARD 223 miles
        toyota.drive(233);
        // drive the second car BACKWARD 20556 miles
        ford.drive(20556);
        // THEN, print the mileage of each car to verify
        // that it changed correctly.
        toyota.getMileage();
        ford.getMileage();

        // ------------------------------------------------
        // AFTER writing the honkHorn() method ...
        // make each car honk its horn.
        toyota.honkHorn();
        ford.honkHorn();
        // ------------------------------------------------
        // AFTER writing the toString() method in Task #5...
        // print the toString() for each car.
        toyota.toString();
        ford.toString();
    }
}
