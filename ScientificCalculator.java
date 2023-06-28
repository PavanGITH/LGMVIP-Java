import java.util.Scanner;

public class ScientificCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Scientific Calculator");
            System.out.println("---------------------");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Division");
            System.out.println("5. Square Root");
            System.out.println("6. Exponentiation");
            System.out.println("0. Exit");
            System.out.println("---------------------");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();

            if (choice == 0) {
                System.out.println("Exiting the calculator...");
                break;
            }

            double num1, num2;
            double result = 0.0;

            switch (choice) {
                case 1:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 + num2;
                    break;
                case 2:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 - num2;
                    break;
                case 3:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 * num2;
                    break;
                case 4:
                    System.out.print("Enter the first number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the second number: ");
                    num2 = scanner.nextDouble();
                    result = num1 / num2;
                    break;
                case 5:
                    System.out.print("Enter the number: ");
                    num1 = scanner.nextDouble();
                    result = Math.sqrt(num1);
                    break;
                case 6:
                    System.out.print("Enter the base number: ");
                    num1 = scanner.nextDouble();
                    System.out.print("Enter the exponent: ");
                    num2 = scanner.nextDouble();
                    result = Math.pow(num1, num2);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    continue;
            }

            System.out.println("Result: " + result);
            System.out.println();
        }

        scanner.close();
    }
}
