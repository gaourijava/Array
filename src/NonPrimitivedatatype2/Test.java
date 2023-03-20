package NonPrimitivedatatype2;
import java.util.Scanner;
public class Test 
{
	public static void main(String args[])
	{
		Company c[]=new Company[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<c.length;i++)
		{
			Company c1=new Company();
			System.out.println("Enter Company id");
			c1.setId(sc.nextInt());
			System.out.println("Enter Company name");
			c1.setName(sc.next());
			System.out.println("Enter Company Add");
			c1.setAdd(sc.next());
			System.out.println("Enter Company Location");
			c1.setLocation(sc.next());
			c[i]=c1;
		}
		for(int i=0; i<c.length;i++)
		{
			System.out.println("Enter Company id="+" "+c[i].getId());
			System.out.println("Enter Company name="+" "+c[i].getName());
			System.out.println("Enter Company add="+" "+c[i].getAdd());
			System.out.println("Enter Company location="+" "+c[i].getLocation());
		}
			
		
	}

}
