 
public class CountChar {
	public static void main(String [] args)
	{
		String s="asdJAVAsadJAVAoaks";
		String str="JAVA";
		int count=0;
		int index=-1;
		
		while(s.indexOf(str)!=-1)
		{		
			s=s.substring(index+str.length());
			count++;
		}
		
		System.out.println("���ַ�����'JAVA'���ֵĴ���Ϊ:"+count);
	}

}
