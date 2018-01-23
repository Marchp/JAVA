
public class Casting {
	public static void main(String [] args){
		int i=100;
		float lng=(float)i;
		float lng2=(float)200;
		i=(int)lng2;//变量也可进行数据类型转换
		System.out.println(lng);
		System.out.println(lng2);
		System.out.println(i);
		
		//浮点数转化为int时，直接进行结尾，若要进行舍入处理，需要利用Math.round()方法
		double a=0.7,b=0.4;
		float fa=0.7f,fb=0.4f;
		System.out.println("(int)a="+(int)a);
		System.out.println("(int)b="+(int)b);
		System.out.println("(int)fa="+(int)fa);
		System.out.println("(int)fb="+(int)fb);
		System.out.println("Math.round(a)="+Math.round(a));
		System.out.println("Math.round(b)="+Math.round(b));
		System.out.println("Math.round(fa)="+Math.round(fa));
		System.out.println("Math.round(fb)="+Math.round(fb));
		
		double c=a*fa;
		long d=i*2;
		System.out.println(c);
		System.out.println(d);
	}

}
