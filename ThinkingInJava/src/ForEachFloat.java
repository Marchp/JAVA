import java.util.*;

public class ForEachFloat {
	public static void main(String [] args){
		//�����������ʱ����һ��seed������47�����Ա���ÿ������ʱ���������������ͬ��(ֻҪ��һ�����Ϳ��ԡ��ǲ���47����)
		Random r=new Random(47);
		float f[]=new float[10];
		for(int i=0;i<10;i++)
			f[i]=r.nextFloat();
		for(float x:f)//foreach�﷨������һ��float���͵ı���x�����������е�ÿһ�� f��ֵ��x
			System.out.println(x);		
		//foreach������������
		for(char c:"I am not your father".toCharArray())
			System.out.print(c+" ");		
	}

}
