import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("1. Convert USD to INR");
        System.out.println("2. Convert INR to USD");
        System.out.print("Enter your choice (1 or 2): ");
        int choice = scanner.nextInt();

        double usdToInrRate = 74.50;  // Conversion rate: 1 USD = 74.50 INR
        double inrToUsdRate = 0.013;  // Conversion rate: 1 INR = 0.013 USD

        switch (choice) {
            case 1:
                System.out.print("Enter the amount in USD: ");
                double usdAmount = scanner.nextDouble();
                double inrAmount = usdAmount * usdToInrRate;
                System.out.println("Equivalent amount in INR: " + inrAmount);
                break;

            case 2:
                System.out.print("Enter the amount in INR: ");
                double inrAmount2 = scanner.nextDouble();
                double usdAmount2 = inrAmount2 * inrToUsdRate;
                System.out.println("Equivalent amount in USD: " + usdAmount2);
                break;

            default:
                System.out.println("Invalid choice!");
                break;
        }

        scanner.close();
    }
}
