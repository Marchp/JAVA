
public class TestInteger {
	public static void main(String [] args){
		int i1=127;
		Integer i2=127;
		Integer i3=new Integer(127);
		System.out.println(i1==i2);//true Integer自动拆箱成int再比
		System.out.println(i1==i3);//true
		System.out.println(i2==i3);//false  内存地址不一样
		
		Integer i4=new Integer(127);
		Integer i5=128;
		Integer i6=128;
		Integer i7=127;
		System.out.println(i3==i4);//false 两个new integer不等
		//两个非new的integer，如果数值在-128-127之间，相等，否则，不相等
		System.out.println(i5==i6);//false
		System.out.println(i2==i7);//true		
	}
}
