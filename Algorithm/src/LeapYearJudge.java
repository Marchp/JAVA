import java.util.Scanner;
/**
 * 输入一个年份，判断是不是闰年
 * @author Marchp;
 * @name Demo2;
 * @version 5 may 2017;
 * */
public class LeapYearJudge {
	
	public static void main(String [] args)
	{
		/*
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");

		int year = sc.nextInt();
		if(year%4==0 && year%100!=0|| year%400==0)
		{
			System.out.println(year+"是闰年");
		}
		else
		    System.out.println(year+"不是闰年");
	    */
		Scanner sc = new Scanner(System.in);
		System.out.println("请输入年份：");

		int year = sc.nextInt();
		// 判断年份能否被4整除
		boolean isLeapYear = (year % 4 == 0);
		// 年份能被4整除，并且不能被100整除并且使用&&（and）
		isLeapYear = isLeapYear && (year % 100 != 0);
		// 年份或者能够被400整除
		isLeapYear = isLeapYear || (year % 400 == 0);
		if (isLeapYear) {
			System.out.println(year + "是闰年！");
		}
		else 
			System.out.println(year + "不是闰年！");

	}

}
