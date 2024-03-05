\*3. Write a program to add 8 to the number 2345 and then divide it by 3. Now, the modulus of the quotient is taken with 5 and then multiply the resultant value by 5. Display the final result.*/


public class Adding {

	public static void main(String[] args) {
		int a=2345;
		//add 8 to the number
		a+=8;
		//divided  the num by 3
		int quotient =a/3;
		// Take the modulus of the quotient with 5
        int remainder = quotient % 5;

        // Multiply the remainder by 5
        int result = remainder * 5;

        // Display the final result
        System.out.println("Final Result: " + result);

	}

}