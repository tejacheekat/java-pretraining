\* 8. Consider an integer array, the number of elements in which is determined by the user. The elements are also taken as input from the user. Write a program to find those pair of elements that has the maximum and minimum difference among all element pairs.
HINT : 
maximum difference = higest-lowest
minimum difference = second lowest - lowest */



import java.util.Scanner;

public class Arraymaxmindifference {
    public static void main(String[] args) {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Get the number of elements in the array from the user
        System.out.print("Enter the number of elements in the array: ");
        int arraySize = scanner.nextInt();

        // Check if the array size is valid
        if (arraySize <= 1) {
            System.out.println("Please enter a valid array size (at least 2).");
            return;
        }

        // Create an array to store the integers
        int[] integerArray = new int[arraySize];

        // Take input for the array elements
        System.out.println("Enter the array elements:");
        for (int i = 0; i < arraySize; i++) {
            System.out.print("Enter element #" + (i + 1) + ": ");
            int userInput = scanner.nextInt();
            integerArray[i] = userInput;
        }

        // Close the scanner to avoid resource leakage
        scanner.close();

        // Find the pair of elements with maximum and minimum differences
        int maxDiffIndex1 = 0;
        int maxDiffIndex2 = 1;
        int minDiffIndex1 = 0;
        int minDiffIndex2 = 1;

        for (int i = 0; i < arraySize; i++) {
            for (int j = i + 1; j < arraySize; j++) {
                // Find pair with maximum difference
                if (Math.abs(integerArray[j] - integerArray[i]) > Math.abs(integerArray[maxDiffIndex2] - integerArray[maxDiffIndex1])) {
                    maxDiffIndex1 = i;
                    maxDiffIndex2 = j;
                }

                // Find pair with minimum difference
                if (Math.abs(integerArray[j] - integerArray[i]) < Math.abs(integerArray[minDiffIndex2] - integerArray[minDiffIndex1])) {
                    minDiffIndex1 = i;
                    minDiffIndex2 = j;
                }
            }
        }

        // Print the pair with maximum difference
        System.out.println("\nPair with Maximum Difference:");
        System.out.println("Element 1: " + integerArray[maxDiffIndex1] + ", Element 2: " + integerArray[maxDiffIndex2]);
        System.out.println("Maximum Difference: " + Math.abs(integerArray[maxDiffIndex2] - integerArray[maxDiffIndex1]));

        // Print the pair with minimum difference
        System.out.println("\nPair with Minimum Difference:");
        System.out.println("Element 1: " + integerArray[minDiffIndex1] + ", Element 2: " + integerArray[minDiffIndex2]);
        System.out.println("Minimum Difference: " + Math.abs(integerArray[minDiffIndex2] - integerArray[minDiffIndex1]));
    }
}
