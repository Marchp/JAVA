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
		 == ��ʾ����������ֵ�Ƿ���ȣ��������������ͱ����Ƚϵ��Ǳ����ڶ��д洢�ĵ�ַ�Ƿ���ȣ���new�����൱���ڶѵ�ַ�д����˲�ͬ��ַ�ı����� 
		 equals���������Ƚ�������������������Ƿ���ͬ��*/
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
		System.out.println(s8.charAt(5));//charAt(int index)�����ַ����е�index���ַ�
		System.out.println(s9.length());//Length()��ȡ�ַ�������
		System.out.println(s8.equalsIgnoreCase(s9));//���Դ�Сд�Ƚ������ַ����Ƿ����
		System.out.println(s8.indexOf("lier"));//�����Ӵ����ַ����е�λ�õ��׸�����
		System.out.println(s8.indexOf("Lier"));//��������ڣ�����-1	
	    System.out.println(s9.toUpperCase());
		
		
		
		String S1="����ѧϰjava";
		System.out.println(S1.replace("��", "��"));
		
	}
}
