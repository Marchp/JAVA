import java.lang.String;

public class TestString {
	public static void main(String [] args)
	{
		String s1="Hello";
		String s2="World";
		String s3="Hello";
		String s4=new String("abc");
		String s5=new String("abc");
		/*
		 == 表示两个变量的值是否相等，对于两个引用型变量比较的是变量在堆中存储的地址是否相等，而new出来相当于在堆地址中创建了不同地址的变量， 
		 equals方法用来比较两个独立对象的内容是否相同；*/
		System.out.println(s1.equals(s3));
		System.out.println(s1==s3);
		System.out.println(s4==s5);
		
		char c[]={'S','U','N',' ','J','A','V','A'};
		String s6=new String(c);
		String s7=new String(c,4,4);
		System.out.println(s6);
		System.out.println(s7);
		
		String s8="Cavaliers";
		String s9="cavaliers";
		System.out.println(s8.charAt(5));//charAt(int index)返回字符串中第index个字符
		System.out.println(s9.length());//Length()获取字符串长度
		System.out.println(s8.equalsIgnoreCase(s9));//忽略大小写比较两个字符串是否相等
		System.out.println(s8.indexOf("lier"));//返回子串在字符串中的位置的首个坐标
		System.out.println(s8.indexOf("Lier"));//如果不存在，返回-1	
	    System.out.println(s9.toUpperCase());
		
		
		
		String S1="我想学习java";
		System.out.println(S1.replace("我", "你"));
		
	}
}
