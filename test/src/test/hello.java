package test;
public class hello {
    // Fields or instance variables
    String color;
    String model;
    int year;

    // Constructor with parameters
    public hello(String color, String model, int year) {
        this.color = color;
        this.model = model;
        this.year = year;
    }

    // Method to display car details
    public void displayInfo() {
        System.out.println("Car Model: " + model);
        System.out.println("Color: " + color);
        System.out.println("Year: " + year);
    }

    
}







