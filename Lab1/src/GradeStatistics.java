
/**
 * A simple Java program to print basic statistics about a set of
 * numbers read from a data file.  
 */

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class provides a simple Java program to compute the mean, minimum, and
 * maximum values from a text file.
 *
 */
public class GradeStatistics {
    // ------------------------------------------------------------
    // The first 3 methods are already implemented for you as part
    // of the starter code for this lab.
    //
    // NOTE: You are expected to add Javadoc comments to the first
    // 2 methods (i.e., populateGrades & printStatistics) in
    // this class.
    // ------------------------------------------------------------

    /**
     * Get the file process from the user and read the data from the file. 
     * Creates temporary array list to load the file and converts into list.
     * 
     * @return The values from the read file
     */
    public static double[] populateGrades() throws Exception {
        try (Scanner keyboard = new Scanner(System.in)) {
            // Get the file to process from the user
            System.out.print("Enter name of data file to process: ");
            final String fileName = keyboard.next();

            // Now read data from the data file.
            Scanner dataFile = new Scanner(new File(fileName));
            // Use a temporary array list to make loading an "unknown"
            // number of values. If we knew the number of values in the
            // data file, then we can directly use an array instead of an
            // ArrayList
            ArrayList<Double> grades = new ArrayList<>();
            // Load all the grades from the data file
            while (dataFile.hasNextDouble()) {
                grades.add(dataFile.nextDouble());
            }
            // Close the data file.
            dataFile.close();

            // Convert array list to an array
            double[] values = new double[grades.size()];
            for (int i = 0; (i < grades.size()); i++) {
                values[i] = grades.get(i);
            }
            return values;
        }
    }
    
    /**
     * Prints the statistics about the given file, them being the mean
     * maximum and minimum values.
     * 
     * @param mean The average value in the given array of values.
     * @param minMax The maximum and minimum values in the 
     *               given array of values.              
     * 
     * @return The mean, maximum and minimum values in the 
     *         given array of values.
     */
    public static void printStatistics(double mean, double[] minMax) {
        // Use printf statements to format the decimal places correctly
        System.out.printf("Mean = %.1f", mean);
        System.out.printf("%nMin = %.1f Max = %.1f", minMax[0], minMax[1]);
        System.out.println("");
    }

    /**
     * The main method that calls various methods in this class to perform
     * different tasks.
     * 
     * @param args The command-line arguments. The are not used.
     */
    public static void main(String[] args) throws Exception {
        // We need to store the return of the populateGrades() method to an
        // array
        // This way, we can use this new array for the remainder of the methods
        //double[] grades = populateGrades();

        // Print the grades before sorting
        //System.out.print("The grades are: ");
        //printGrades(grades);

        // We can call methods in the argument list of another method call to
        // save lines
        // The return values are used as inputs into the printStatistics()
        // method
        //printStatistics(getMean(grades), getMinMax(grades));
        
        B b = new B();
        A a = new A();
        System.out.println(a.getOne());
        System.out.println(a.getTwo());
    }

    public class A {
        public int getOne() {
            return 1;
        }
        public static int getTwo() {
            return 2;
        }
    }
    
    public class B extends A {
        public int getOne() {
            return 3;
        }
        public static int getTwo() {
            return 4;
        }
    }
    // ------------------------------------------------------------
    // Using lab instructions, implement the following 3 methods
    // If you are stuck at any of these methods for more than 6
    // minutes, ensure you seek help right away. Don't delay!
    // ------------------------------------------------------------

    /**
     * Method to print the list of grades separated by a comma. Each grade is
     * separated by a blank space. For example given the array { 1.23, 2.47,
     * 5.3321} this method prints them as "1.2, 2.5, 5.3".
     * 
     * @see printStatistics
     * 
     * @param grades The array of grades to be printed. This array cannot be
     *               null and must have at least one element.
     */
    public static void printGrades(double[] grades) {
        for (int i = 0;  i < grades.length; i++) {
            if (i == grades.length - 1) {
                System.out.printf("%.1f", grades[i]);
            } else {
                System.out.printf("%.1f, ", grades[i]);
            }
        }
        System.out.println("");
        
        // Implement this method using instructions from the
        // lab notes.
    }

    /**
     * Compute the average of all the grades supplied to this method. This
     * method adds all the grades to find total sum. It then divides the sum by
     * the number of entries to compute the average.
     * 
     * @param grades The array of grades whose average is to be computed. This
     *               array cannot be null and must have at least one element.
     * 
     * @return The average of the grades in the given array of values.
     */
    public static double getMean(double[] grades) {
        // Implement this method using lab notes.
        double sum = 0.0;
        for (int i = 0; i < grades.length; i++) {
            sum += grades[i];
        }
        
        double mean = sum / (grades.length);
        
        return (mean);
        
       
    }

    /**
     * This method computes and returns the minimum and maximum values in the
     * list of grades. This method assumes that the grades are unsorted (i.e.,
     * the values in the array are in no specific order).
     * 
     * @param grades The array of grades whose average is to be computed. This
     *               array cannot be null and must have at least one element.
     * 
     * @return The minimum and maximum (in this specific order) values from the
     *         array of grades.
     */
    public static double[] getMinMax(double[] grades) {
        // Initialize min and max variables with some initial value.
        double min = grades[0], max = grades[0];

        // Compute the minimum and maximum using a loop
        for (int i = 0; i < grades.length; i++) {
            if (grades[i] > max) {
                max = grades[i];
            } else if (grades[i] < min) {
                min = grades[i];
            }
        }
        // Return the pair of values in specific order.
        return new double[] { min, max };
        
    }
}
