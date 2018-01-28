
public class Test1 {
    public static void main(String []args)
    {
	System.out.println(2.0-1.1);
	//float number are not suitable for calculating no roundoff error
    System.out.println(3.3/0);
    //float number divided by zero will become infinity or NAN 
    //integer divided zero will produce an exception
    System.out.println(15.0/3);
	}
}
