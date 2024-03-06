\*5. 
Print the following patterns using loop :
a.
*
**
***
****
 
b.
1010101
10101 
  101  
   1   */




A.
import java.util.*;
public class Pattern {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the rows");
		int rows=sc.nextInt();
		System.out.println("enter the cols");
		int cols=sc.nextInt();
		
		for(int i=1;i<=rows;i++)
		{
			for(int j=1;j<=cols;j++)
			{
				if(i>=j)
				{
					System.out.print("*");
				}
			}
			System.out.println();
		}
		

	}

}


B.
public class Pattern2 {
    public static void main(String[] args) {
        int rows = 4;

        for (int i = 1; i <= rows; i++) {
            // Print spaces
            for (int j = 1; j < i; j++) {
                System.out.print(" ");
            }

            // Print 1s and 0s
            for (int k = 1; k <= rows - i + 1; k++) {
                if (k % 2 == 0) {
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
            }

            System.out.println();
        }
    }
}




