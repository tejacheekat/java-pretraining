\*Input the marks of Robert in three subjects using Scanner (each out of 100 ), write a program to calculate his total marks and percentage marks.*/



import java.util.*;
public class Robert {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the telugu marks");
		int a=sc.nextInt();
		System.out.println("enter the english marks");
		int b=sc.nextInt();
		System.out.println("enter the maths marks");
		int c=sc.nextInt();
		int d=a+b+c;
		
		System.out.println("total 3 subject marks of robert is:"+d);

	}

}