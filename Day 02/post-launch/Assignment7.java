\*7.Find largest and smallest elements of an array.*/

public class Arraymaxmin {

	public static void main(String[] args) {
		
		int a[]= {3,5,6,78,2,8,9};
		int max=a[0];
		int min=a[0];
		for(int i=0;i<a.length;i++)
		{
			if(max<a[i])
			{
				max=a[i];
			}
			if(min>a[i])
			{
				min=a[i];
			}
		}
		System.out.println(max);
		System.out.println(min);

	}

}
