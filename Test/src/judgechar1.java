import java.util.Scanner;

public class judgechar1 {
	public static void main(String [] args)
	{
       Scanner s=new Scanner(System.in);
       System.out.println("������һ���ַ�����");
       String line=s.nextLine();
       
       String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String s2="abcdefghijklmnopqrstuvw��yz";
       
       int bignumber=0;
       int smallnumber=0;
       int othernumber=0;
       
       for(int i=0;i<line.length();i++)
       {
    	   char ch=line.charAt(i);
    	   if(s1.indexOf(ch)!=-1)//indexof()����ĳ�ַ����ַ�����������λ�ã�������ַ������ڣ�����-1
    		   bignumber++;
    	   else if(s2.indexOf(ch)!=-1)
    		   smallnumber++;
    	   else 
    		   othernumber++;
       }
       
       System.out.println("���ַ����д�д��ĸ�ĸ���Ϊ"+bignumber);
       System.out.println("���ַ�����Сд��ĸ�ĸ���Ϊ"+smallnumber);
       System.out.println("���ַ����������ַ��ĸ���Ϊ"+othernumber);
		
	}

}
