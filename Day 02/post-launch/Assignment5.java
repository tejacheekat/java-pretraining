\*5. Write a program to find the sum and product of all elements of an array.*/


public class Arraysum {

	public static void main(String[] args) {
		int a[]= {1,2,3,4,5,6,7,8,9,10};
		int sum=0;
		int prod=1;
		for(int i=0;i<a.length;i++)
		{
			sum=sum+a[i];
			prod=prod*a[i];
		}
		System.out.println(sum);
		System.out.println(prod);

	}

}