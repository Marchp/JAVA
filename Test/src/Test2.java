/*calculate the number can be divided by 2 or 3 or 5 form 1-1001
 * @author Marchp
 * @Date 28 january 2018 
 */
public class Test2 {
	public static void main(String [] args)
	{
		int count=0;
		for(int i=1;i<=1001;i++)
		{
			if(i%2==0||i%3==0||i%5==0)
			{
				count++;
			}
		}
		System.out.println(count);
	}
}
