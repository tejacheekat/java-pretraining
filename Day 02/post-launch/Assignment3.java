
\* 3. Take 20 integer inputs from user and print the following:
number of positive numbers
number of negative numbers
number of odd numbers
number of even numbers
number of 0s.*/

import java.util.Scanner;

public class Arraypositive {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int arraySize = 20;

        // Create an array to store the integers
        int[] integerArray = new int[arraySize];

        // Take 20 integer inputs from the user and store them in the array
        System.out.println("Enter 20 integers, one at a time:");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            
            
            int userInput = scanner.nextInt();

            
            integerArray[i] = userInput;
        }

        // Close the scanner to avoid resource leakage
        scanner.close();

        // Analyze the array and print the statistics
        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int number : integerArray) {
            // Count positive numbers
            if (number > 0) {
                positiveCount++;
            }
            // Count negative numbers
            else if (number < 0) {
                negativeCount++;
            }
            // Count zeros
            else {
                zeroCount++;
            }

            // Count odd and even numbers
            if (number % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        // Print the statistics
        System.out.println("\nNumber of positive numbers: " + positiveCount);
        System.out.println("Number of negative numbers: " + negativeCount);
        System.out.println("Number of odd numbers: " + oddCount);
        System.out.println("Number of even numbers: " + evenCount);
        System.out.println("Number of zeros: " + zeroCount);
    }
}
