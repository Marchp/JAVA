import java.util.*;

public class HelloDate {
	public static void main(String [] args){
		System.out.println(new Date());//new Date() ��ȡ��ǰϵͳʱ�䡣����ʱ��
		System.out.println(new Date().toString());
		System.out.println(new Date().toGMTString());//�������α�׼ʱ��
		
		GregorianCalendar deadline1=new GregorianCalendar(2017,8,22);//�·�0��ʾһ��
		//Ϊ��������0��ʼ��ʾ�·ݵĻ�����ֱ��ʹ��Calendar.(�·�Ӣ��)��ʾ��Ӧ�·�
		GregorianCalendar deadline2=new GregorianCalendar(2017,Calendar.SEPTEMBER,22,11,52,52);//���嵽ʱ����
		GregorianCalendar deadline3=new GregorianCalendar(2017,Calendar.SEPTEMBER,22);
		System.out.println(deadline1.getTime());
		System.out.println(deadline2.getTime());
		System.out.println(deadline3.getTime());
		
		deadline3.set(Calendar.MONTH,Calendar.DECEMBER);//����������������
		deadline3.add(Calendar.DAY_OF_WEEK,1);//�·ݡ����ڡ���ݾ������ӻ��߼��٣�����������
		System.out.println(deadline3.getTime());
		
		
	}

}
