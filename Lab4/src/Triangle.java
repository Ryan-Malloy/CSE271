import java.awt.Polygon;
import java.util.Scanner;

/**
 * A simple triangle class.
 */
public class Triangle extends Shape {
    /**
     * Constructor to create a triangle using information from the supplied
     * scanner. Input is read in the order x, y, width, height, and color.
     * 
     * @param num      Just some number associated with the shape.
     * @param keyboard The scanner from where the information for the shape is
     *                 to bread.
     */
    public Triangle(int num, Scanner keyboard) {
        super(num, keyboard);
    }

    public Polygon getVertices() {
        Polygon vertices = new Polygon();
        // Add vertex in clock-wise order.
        vertices.addPoint(getXpos() + (getWidth() / 2), getYpos());
        vertices.addPoint(getXpos() + getWidth(), getYpos() + getHeight());
        vertices.addPoint(getXpos(), getYpos() + getHeight());
        return vertices;
    }

    /**
     * Obtain the area.
     * 
     * @return Return the area
     * 
     * @override
     */
    public double getArea() {
        return (getWidth() * getHeight()) / 2;
    }
}
