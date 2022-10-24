import java.awt.Polygon;
import java.util.Scanner;

/**
 * This class is meant to serve as the parent class (aka base class) for the
 * different shapes. The objective is to use inheritance and polymorphism to
 * streamline the code.
 *
 */

public class Shape {
    // Add any instance variables and methods here as you see fit.

    // Instance variable for x-position
    private int xpos;
    // Instance variable for y-position
    private int ypos;
    // Instance variable for height
    private int height;
    // Instance variable for width
    private int width;
    // String with color -- valid values are:
    // "red", "yellow", "green", and "blue"
    private String color;

    /**
     * Constructor to create a rectangle using information from the supplied
     * scanner. Input is read in the order x, y, width, height, and color.
     * 
     * @param num      Just some number associated with the shape.
     * @param keyboard The scanner from where the information for the shape is
     *                 to bread.
     */
    public Shape(int num, Scanner keyboard) {
        // Read data for the rectangle
        // from the given scanner object.
        xpos = keyboard.nextInt();
        ypos = keyboard.nextInt();
        width = keyboard.nextInt();
        height = keyboard.nextInt();
        color = keyboard.next();
        // Flush out trailing new line to read numbers next
        keyboard.nextLine();
    }

    /**
     * Obtain the area.
     * 
     * @return Return the area
     */
    public double getArea() {
        return width * height;
    }

    /**
     * Obtain color for the shape.
     * 
     * @return Return the color set when the shape was created
     */
    public String getColor() {
        return color;
    }

    /**
     * Obtain the vertices that can be used to draw this polygon.
     * 
     * @return The vertices associated with this shape.
     */
    public Polygon getVertices() {
        Polygon vertices = new Polygon();
        // Add vertex in clock-wise order.
        vertices.addPoint(xpos, ypos);
        vertices.addPoint(xpos + width, ypos);
        vertices.addPoint(xpos + width, ypos + height);
        vertices.addPoint(xpos, ypos + height);
        // Return the vertices for this shape
        return vertices;
    }

    public int getWidth() {
        return this.width;
    }

    public int getHeight() {
        return this.height;
    }

    public int getXpos() {
        return this.xpos;
    }

    public int getYpos() {
        return this.ypos;
    }

}
