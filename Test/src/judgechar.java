import java.util.*;

public class judgechar {
	public static void main(String [] args)
	{
       Scanner s=new Scanner(System.in);
       System.out.println("������һ���ַ�����");
       String line=s.nextLine();
       
       int bignumber=0;
       int smallnumber=0;
       int othernumber=0;
       
       for(int i=0;i<line.length();i++)
       {
    	   char ch=line.charAt(i);
    	   if(ch>='A'&&ch<='Z')
    		   bignumber++;
    	   else if(ch>='a'&&ch<='z')
    		   smallnumber++;
    	   else 
    		   othernumber++;
       }
       
       System.out.println("���ַ����д�д��ĸ�ĸ���Ϊ"+bignumber);
       System.out.println("���ַ�����Сд��ĸ�ĸ���Ϊ"+smallnumber);
       System.out.println("���ַ����������ַ��ĸ���Ϊ"+othernumber);
		
	}

}
