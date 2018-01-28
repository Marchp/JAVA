import java.util.*;

public class judgechar {
	public static void main(String [] args)
	{
       Scanner s=new Scanner(System.in);
       System.out.println("请输入一个字符串：");
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
       
       System.out.println("该字符串中大写字母的个数为"+bignumber);
       System.out.println("该字符串中小写字母的个数为"+smallnumber);
       System.out.println("该字符串中其余字符的个数为"+othernumber);
		
	}

}
