\*7. Write a program to find greatest common divisor (GCD) or highest common factor (HCF) of given two numbers*/



import java.util.Scanner;

public class GCD {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two numbers from the user
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();

        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        // Calculate GCD/HCF
        int gcd = findGCD(num1, num2);

        // Print the result
        System.out.println("The GCD/HCF of " + num1 + " and " + num2 + " is: " + gcd);

        
    }

    
    public static int findGCD(int a, int b) {
        while (b != 0) {
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }
}

