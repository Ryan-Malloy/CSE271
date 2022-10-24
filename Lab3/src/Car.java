/**
 * A class that interacts with the CarTester file.
 * 
 * @author RyanMalloy
 *
 */

public class Car {

    /**
     * This instance variable is used to maintain the make of a "Car" object.
     */
    private String make;

    /**
     * This instance variable is used to track the distance (in miles) that a
     * car has traveled.
     */
    private int mileage;

    /**
     * This constructor initializes the make and mileage of the Car object to
     * the corresponding values specified as parameters.
     * 
     * @param theMake    String value, make of the car.
     * @param theMileage int value, mileage of the car.
     */
    public Car(String theMake, int theMileage) {
        this.make = theMake;
        this.mileage = theMileage;
    }

    /**
     * This constructor initializes the make of the value supplied as parameter
     * and initialize mileage to zero.
     * 
     * @param theMake String value, make of the car, sets mileage to zero.
     */
    public Car(String theMake) {
        this.make = theMake;
    }

    /**
     * Method returns the make of the Car.
     */
    public String getMake() {
        return make;
    }

    /**
     * Method returns the mileage of the Car.
     */
    public int getMileage() {
        return mileage;
    }

    /**
     * This adds the given distance to the current mileage of the car. The
     * distance value can be positive or negative (for driving in reverse) and
     * needs to be suitable handled to always increase the mileage by the given
     * distance.
     * 
     * @param distance int value, distance driven
     */
    public void drive(int distance) {
        mileage += Math.abs(distance);
    }

    /**
     * This method prints the make of the car followed by the phrase ": beep".
     */
    public void honkHorn() {
        System.out.println(make + ": beep");
    }

    /**
     * This method returns a single string that has the make and mileage value.
     * 
     * @return a new string.
     */
    public String toString() {
        return (make + ": " + mileage);
    }
}