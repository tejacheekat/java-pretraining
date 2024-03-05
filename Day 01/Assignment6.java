\*6. Write a program to convert Fahrenheit into Celsius. Input the value using scanner.*/

import java.util.Scanner;

public class FahrenheitToCelsiusConverter {
    public static void main(String[] args) {
        // Create a Scanner object to take input
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter the temperature in Fahrenheit
        System.out.print("Enter temperature in Fahrenheit: ");

        // Read the input as a double
        double fahrenheit = scanner.nextDouble();

        // Close the Scanner to avoid resource leak
        scanner.close();

        // Convert Fahrenheit to Celsius
        double celsius = (fahrenheit - 32) * 5/9;

        // Display the result
        System.out.println("Temperature in Celsius: " + celsius);
    }
}
