\*8. Write a program to calculate the sum of the first and the second last digit of a 5 digit.
E.g.- NUMBER : 12345        OUTPUT : 1+4=5 
Input the number using scanner.*/


import java.util.Scanner;

public class Sumofvalue {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Enter a 5-digit number: ");
        
        
        String inputNumber = scanner.next();

       
        

        
        int number = Integer.parseInt(inputNumber);

        
        int firstDigit = Character.getNumericValue(inputNumber.charAt(0));
        int secondLastDigit = Character.getNumericValue(inputNumber.charAt(3));

        // Calculate the sum
        int sum = firstDigit + secondLastDigit;

        // Display the result
        System.out.println("Sum of the first and second last digit: " + sum);

        
    }
}


 