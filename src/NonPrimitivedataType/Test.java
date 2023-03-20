package NonPrimitivedataType;
import java.util.Scanner;
public class Test 
{
	public static void main(String args[])
	{
		Employee e[]=new Employee[2];
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<e.length;i++)
		{
			Employee e1=new Employee();
			System.out.println("Enter id");
			e1.setId(sc.nextInt());
			System.out.println("Enter name");
			e1.setName(sc.next());
			System.out.println("Enter add");
			e1.setAdd(sc.next());
			System.out.println("Enter mob");
			e1.setMob(sc.nextLong());
			e[i]=e1;
		}
		for(int i=0;i<e.length;i++)
		{
			System.out.println("Employee id="+" "+e[i].getId());
			System.out.println("Employee name="+" "+e[i].getName());
			System.out.println("Employee add="+" "+e[i].getAdd());
			System.out.println("Employee mob="+" "+e[i].getMob());
			
		}
	}

}
