package hafta5;

import java.util.Scanner;

public class InputValidation {

    public static int getValidInt(Scanner scanner, String prompt, int min, int max) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextInt()) {
                int val = scanner.nextInt();
                if (val >= min && val <= max) {
                    scanner.nextLine(); // Clear the leftover "Enter" key from the buffer
                    return val;
                } else {
                    System.out.printf("Error: Number must be between %d and %d.\n", min, max);
                }
            } else {
                System.out.println("Error: That is not a valid whole number.\n");
                scanner.next(); 
            }
        }
    }

    public static double getValidDouble(Scanner scanner, String prompt, double min, double max) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextDouble()) {
                double val = scanner.nextDouble();
                if (val >= min && val <= max) {
                    scanner.nextLine(); // Clear the leftover "Enter" key
                    return val;
                } else {
                    System.out.printf("Error: Decimal must be between %f and %f.\n", min, max);
                }
            } else {
                System.out.println("Error: That is not a valid decimal number.\n");
                scanner.next(); 
            }
        }
    }

    public static boolean getValidBoolean(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            if (scanner.hasNextBoolean()) {
                boolean val = scanner.nextBoolean();
                scanner.nextLine(); // Clear the leftover "Enter" key
                return val;
            } else {
                System.out.println("Error: Please enter 'true' or 'false'.\n");
                scanner.next(); 
            }
        }
    }

    public static String getValidString(Scanner scanner, String prompt) {
        while (true) {
            System.out.print(prompt);
            String text = scanner.nextLine();
            
            if (!text.trim().isEmpty()) {
                return text;
            }
            System.out.println("Error: Input cannot be empty.\n");
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // The code is now completely type-safe. No casting, no null parameters.
        int age = getValidInt(scanner, "Enter age (0-120): ", 0, 120);
        double weight = getValidDouble(scanner, "Enter weight (in kg): ", 1.0, 500.0);
        boolean isStudent = getValidBoolean(scanner, "Are you a student? (true/false): ");
        String name = getValidString(scanner, "Enter your name: ");
        
        System.out.println("\n--- RESULTS ---");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        System.out.println("Weight: " + weight);
        System.out.println("Student: " + isStudent);
        
        scanner.close();
    }
}