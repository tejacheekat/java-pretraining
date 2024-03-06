\*8. A three digit number is called Armstrong number if sum of cube of its digit is equal to number itself.
E.g.- 153 is an Armstrong number because (13)+(53)+(33) = 153.
Write all Armstrong numbers between 100 to 500.*/



public class Armstrong {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 500:");

        for (int i = 100; i <= 500; i++) {
            if (isArmstrongNumber(i)) {
                System.out.println(i);
            }
        }
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int originalNumber = number;
        int sum = 0;

        while (number > 0) {
            int digit = number % 10;
            sum += Math.pow(digit, 3);
            number /= 10;
        }

        return sum == originalNumber;
    }
}
