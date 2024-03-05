\*Suppose the values of variables 'a' and 'b' are 6 and 8 respecrtively, write two programs to swap the values of the two variables.
A - first program by using a third variable
B - second program without using any third variable*/


A.public class Swap1 {

	public static void main(String[] args) {
		int a=6;
		int b=8;
		System.out.println("before swapping");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		int temp=a;
		     a=b;
		     b=temp;
		System.out.println("after swapping");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);

	}

}


B.public class Swap2 {

	public static void main(String[] args) {
		int a=6;
		int b=8;
		System.out.println("before swapping ");
		System.out.println("value of a is:"+a);
		System.out.println("value of b is:"+b);
		
		 a=a+b;
		 b=a-b;
		 a=a-b;
		 
		 System.out.println("before swapping ");
			System.out.println("value of a is:"+a);
			System.out.println("value of b is:"+b);
			
		 
		 

	}

}
