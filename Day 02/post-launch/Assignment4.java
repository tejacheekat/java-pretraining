\*4. Take 10 integer inputs from user and store them in an array. Now, copy all the elements in an another array but in reverse order.*/


import java.util.Scanner;

public class Arrayreverse1 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        
        int arraySize = 10;

        // Create an array to store the integers
        int[] originalArray = new int[arraySize];
        int[] reversedArray = new int[arraySize];

        // Take 10 integer inputs from the user and store them in the original array
        System.out.println("Enter 10 integers, one at a time:");

        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter integer #" + (i + 1) + ": ");
            
            // Read the integer input from the user
            int userInput = scanner.nextInt();

            // Store the input in the original array
            originalArray[i] = userInput;
        }

        // Close the scanner to avoid resource leakage
        scanner.close();

        // Copy elements from the original array to the reversed array in reverse order
        for (int i = 0; i < arraySize; i++) {
            reversedArray[i] = originalArray[arraySize - 1 - i];
        }

        // Print the original array
        System.out.println("\nOriginal Array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(originalArray[i] + " ");
        }

        // Print the reversed array
        System.out.println("\nReversed Array:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}
