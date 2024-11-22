package mathoperations;

public class MathOperations {
 public int sum(int a, int b) {
     return a + b;
 }

 public int product(int a, int b) {
     return a * b;
 }

 public int difference(int a, int b) {
     return a - b;
 }

 public double quotient(int a, int b) {
     if (b == 0) {
         throw new ArithmeticException("Division by zero is not allowed.");
     }
     return (double) a / b;
 }
}

 public static void main(String[] args) {
     Scanner scanner = new Scanner(System.in);

     System.out.print("Enter the first integer: ");
     int num1 = scanner.nextInt();

     System.out.print("Enter the second integer: ");
     int num2 = scanner.nextInt();

     // Create an instance of MathOperations
     MathOperations mathOps = new MathOperations();

     // Perform operations
     int sum = mathOps.sum(num1, num2);
     int product = mathOps.product(num1, num2);
     int difference = mathOps.difference(num1, num2);
     double quotient = 0;

     try {
         quotient = mathOps.quotient(num1, num2);
     } catch (ArithmeticException e) {
         System.out.println(e.getMessage());
     }

     // Display results
     System.out.println("\nResults:");
     System.out.println("Sum: " + sum);
     System.out.println("Product: " + product);
     System.out.println("Difference: " + difference);
     if (num2 != 0) {
         System.out.println("Quotient: " + quotient);
     }
 }


