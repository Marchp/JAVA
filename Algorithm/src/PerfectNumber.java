/**
 * 1-1000����
 * @author Marchp;
 * @name PerfectNumber;
 * @version 5 September 2017;
 * */
public class PerfectNumber {
	
	public  static void main(String [] args){
		int sum;
		for(int i=1;i<=1000;i++){
			sum=0;
			for(int j=1;j<i;j++){
				if(i%j==0)//i��jȡ�࣬�ܳ���j����i������
					sum=sum+j;
			}
				if(sum==i)
					System.out.println(i+" ");
		}
		System.out.println();
	}

}
