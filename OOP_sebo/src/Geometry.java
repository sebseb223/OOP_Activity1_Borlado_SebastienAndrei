




public class Geometry extends MathOperation {
    private double radius;
    private double length;
    private double width;

    public void setRadius(double r) {
        if (r < 0) {
            System.out.println("Error: Radius cannot be negative.");
            this.radius = 0;
        } else {
            this.radius = r;
        }
    }

    
    public void setDimensions(double l, double w) {
        this.length = l;
        this.width = w;
    }

    // Circle Area
    public void areaCircle() {
        this.result = 3.1416 * (radius * radius);
    }
    
    // Circle Circumference
    public void circumferenceCircle() {
        this.result = 2 * 3.1416 * radius;
    }

    // Rectangle Area
    public void areaRectangle() {
        this.result = length * width;
    }
    
    // Rectangle Perimeter
    public void perimeterRectangle() {
        this.result = 2 * (length + width);
    }
}  
