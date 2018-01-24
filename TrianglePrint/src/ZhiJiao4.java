
public class ZhiJiao4 {
/**
* print a triangle in the console,it's horn on the right form bottom
* @name ZhiJiao4
* @author Marchp  
 * @version 24 January 2018
*/
	public static void main(String []args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=i-1;j++)
			{
				System.out.print("   ");
			}
			for(int k=1;k<=6-i;k++)
			{
				System.out.print(" * ");
			}
			System.out.println();
		}
	}
}
