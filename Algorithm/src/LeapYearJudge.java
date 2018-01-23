import java.util.Scanner;
/**
 * ����һ����ݣ��ж��ǲ�������
 * @author Marchp;
 * @name Demo2;
 * @version 5 may 2017;
 * */
public class LeapYearJudge {
	
	public static void main(String [] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");

		int year = sc.nextInt();
		if(year%4==0 && year%100!=0|| year%400==0)
		{
			System.out.println(year+"������");
		}
		else
		    System.out.println(year+"��������");
	    */
		Scanner sc = new Scanner(System.in);
		System.out.println("��������ݣ�");

		int year = sc.nextInt();
		// �ж�����ܷ�4����
		boolean isLeapYear = (year % 4 == 0);
		// ����ܱ�4���������Ҳ��ܱ�100��������ʹ��&&��and��
		isLeapYear = isLeapYear && (year % 100 != 0);
		// ��ݻ����ܹ���400����
		isLeapYear = isLeapYear || (year % 400 == 0);
		if (isLeapYear) {
			System.out.println(year + "�����꣡");
		}
		else 
			System.out.println(year + "�������꣡");

	}

}
