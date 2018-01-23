import java.util.Scanner;
/**
 * 辗转相除法求最大公约以及最小公倍数
 * @author Marchp;
 * @name Euclidean;
 * @version 5 September 2017;
 * */
public class Euclidean {

	public static void main(String [] args){
		
		int a,b,m,n;
		Scanner s=new Scanner(System.in);
		System.out.println("请输入两个正整数a和b:");
		a=s.nextInt();
		b=s.nextInt();
		
		CommonDivisor cd=new CommonDivisor();
		m=cd.CommmonDivisor(a, b);
		n=a*b/m;//最大公约数与最小公倍数的关系：ab=mn
		System.out.println("两个数的最大公约数为:"+m);
		System.out.println("两个数的最小公倍数为:"+n);
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

