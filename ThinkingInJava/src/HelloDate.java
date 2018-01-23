import java.util.*;

public class HelloDate {
	public static void main(String [] args){
		System.out.println(new Date());//new Date() 获取当前系统时间。北京时间
		System.out.println(new Date().toString());
		System.out.println(new Date().toGMTString());//格林尼治标准时间
		
		GregorianCalendar deadline1=new GregorianCalendar(2017,8,22);//月份0表示一月
		//为了消除从0开始表示月份的混淆，直接使用Calendar.(月份英文)表示对应月份
		GregorianCalendar deadline2=new GregorianCalendar(2017,Calendar.SEPTEMBER,22,11,52,52);//具体到时分秒
		GregorianCalendar deadline3=new GregorianCalendar(2017,Calendar.SEPTEMBER,22);
		System.out.println(deadline1.getTime());
		System.out.println(deadline2.getTime());
		System.out.println(deadline3.getTime());
		
		deadline3.set(Calendar.MONTH,Calendar.DECEMBER);//可以设置年月日起
		deadline3.add(Calendar.DAY_OF_WEEK,1);//月份、日期、年份均可增加或者减少，负数即减少
		System.out.println(deadline3.getTime());
		
		
	}

}
