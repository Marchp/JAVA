
public class Operator 
{
	public static void main(String[]args)
	{
		int m=5;
		int n=5;
		//��һ����������߳���Ŀɶ���
		int x=4;
		int y=4;
		System.out.println("5++"+m+++"  " +"����������m:"+m);
		System.out.println("++5:"+ ++n+"  " +"����������n:"+n);
		//ǰ׺��ʽ�����㣻��׺��ʽʹ�ñ���ԭ����ֵ
		System.out.println("4--:"+x--  +"  " +"�Լ�������x:"+x);
		System.out.println("--4:"+--y  +"  " +"�Լ�������y:"+y);
		
		System.out.println(x!=0 && x==y);
		//&&�߼�������
		System.out.println(x<=y?"x="+x:"y="+y);
		//Ψһ��Ԫ�����  condition?expression1:expression2 ����Ϊ��ʱ�����һ�����ʽ������Ϊ��ʱ����ڶ���
		
	}

}
