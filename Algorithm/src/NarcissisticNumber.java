/**
 * 1-1000Ë®ÏÉ»¨Êý
 * @author Marchp;
 * @name NarcissisticNumber;
 * @version 5 September 2017;
 * */
public class NarcissisticNumber {
	public static void main(String [] args){
		
		for(int i=100;i<10000;i++){
			int a=i/100;
			int b=(i%100)/10;
			int c=(i%100)%10;
			if(i==a*a*a+b*b*b+c*c*c)
				System.out.println(i);
		}
	}

}
