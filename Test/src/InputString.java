import java.util.Scanner;

public class InputString
{
	public static void main(String[] args) 
	{
		System.out.println(2.0-1.1);
		Scanner s=new Scanner(System.in);
		String str=null;
        System.out.println("请输入字符串：");
        str = s.next();
        System.out.println("您输入的是：");
        System.out.println(str);
        
        String a="Myfirstlove";
        String b=a.substring(3, 8);
        System.out.println(b);
        
        String c="YF";
        String d=a+c;
        System.out.println(d);
        
        
        
        
        		
	}
}