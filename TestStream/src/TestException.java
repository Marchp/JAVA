import java.io.*;

public class TestException {
	
	public static void main(String [] args)
	{
		
		String [] s={"try","catch","finally"};
		System.out.println(s[2]);
		
		try {
			System.out.println(5/0);
			System.out.println(s[4]);
		}//ͬʱ����catch����쳣��һ��ǰ����쳣��catch���������catch�����ᱻִ�У�ֱ��ִ��finally���
		catch(ArithmeticException  e)
		{
			System.out.println(e.getMessage());//getMessage()ֻ�ܵõ��򵥵��쳣��Ϣ
			//e.printStackTrace();//��ӡ���������쳣��Ϣ�������쳣���ơ��쳣��Ϣ���쳣λ�õ�
		}catch(ArrayIndexOutOfBoundsException ae) 
		{
			ae.printStackTrace();//����ǰһ��catch�����쳣����������쳣������
		}
		finally{
			System.out.println("finallyһ���ᱻִ�У�");
		}
		
	}

}
