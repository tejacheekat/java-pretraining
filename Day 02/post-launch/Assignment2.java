\*2. Take 10 integer inputs from user and store them in an array. Again ask user to give a number. Now, tell user whether that number is present in array or not.*/


public class Arrayuser {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the size");
		int size=sc.nextInt();
		int a[]=new int[size];
		
		for(int i=0;i<a.length;i++)
		{
			a[i]=sc.nextInt();
			
		}
		
		for(int i=0;i<a.length;i++)
		{
			System.out.println(a[i]);
		}
		
		System.out.println("search 1 elem");
		int elem=sc.nextInt();
		boolean finding=false;
		for(int i=0;i<a.length;i++)
		{
			if(elem==a[i])
			{
				finding=true;
				break;
			}
			
		}
		
		if(finding)
		{
			System.out.println(elem+":searching elem is present");
		}
		else
		{
			System.out.println(elem+":searching elem is not present");
		}

	}

}
