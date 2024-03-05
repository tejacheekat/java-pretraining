\*Write a program to calculate the sum of the digits of a 3-digit number.
Number : 132        Output : 6
Input the number using scanner.*/


import java.util.*;
public class Digit {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the num");
		int num=sc.nextInt();
		
		int sum=0;
		while(num>0)
		{
			int rem=num%10;
			 sum=sum+rem;
			 num=num/10;
			
		}
		System.out.println(sum);
		

	}

}

 