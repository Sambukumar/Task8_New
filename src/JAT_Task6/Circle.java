package JAT_Task6;

public class Circle {
	
	// Data member
	
    private float radius;

    // No-argument constructor
    public Circle() {
        this.radius = 1.0f; // Default radius
    }

    // Constructor with one argument
    public Circle(float radius) {
        this.radius = radius;
    }

    // Method to calculate circumference
    public float calculateCircumference() {
        return  (float) (2 * Math.PI * radius);
    }

    // Getter for radius
    public float getRadius() {
        return radius;
    }

    // Setter for radius
    public void setRadius(float radius) {
        this.radius = radius;
    }

    public static void main(String[] args) {
        Circle defaultCircle = new Circle();
        Circle customCircle = new Circle(5.0f);

        System.out.println("Default Circle Radius: " + defaultCircle.getRadius()); // Output: 1.0
        System.out.println("Default Circle Circumference: " + defaultCircle.calculateCircumference()); // Output: 6.283185307179586

        System.out.println("Custom Circle Radius: " + customCircle.getRadius()); // Output: 5.0
        System.out.println("Custom Circle Circumference: " + customCircle.calculateCircumference()); // Output: 31.41592653589794
    }

}
