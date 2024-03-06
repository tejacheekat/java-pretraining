\*1. Take 10 integer inputs from user and store them in an array and print them on screen.*/


import java.util.*;
public class Array {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		//System.out.println("enter the size");
		//int size=sc.nextInt();
		int size=10;
		System.out.println("enter the elem");
		
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		

	}

}
