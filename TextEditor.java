import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class TextEditor {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String filename;

        System.out.println("Text Editor");
        System.out.println("-------------------------");

        while (true) {
            System.out.println("1. Open File");
            System.out.println("2. Create New File");
            System.out.println("0. Exit");
            System.out.println("-------------------------");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            if (choice == 0) {
                System.out.println("Exiting the text editor...");
                break;
            }

            switch (choice) {
                case 1:
                    System.out.print("Enter the filename: ");
                    filename = scanner.nextLine();
                    openFile(filename);
                    break;
                case 2:
                    System.out.print("Enter the filename: ");
                    filename = scanner.nextLine();
                    createFile(filename);
                    break;
                default:
                    System.out.println("Invalid choice. Please try again.");
                    break;
            }

            System.out.println();
        }

        scanner.close();
    }

    public static void openFile(String filename) {
        try {
            BufferedReader reader = new BufferedReader(new FileReader(filename));
            String line;
            System.out.println("File Contents:");
            System.out.println("-------------------------");
            while ((line = reader.readLine()) != null) {
                System.out.println(line);
            }
            reader.close();
        } catch (IOException e) {
            System.out.println("Error opening the file: " + e.getMessage());
        }
    }

    public static void createFile(String filename) {
        try {
            BufferedWriter writer = new BufferedWriter(new FileWriter(filename));
            Scanner scanner = new Scanner(System.in);
            System.out.println("Enter text (press Enter on an empty line to finish):");
            String line;
            while (true) {
                line = scanner.nextLine();
                if (line.isEmpty()) {
                    break;
                }
                writer.write(line);
                writer.newLine();
            }
            writer.close();
            System.out.println("File created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating the file: " + e.getMessage());
        }
    }
}
