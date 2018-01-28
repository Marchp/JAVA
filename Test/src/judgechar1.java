import java.util.Scanner;

public class judgechar1 {
	public static void main(String [] args)
	{
       Scanner s=new Scanner(System.in);
       System.out.println("请输入一个字符串：");
       String line=s.nextLine();
       
       String s1="ABCDEFGHIJKLMNOPQRSTUVWXYZ";
       String s2="abcdefghijklmnopqrstuvwｘyz";
       
       int bignumber=0;
       int smallnumber=0;
       int othernumber=0;
       
       for(int i=0;i<line.length();i++)
       {
    	   char ch=line.charAt(i);
    	   if(s1.indexOf(ch)!=-1)//indexof()返回某字符在字符串中索引的位置，如果该字符不存在，返回-1
    		   bignumber++;
    	   else if(s2.indexOf(ch)!=-1)
    		   smallnumber++;
    	   else 
    		   othernumber++;
       }
       
       System.out.println("该字符串中大写字母的个数为"+bignumber);
       System.out.println("该字符串中小写字母的个数为"+smallnumber);
       System.out.println("该字符串中其余字符的个数为"+othernumber);
		
	}

}
