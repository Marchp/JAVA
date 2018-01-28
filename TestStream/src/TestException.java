import java.io.*;

public class TestException {
	
	public static void main(String [] args)
	{
		
		String [] s={"try","catch","finally"};
		System.out.println(s[2]);
		
		try {
			System.out.println(5/0);
			System.out.println(s[4]);
		}//同时尝试catch多个异常，一旦前面的异常被catch到，后面的catch将不会被执行，直接执行finally语句
		catch(ArithmeticException  e)
		{
			System.out.println(e.getMessage());//getMessage()只能得到简单的异常信息
			//e.printStackTrace();//打印出完整的异常信息，包括异常名称、异常信息、异常位置等
		}catch(ArrayIndexOutOfBoundsException ae) 
		{
			ae.printStackTrace();//由于前一个catch到了异常，所以这个异常被跳过
		}
		finally{
			System.out.println("finally一定会被执行！");
		}
		
	}

}
