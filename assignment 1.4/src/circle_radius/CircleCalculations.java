package circle_radius;
import java.util.Scanner;

public class CircleCalculations {
    public static void main(String[] args) {
    	
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the radius of the circle as an integer: ");
        int radius = scanner.nextInt();
        
        double pi = Math.PI;
        int diameter = 2 * radius;
        double circumference = 2 * pi * radius;
        double area = pi * radius * radius;

        System.out.println("\nCircle Calculations:");
        System.out.println("Diameter: " + diameter);
        System.out.printf("Circumference: %.2f\n", circumference); 
        System.out.printf("Area: %.2f\n", area); 
    }
}
