import java.util.Arrays;
import java.util.Random;

public class ArrayNew {
	public static void main(String [] args){
		int []a;
		Random  r=new Random(47);
		a=new int[r.nextInt(20)];
		System.out.println(a.length);
		//����Ļ������ͻ��Զ���ʼ���ɿ�ֵ���������ַ�����0������ֵ����false
		System.out.println(Arrays.toString(a));
	}

}
