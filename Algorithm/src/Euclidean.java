import java.util.Scanner;
/**
 * շת����������Լ�Լ���С������
 * @author Marchp;
 * @name Euclidean;
 * @version 5 September 2017;
 * */
public class Euclidean {

	public static void main(String [] args){
		
		int a,b,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("����������������a��b:");
		a=s.nextInt();
		b=s.nextInt();
		
		CommonDivisor cd=new CommonDivisor();
		m=cd.CommmonDivisor(a, b);
		n=a*b/m;//���Լ������С�������Ĺ�ϵ��ab=mn
		System.out.println("�����������Լ��Ϊ:"+m);
		System.out.println("����������С������Ϊ:"+n);
	}
}
	
	class CommonDivisor{
		public int CommmonDivisor(int x,int y){
			if(x>y){
				int t=x;
				x=y;
				y=t;
			}
			while(y!=0){
				if(x==y) return x;
				else{
					int k=x%y;
					x=y;
					y=k;
				}
			}
			return x;
		}	
	}

